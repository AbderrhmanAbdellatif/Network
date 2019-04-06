/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Toshiba
 */
public class connect4WithoutGUI {

    String[][] Bord = {
        {" ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " "}
    };

    boolean control = false;

    public void show_board() {
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("|    Connect 4  Game    |");
        System.out.println("-------------------------");
        for (int i = 0; i < Bord.length; i++) {//satirlar icin 
            for (int j = 0; j < Bord.length; j++) {//kolumlar icin
                if (Bord[i][j] == null) {
                    System.out.print(" | " + " ");
                } else {
                    System.out.print("| " + Bord[i][j] + " ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        connect4WithoutGUI connect4Game = new connect4WithoutGUI();
        connect4Game.show_board();
    }
}
