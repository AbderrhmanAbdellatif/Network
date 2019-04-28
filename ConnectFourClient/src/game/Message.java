/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author ahmet
 */
public class Message implements java.io.Serializable {
    public static enum Message_Type {None, Name, Disconnect,RivalConnected, Win,Lose, Selected, Bitis,Start,UserNumber,Coordination}
    
    public Message_Type type;
    public Object content;
    public Message(Message_Type t)
    {
        this.type=t;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
