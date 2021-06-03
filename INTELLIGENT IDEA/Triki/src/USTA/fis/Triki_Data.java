package USTA.fis;

import javax.swing.*;

public class Triki_Data {
    private char[][] TrikiMatrix;
    private String filedPlaces;
    private String returnStrin;
    private boolean win;

    public void createplacesArray(String Option) {
        int row;
        int column;
        int OptionInt = Integer.parseInt(Option);
        if (OptionInt == 1) {
            row = 3;
            column = 3;
        } else {
            row = 5;
            column = 5;
        }
        TrikiMatrix = new char[row][column];
    }

    public void initPlacesArray() {
        for (int i = 0; i < TrikiMatrix.length; i++) {
            for (int j = 0; j < TrikiMatrix[0].length; j++) {

                TrikiMatrix[i][j] = '_';
            }
        }
    }

    public String ArrayToShow() {
        String returnString = "";
        for (int i = 0; i < TrikiMatrix.length; i++) {
            for (int j = 0; j < TrikiMatrix[0].length; j++) {
                returnString = returnString + TrikiMatrix[i][j] + " ";
            }
            returnString = returnString + "\n";
        }
        return returnString;
    }

    public String fillplaces(String row, String columns,boolean m1) {
        int rowInt = Integer.parseInt(row);
        int columnInt = Integer.parseInt(columns);
        String h ="";
                if (m1) {
                    if (TrikiMatrix[rowInt][columnInt] == 'X' || TrikiMatrix[rowInt][columnInt] == 'O') {
                        h= "the please is already used";
                    } else {
                        TrikiMatrix[rowInt][columnInt] = 'X';
                        h= "the place suseccsfully filled";
                    }
                }
                if (!m1) {
                    if (TrikiMatrix[rowInt][columnInt] == 'X' || TrikiMatrix[rowInt][columnInt] == 'O') {
                        h= "the please is already used";
                    } else {
                        TrikiMatrix[rowInt][columnInt] = 'O';
                        h= "the place suseccsfully filled";
                    }
                }
        return h;
    }
    public String Spaces(){
        int Spaces=0;
        for (int i = 0; i < TrikiMatrix.length; i++) {
            for (int j = 0; j < TrikiMatrix[0].length; j++) {
                if (TrikiMatrix[i][j]=='_'){
                    Spaces++;
                }
            }
        }
        return "And the Total Empty spaces is:"+Spaces;
    }
}
//if (TrikiMatrix[0][0] == 'X' && TrikiMatrix[0][1] == 'X' && TrikiMatrix[0][2] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player Os the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[0][0] == 'O' && TrikiMatrix[0][1] == 'O' && TrikiMatrix[0][2] == 'O') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[0][2] == 'X' && TrikiMatrix[0][3] == 'X' && TrikiMatrix[0][4] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player one is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[0][2] == 'O' && TrikiMatrix[0][3] == 'O' && TrikiMatrix[0][4] == 'O') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[1][0] == 'X' && TrikiMatrix[1][1] == 'X' && TrikiMatrix[1][2] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player one is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[1][0] == 'O' && TrikiMatrix[1][1] == 'O' && TrikiMatrix[1][2] == 'O') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[1][2] == 'X' && TrikiMatrix[1][3] == 'X' && TrikiMatrix[1][4] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player one is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[1][2] == 'O' && TrikiMatrix[1][3] == 'O' && TrikiMatrix[1][4] == 'O') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[2][0] == 'X' && TrikiMatrix[2][1] == 'X' && TrikiMatrix[2][2] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player one is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[2][0] == 'O' && TrikiMatrix[2][1] == 'O' && TrikiMatrix[2][2] == 'O') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[2][2] == 'X' && TrikiMatrix[2][3] == 'X' && TrikiMatrix[2][4] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player one is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[2][2] == 'O' && TrikiMatrix[2][3] == 'O' && TrikiMatrix[2][4] == 'O') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[3][0] == 'X' && TrikiMatrix[3][1] == 'X' && TrikiMatrix[3][2] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player one is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[3][0] == 'O' && TrikiMatrix[3][1] == 'O' && TrikiMatrix[3][2] == 'O') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[3][2] == 'X' && TrikiMatrix[3][3] == 'X' && TrikiMatrix[3][4] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player one is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[3][2] == 'O' && TrikiMatrix[3][3] == 'O' && TrikiMatrix[3][4] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[4][0] == 'X' && TrikiMatrix[4][1] == 'X' && TrikiMatrix[4][2] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player one is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[4][0] == 'O' && TrikiMatrix[4][1] == 'O' && TrikiMatrix[4][2] == 'O') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[4][2] == 'X' && TrikiMatrix[4][3] == 'X' && TrikiMatrix[4][4] == 'X') {
//                    JOptionPane.showMessageDialog(null, "The player one is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }
//                if (TrikiMatrix[4][2] == 'O' && TrikiMatrix[4][3] == 'O' && TrikiMatrix[4][4] == 'O') {
//                    JOptionPane.showMessageDialog(null, "The player TWO is the winner", "WINNER!!", JOptionPane.WARNING_MESSAGE);
//                }