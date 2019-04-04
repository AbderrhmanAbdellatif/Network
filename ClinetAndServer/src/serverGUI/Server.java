/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverGUI;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

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
            
            }
        }
    }
    public ServerSocket serverSocket;//server icin bir soket
    public ArrayList<SoketClinetThread> soketClinetThreads;// gelen clinet listisi
    public ListenServerThread listenServerThread;

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);//serve icin  port burada koyuyoruz
        soketClinetThreads = new ArrayList<SoketClinetThread>();//serverde ekleyecegimiz clinetler
    }

    public void StopServer() throws IOException {
        this.serverSocket.close();//server kaptmak icin
    }

    public void SendBrodacastMessade(Object object) throws IOException {
        for (int i = 0; i < soketClinetThreads.size(); i++) {
            soketClinetThreads.get(i).sendmesaj(object.toString());//her clint masaj gonderme 
        }
    }

}
