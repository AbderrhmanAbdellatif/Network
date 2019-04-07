/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

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
public class Clinet {
    
    public class ListenClientThread extends Thread {
        
        private Clinet clinet;
        
        public ListenClientThread(Clinet clinet) {
            this.clinet = clinet;
        }
        
        @Override
        public void run() {
            while (socket.isConnected()) {
                try {
                    ClinetGUI.dlm.addElement(clinet.objectInputStream.readObject());
                } catch (IOException ex) {
                    Logger.getLogger(Clinet.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Clinet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private Socket socket;
    private String ip;
    private int port;
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;
    
    public Clinet(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
    
    public void StartClinet()  {
      
        try {
            socket = new Socket(this.ip, this.port);//clinet ip ve port icin
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());// gonderlien mesaj icin
            objectInputStream = new ObjectInputStream(socket.getInputStream());// gelen mesaj 
             ListenClientThread listenClientThread = new ListenClientThread(this);
            listenClientThread.start();
        
        } catch (IOException ex) {
            Logger.getLogger(Clinet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void closeClient() throws IOException {
        socket.close();
    }
    
    public void MesajGonder(int string) throws IOException {
        objectOutputStream.writeObject(string);
    }
    
}
