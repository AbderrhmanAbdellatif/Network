/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinetandserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class SoketClinetThread {

    public class ListenClinetThread extends Thread {

        private SoketClinetThread clinetThread; //her clinet geldiginde 

        public ListenClinetThread(SoketClinetThread clinetThread) {//object yapici 
            this.clinetThread = clinetThread;
        }

        /*
        The first way to specify what code a thread is to run,
        is to create a subclass of Thread and override the run() method.
        The run() method is what is executed by the thread after you call start(). 
        Here is an example of creating a Java Thread subclass:
         */
        public void run() {
            while (this.clinetThread.socket.isConnected()) {
                try {
                    //clinet geldiyse
                    Object mesaj = this.clinetThread.inputStream.readObject();
                    System.out.println(" Hi " + mesaj.toString());
                } catch (IOException ex) {
                    Logger.getLogger(SoketClinetThread.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SoketClinetThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static int clinetNo = 0;//clinet sayilarini ogrenmek icin
    int no;//geldi clinet numarasi 
    Socket socket; // gelen  soket icin
    ObjectInputStream inputStream;// gelen mesaj mesaj icin
    ObjectOutputStream outputStream;// gonderilen mesaj icin
    ListenClinetThread listenClinetThread;// clinet thread

    public SoketClinetThread(Socket socket) throws IOException {
        SoketClinetThread.clinetNo++;//clinetlerini sayisi icin
        this.no = SoketClinetThread.clinetNo;//simdiki clinet Numarasi icin
        this.inputStream = new ObjectInputStream(socket.getInputStream());// gelen mesaj icin
        this.outputStream = new ObjectOutputStream(socket.getOutputStream());//gondeilen mesaj icin
        this.listenClinetThread = new ListenClinetThread(this);// gelen client  buraya bagladik
        this.listenClinetThread.start();//To start the Java thread you will call its start() method

    }

    public void sendmesaj(String mesaj) throws IOException {
        this.outputStream.writeObject(mesaj);// gelen mesaj gondermek  icin
    }
    //ref :http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html

}
