/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p2pserver;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INSECT
 */

public class Server{

    //server soketi eklemeliyiz
    public static ServerSocket serverSocket;
    // Serverın dileyeceği port
    public static int port = 0;

    public static void Start(int openport) {
		final GpioController gpio = GpioFactory.getInstance(); //pinleri tanımlama 
		final GpioPinDigitalOutput out0 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, PinState.LOW);
        	final GpioPinDigitalOutput out2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, PinState.LOW);
		final GpioPinDigitalOutput out3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, PinState.LOW);
        	final GpioPinDigitalOutput out4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, PinState.LOW);

            try {
                Server.port = openport;
                // serversoket nesnesi
                Server.serverSocket = new ServerSocket(Server.port);
                
                while (true) {
                Server.Display("Client Bekleniyor...");

                Socket clientSocket = Server.serverSocket.accept();

                Server.Display("Client Geldi...");

                ObjectOutputStream sOutput = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream sInput = new ObjectInputStream(clientSocket.getInputStream());

                sOutput.writeObject("Server:Hosgeldin");
                
                String message = sInput.readObject().toString(); 
                //Server.Display();
                
                if(message!=null && message.equals("İleri gidiyor")){
                    out0.high();
		    out4.high();
		    out2.low();
    	            out3.low();
			}
                else if(message!=null && message.equals("Geri gidiyor")){
                    out0.low();
		    out4.low();
		    out2.high();
    	            out3.high();
                }
            }

            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public static void Display(String msg) {

        System.out.println(msg);

    }

}