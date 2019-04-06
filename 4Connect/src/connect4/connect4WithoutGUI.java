/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class connect4WithoutGUI {

    String[][] board = {
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
        for (int i = 0; i < board.length; i++) {//satirlar icin 
            for (int j = 0; j < board.length; j++) {//kolumlar icin
                if (board[i][j] == null) {
                    System.out.print(" | " + " ");
                } else {
                    System.out.print("| " + board[i][j] + " ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("-------------------------");
        System.out.println("| 1   2   3   4   5   6 |");
        System.out.println("-------------------------");
    }

    public void place_item(int column, String letter) {//hangi kolum  ve o zamandaki  oyuncu harfi  girecek    
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][column] == " ") {// kolun bos ise 
                board[i][column] = letter;
                check_winner(i, column, letter);
                break;
            }
        }
    }

    public void check_winner(int row, int column, String letter) {//4 oldugu zaman bu  fonksiyon gidiyor
        if (check_column(column, letter) || check_row(row, letter)
                || check_downward_diagonal() || check_upward_diagonal()) {
            control = true; // oyun bitigini 
        }
    }

    public boolean check_column(int column, String letter) {
        int cnt = 0;

        for (int i = 0; i < 6; i++) {//her satir gezme 
            if (board[i][column].equals(letter)) {//4 tane yanin yana olup olmadigini konturl ediyor
                cnt++;
                if (cnt == 4) {//eger  4 tane yanan cikiyor  
                    break;
                } else {
                    return false;
                }
            }
        }
        if (cnt == 4) {
            return true;
        } else {
            return false;
        }
    }

    public boolean check_row(int row, String letter) { // ayina kolumdaki matigi

        int count = 0;

        for (int i = 0; i < 6; i++) {
            if (board[row][i].equals(letter)) {
                count++;
                if (count == 4) {
                    break;
                }
            } else {
                count = 0;
            }
        }

        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }

    public boolean check_downward_diagonal() {

        boolean check = false;

        for (int row = 0; row < board.length - 3; row++) {
            for (int column = 0; column < board[row].length - 3; column++) {
                if (board[row][column] != " "
                        && board[row][column] == board[row + 1][column + 1]
                        && board[row][column] == board[row + 2][column + 2]
                        && board[row][column] == board[row + 3][column + 3]) {
                    check = true;
                }
            }
        }
        return check;
    }

    public boolean check_upward_diagonal() {

        boolean check = false;

        for (int row = 0; row < board.length - 3; row++) {
            for (int column = 3; column < board[row].length; column++) {
                if (board[row][column] != " "
                        && board[row][column] == board[row + 1][column - 1]
                        && board[row][column] == board[row + 2][column - 2]
                        && board[row][column] == board[row + 3][column - 3]) {
                    check = true;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        connect4WithoutGUI connect_4 = new connect4WithoutGUI();
        connect_4.show_board();
        Scanner input1, input2, player1, player2;
        System.out.println("\nWelcome to Connect 4. Hope you enjoy the game.\n");
        player1 = new Scanner(System.in);
        player2 = new Scanner(System.in);
        System.out.print("Enter player 1 name :  ");
        String player_1 = player1.next();
        System.out.print("Enter player 2 name :  ");
        String player_2 = player2.next();

        while (true) {

            System.out.println();
            System.out.print(player_1 + ", your symbol is 'O'. Enter column you want to mark : ");
            input1 = new Scanner(System.in);
            int column = input1.nextInt();
            while (column > 6 || column < 1) {//eger fazla colum girirse
                System.out.print("Please enter valid column: ");
                column = input1.nextInt();
            }

            connect_4.place_item(column - 1, "O");
            connect_4.show_board();

            if (connect_4.control == true) {
                System.out.println();
                System.out.println(player_1 + " has won the game !!!! ");
                break;
            }

            System.out.println();
            System.out.print(player_2 + ", your symbol is 'X'. Enter column you want to mark : ");
            input2 = new Scanner(System.in);
            int column2 = input2.nextInt();
            while (column2 > 6 || column2 < 1) {
                System.out.print("Please enter valid column: ");
                column2 = input2.nextInt();
            }

            connect_4.place_item(column2 - 1, "X");
            connect_4.show_board();

            if (connect_4.control == true) {
                if (connect_4.control== true) {
                    System.out.println();
                    System.out.println(player_2 + " has won the game !!!! ");
                    break;
                }
            }

        }
    }
}

    
