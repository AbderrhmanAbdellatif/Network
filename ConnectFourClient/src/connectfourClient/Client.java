package connectfourClient;

import static connectfourClient.Client.changeImage;
import static connectfourClient.Client.sInput;
import game.Game;
import game.Message;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; 

/**
 *
 * @author ahmet
 */
class Listen extends Thread {

    public void run() {
        //soket bağlı olduğu sürece dön
        while (Client.socket.isConnected()) {
            try {
                //mesaj gelmesini bloking olarak dinyelen komut
                Message received = (Message) (sInput.readObject());
                //mesaj gelirse bu satıra geçer
                //mesaj tipine göre yapılacak işlemi ayır.
                switch (received.type) {
                    case Name:
                        break;
                    case RivalConnected:
                        Game.ThisGame.Table.setVisible(true);
                        String name = received.content.toString();
                         Game.ThisGame.rival_Name.setText(name);
                       // Game.ThisGame.tmr_slider.start();
                        break;
                    case Coordination:
                        int [] x= (int[]) received.content;
                        changeImage(x);
                        Game.ThisGame.click=true;
                          /*int s[] = (int[])received.content;
                            System.out.println("Gelen==>  "+s[0]+"   "+s[1]);*/
                    case Disconnect:
                        break;
                    case Win:
                        int input=0;
                        if((boolean)received.content)
                           input= JOptionPane.showOptionDialog(Game.ThisGame.Table, "TEBRİKLER\nKazandınız...", "Game Over", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                        if(input == JOptionPane.OK_OPTION || input==JOptionPane.CANCEL_OPTION)
                            System.exit(0);
                        break;
                    case Lose:
                        int input1=0;
                        if((boolean)received.content)
                           input1= JOptionPane.showOptionDialog(Game.ThisGame.Table, "Kaybettiniz...", "Game Over", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                        if(input1 == JOptionPane.OK_OPTION || input1==JOptionPane.CANCEL_OPTION)
                            System.exit(0);
                        break;
                    case UserNumber:
                        Client.UserNumber=(int) received.content;
                        break;
                    case Bitis:
                        break;
                }
                received=null;
            } catch (IOException ex) {

                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                //Client.Stop();
                break;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                //Client.Stop();
                break;
            }
        }

    }
}

public class Client {

    //her clientın bir soketi olmalı
    public static Socket socket;
    public static int UserNumber;
    
    //verileri almak için gerekli nesne
    public static ObjectInputStream sInput;
    //verileri göndermek için gerekli nesne
    public static ObjectOutputStream sOutput;
    //serverı dinleme thredi 
    public static Listen listenMe;

    public static void Start(String ip, int port) {
        try {
            // Client Soket nesnesi
            Client.socket = new Socket(ip, port);
            Client.Display("Servera bağlandı");
            // input stream
            Client.sInput = new ObjectInputStream(Client.socket.getInputStream());
            // output stream
            Client.sOutput = new ObjectOutputStream(Client.socket.getOutputStream());
            Client.listenMe = new Listen();
            Client.listenMe.start();

            //ilk mesaj olarak isim gönderiyorum
            Message msg = new Message(Message.Message_Type.Name);
            msg.content = Game.ThisGame.Username.getText();
            Client.Send(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //client durdurma fonksiyonu
    public static void Stop() {
        try {
            if (Client.socket != null) {
                Client.listenMe.stop();
                Client.socket.close();
                Client.sOutput.flush();
                Client.sOutput.close();

                Client.sInput.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void changeImage(int[] coordination) {
        switch (coordination[0]) {
            case 0:
                switch (coordination[1]) {
                    case 0:
                        Game.TableMatrix[0][0]= -1;
                        Game.ThisGame.L00.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 1:
                        Game.TableMatrix[0][1]= -1;
                        Game.ThisGame.L01.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 2:
                        Game.TableMatrix[0][2]= -1;
                        Game.ThisGame.L02.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 3:
                        Game.TableMatrix[0][3]= -1;
                        Game.ThisGame.L03.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 4:
                        Game.TableMatrix[0][4]= -1;
                        Game.ThisGame.L04.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 5:
                        Game.TableMatrix[0][5]= -1;
                        Game.ThisGame.L05.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 6:
                        Game.TableMatrix[0][6]= -1;
                        Game.ThisGame.L06.setIcon(Game.ThisGame.icon_rival);
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                switch (coordination[1]) {
                    case 0:
                        Game.TableMatrix[1][0]= -1;
                        Game.ThisGame.L10.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 1:
                        Game.TableMatrix[1][1]= -1;
                        Game.ThisGame.L11.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 2:
                        Game.TableMatrix[1][2]= -1;
                        Game.ThisGame.L12.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 3:
                        Game.TableMatrix[1][3]= -1;
                        Game.ThisGame.L13.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 4:
                        Game.TableMatrix[1][4]= -1;
                        Game.ThisGame.L14.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 5:
                        Game.TableMatrix[1][5]= -1;
                        Game.ThisGame.L15.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 6:
                        Game.TableMatrix[1][6]= -1;
                        Game.ThisGame.L16.setIcon(Game.ThisGame.icon_rival);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (coordination[1]) {
                    case 0:
                        Game.TableMatrix[2][0]= -1;
                        Game.ThisGame.L20.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 1:
                        Game.TableMatrix[2][1]= -1;
                        Game.ThisGame.L21.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 2:
                        Game.TableMatrix[2][2]= -1;
                        Game.ThisGame.L22.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 3:
                        Game.TableMatrix[2][3]= -1;
                        Game.ThisGame.L23.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 4:
                        Game.TableMatrix[2][4]= -1;
                        Game.ThisGame.L24.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 5:
                        Game.TableMatrix[2][5]= -1;
                        Game.ThisGame.L25.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 6:
                        Game.TableMatrix[2][6]= -1;
                        Game.ThisGame.L26.setIcon(Game.ThisGame.icon_rival);
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (coordination[1]) {
                    case 0:
                        Game.TableMatrix[3][0]= -1;
                        Game.ThisGame.L30.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 1:
                        Game.TableMatrix[3][1]= -1;
                        Game.ThisGame.L31.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 2:
                        Game.TableMatrix[3][2]= -1;
                        Game.ThisGame.L32.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 3:
                        Game.TableMatrix[3][3]= -1;
                        Game.ThisGame.L33.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 4:
                        Game.TableMatrix[3][4]= -1;
                        Game.ThisGame.L34.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 5:
                        Game.TableMatrix[3][5]= -1;
                        Game.ThisGame.L35.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 6:
                        Game.TableMatrix[3][6]= -1;
                        Game.ThisGame.L36.setIcon(Game.ThisGame.icon_rival);
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch (coordination[1]) {
                    case 0:
                        Game.TableMatrix[4][0]= -1;
                        Game.ThisGame.L40.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 1:
                        Game.TableMatrix[4][1]= -1;
                        Game.ThisGame.L41.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 2:
                        Game.TableMatrix[4][2]= -1;
                        Game.ThisGame.L42.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 3:
                        Game.TableMatrix[4][3]= -1;
                        Game.ThisGame.L43.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 4:
                        Game.TableMatrix[4][4]= -1;
                        Game.ThisGame.L44.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 5:
                        Game.TableMatrix[4][5]= -1;
                        Game.ThisGame.L45.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 6:
                        Game.TableMatrix[4][6]= -1;
                        Game.ThisGame.L46.setIcon(Game.ThisGame.icon_rival);
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                switch (coordination[1]) {
                    case 0:
                        Game.TableMatrix[5][0]= -1;
                        Game.ThisGame.L50.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 1:
                        Game.TableMatrix[5][1]= -1;
                        Game.ThisGame.L51.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 2:
                        Game.TableMatrix[5][2]= -1;
                        Game.ThisGame.L52.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 3:
                        Game.TableMatrix[5][3]= -1;
                        Game.ThisGame.L53.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 4:
                        Game.TableMatrix[5][4]= -1;
                        Game.ThisGame.L54.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 5:
                        Game.TableMatrix[5][5]= -1;
                        Game.ThisGame.L55.setIcon(Game.ThisGame.icon_rival);
                        break;
                    case 6:
                        Game.TableMatrix[5][6]= -1;
                        Game.ThisGame.L56.setIcon(Game.ThisGame.icon_rival);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

    }

    public static void Display(String msg) {

        System.out.println(msg);

    }

    //mesaj gönderme fonksiyonu
    public static void Send(Message msg) {
        try {
            Client.sOutput.writeObject(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
