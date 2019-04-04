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
import java.util.ArrayList;

/**
 *
 * @author Toshiba
 */
public class Server {
    
    public static ServerSocket serverSocket;// server port numarasi 
    public static Socket clinetSocket;//clinet port ve ip 
    public static ArrayList<SoketClinetThread> clinetList;//clinetleri  sayisi icin

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(" server class ");
        // ServerSocket serversocket = new ServerSocket(1234);//burda gelen port yani  bu port serverin port  clinet baglainma icin kullaniyor  
        //   Socket socket=null;
        // while (!serversocket.isClosed()) {            
        serverSocket = new ServerSocket(1234);
        clinetList = new ArrayList<SoketClinetThread>();
        while (!serverSocket.isClosed()) {
            clinetSocket = serverSocket.accept(); 
            System.out.println("clinet is connected ");
            SoketClinetThread newclinet = new SoketClinetThread(clinetSocket);// burada  gelen  soket ile clinet bilgisi aliyoruz
            clinetList.add(newclinet); // gelen  clinetleri icin ayir bir array ekliyoruz
            System.out.println(" bir clinet bagladi");
            newclinet.sendmesaj(newclinet.no +" . clinet geldi ");
        }

        //  }
        serverSocket.close();
        clinetSocket.close();
    }
    
}
