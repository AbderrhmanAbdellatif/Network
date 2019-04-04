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
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        System.out.println(" Clinet  class ");
        Socket socket = new Socket("127.0.0.1", 1234); // ip + port numarasi cunku server ile baglamak istiyor eger ayina port numara lazim ki server ile baglariz   
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject("Hi I am the clinet ");
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        Scanner input = new Scanner(System.in);
        while (!socket.isConnected()) {
            String mesaj = input.nextLine();
            objectOutputStream.writeObject(mesaj);
        }
        System.out.println(objectInputStream.readObject().toString());
        socket.close();
    }

}
