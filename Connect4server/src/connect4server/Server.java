/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4server;

import game.Message;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Array;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
class ServerThread extends Thread {

    public void run() {
        while (!Server.serverSocket.isClosed()) {
            try {
                Server.Display(" clinet is wait ");
                Socket clinetSocket = Server.serverSocket.accept();
                Server.Display(" Clinet is came ");
                SClient nclient = new SClient(clinetSocket, Server.IDClinet);//gelen clinet socketi ve idi olusturuyorum
                Server.IDClinet++;
                Server.arrayListofclinet.add(nclient);
                nclient.listenThread.start();// o clinetten bir mesaj gelidiginde algiiyoru
            } catch (IOException ex) {
                Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

public class Server {

    public static ServerSocket serverSocket;
    public static int IDClinet = 0;
    public static int port = 0;
    public static ServerThread serverThread;
    public static ArrayList<SClient> arrayListofclinet = new ArrayList();
    public static Semaphore pairtwo = new Semaphore(1, true); //birden cok clinet kirtik bogleyi girecek demektir 

    public static void Start(int port) {
        try {
            Server.port = port;
            Server.serverSocket = new ServerSocket(Server.port);
            Server.serverThread = new ServerThread();
            Server.serverThread.start();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Display(String msg) {

        System.out.println(msg);
    }
     public static void Send(SClient cl, Message msg) { //bili bir clintte mesaj gonderebilim
         cl.sOutput.writeObject(msg);

    }
}
