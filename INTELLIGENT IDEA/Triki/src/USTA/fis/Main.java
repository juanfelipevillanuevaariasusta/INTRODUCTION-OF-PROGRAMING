package USTA.fis;

import javax.swing.*;

public class Main {
    private static Triki_Data myTriki;

    public static void main(String[] args) {

        char[][] placesvalue;

        myTriki = new Triki_Data();

        String value2 = "", showinfo, row = "", column = "", value, value3 = "";
        int Confirm;
        boolean m1=true;

        JOptionPane.showMessageDialog(null, "Maker's: Juan Felipe Villanueva \n Code: 2314028 \n Ingenieria de Sistemas", "Hi, Welcome to triki :>", JOptionPane.WARNING_MESSAGE);
        //1) Solicitar al jugador si va a jugar en 3x3 o en 5x5
        value2 = JOptionPane.showInputDialog("First, please choose the game that you want to use \n 1) if you wanna play in a 3x3 table \n 2) if you wanna play in a 5x5 table", JOptionPane.INFORMATION_MESSAGE);
        if (Integer.parseInt(value2) != 1 || Integer.parseInt(value2) != 2) {
            JOptionPane.showMessageDialog(null, "Sorry but you only can type a value whit option [1] or [2]", "ERROR 53", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Perfect");
        }
        //3) Pedir al jugador si va a ser x o y/**/
        value = JOptionPane.showInputDialog(null, "Now please choose what player will be the (X) and what player will be (O) \n remember that the player that choose the (X) will start the game. \n type 1 for [X] \n type 2 for [O]", JOptionPane.INFORMATION_MESSAGE);
        if (Integer.parseInt(value)==2){
            JOptionPane.showMessageDialog(null, "Ok, the first player start");
        }else{
            JOptionPane.showMessageDialog(null, "Ok, Please start");
        }
        myTriki.createplacesArray(value2);
        myTriki.initPlacesArray();
        showinfo = myTriki.ArrayToShow();
        JOptionPane.showMessageDialog(null, showinfo);
        do {
            //4) Pedir la ubicacion de (X o O) y evaluar si se puede coloar en esa casilla del arreglo

                row = JOptionPane.showInputDialog("Please put your variable for a 'x' ");
                column = JOptionPane.showInputDialog("Please put your variable for a 'y'");
                showinfo = myTriki.fillplaces(row, column,m1);
                JOptionPane.showMessageDialog(null, showinfo);
                JOptionPane.showMessageDialog(null, "Next Player", "NEXT", JOptionPane.WARNING_MESSAGE);
                showinfo = myTriki.ArrayToShow();
                JOptionPane.showMessageDialog(null, showinfo);
                if (m1==false) {
                    m1 = true;
                }else {
                    m1=false;
                }

            Confirm=JOptionPane.showConfirmDialog(null, "wanna you end the game?");
        } while (Confirm == JOptionPane.NO_OPTION);
        //6)
            showinfo = myTriki.Spaces();
            JOptionPane.showMessageDialog(null, showinfo);
    }
}