/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class Server {
    
    public class ListenServerThread extends Thread {
        
        private Server server;
        
        public ListenServerThread(Server server) {
            this.server = server;
        }
        
        @Override
        public void run() {
            while (!this.server.serverSocket.isClosed()) {
                try {
                    Socket socket = this.server.serverSocket.accept();
                    SoketClinetThread clinetThread = new SoketClinetThread(socket);
                    this.server.soketClinetThreads.add(clinetThread);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public ServerSocket serverSocket;//server icin bir soket
    public ArrayList<SoketClinetThread> soketClinetThreads;// gelen clinet listisi
    public ListenServerThread listenServerThread;
    
    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);//serve icin  port burada koyuyoruz
            soketClinetThreads = new ArrayList<SoketClinetThread>();//serverde ekleyecegimiz clinetler
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void StopServer()  {
        try {
            this.serverSocket.close();//server kaptmak icin
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Startserver()  {
        this.listenServerThread = new ListenServerThread(this);
        this.listenServerThread.start();
           
    }
    
    public void SendMessade(Object mesaj, SoketClinetThread clinetThread) {
        try {
            clinetThread.sendmesaj(mesaj.toString());
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SendBrodacastMessade(Object object) throws IOException {
        for (int i = 0; i < soketClinetThreads.size(); i++) {
            soketClinetThreads.get(i).sendmesaj(object.toString());//her clint masaj gonderme 
        }
    }
    
}
