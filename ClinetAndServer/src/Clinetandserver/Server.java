/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinetandserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Toshiba
 */
public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(" server class ");
        ServerSocket serversocket = new ServerSocket(1234);//burda gelen port yani  bu port serverin port  clinet baglainma icin kullaniyor  
        //   Socket socket=null;
        // while (!serversocket.isClosed()) {            
        Socket socket = serversocket.accept();// server acma  kanali 
        System.out.println("clinet is connected ");
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());//clinetden gelen mesaji icin almak
        System.out.println(objectInputStream.readObject().toString());//gelen  mesaji yazdiriyoruz
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());//yazdigimiz mesaj  gonderiyoruz 
        objectOutputStream.writeObject(" Hi I am the server ");
        //  }
        serversocket.close();
        socket.close();
    }

}
