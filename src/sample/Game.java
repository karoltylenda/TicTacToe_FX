package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class Game {
    private char ch = 'X';

    public char getCh() {
        return ch;
    }

    public void setCh() {
        if (ch == 'X'){
            this.ch = 'O';
        }
        else if (ch == 'O'){
            this.ch = 'X';
        }
    }

    public int freeCells=9;

    public char[][] tabChar = new char[][]{{'E','E','E'},{'E','E','E'},{'E','E','E'}};

    public void whoIsWon(){
        Controller cont = new Controller();
        if ((tabChar[0][0] == 'X' && tabChar[0][1] == 'X' && tabChar[0][2] == 'X') || (tabChar[0][0] == 'O' && tabChar[0][1] == 'O' && tabChar[0][2] == 'O')){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Wygrał gracz: "+tabChar[0][0], ButtonType.OK );
            alert.show();
        }
        else if ((tabChar[1][0] == 'X' && tabChar[1][1] == 'X' && tabChar[1][2] == 'X') || (tabChar[1][0] == 'O' && tabChar[1][1] == 'O' && tabChar[1][2] == 'O')){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Wygrał gracz: "+tabChar[1][0], ButtonType.OK );
            alert.show();
        }
        else if ((tabChar[2][0] == 'X' && tabChar[2][1] == 'X' && tabChar[2][2] == 'X') || (tabChar[2][0] == 'O' && tabChar[2][1] == 'O' && tabChar[2][2] == 'O')){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Wygrał gracz: "+tabChar[2][0], ButtonType.OK );
            alert.show();
        }
        else if ((tabChar[0][0] == 'X' && tabChar[1][0] == 'X' && tabChar[2][0] == 'X') || (tabChar[0][0] == 'O' && tabChar[1][0] == 'O' && tabChar[2][0] == 'O')){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Wygrał gracz: "+tabChar[0][0], ButtonType.OK );
            alert.show();
        }
        else if ((tabChar[0][1] == 'X' && tabChar[1][1] == 'X' && tabChar[2][1] == 'X') || (tabChar[0][1] == 'O' && tabChar[1][1] == 'O' && tabChar[2][1] == 'O')){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Wygrał gracz: "+tabChar[1][1], ButtonType.OK );
            alert.show();
        }
        else if ((tabChar[0][2] == 'X' && tabChar[1][2] == 'X' && tabChar[2][2] == 'X') || (tabChar[0][2] == 'O' && tabChar[1][2] == 'O' && tabChar[2][2] == 'O')){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Wygrał gracz: "+tabChar[2][2], ButtonType.OK );
            alert.show();
        }
        else if ((tabChar[0][0] == 'X' && tabChar[1][1] == 'X' && tabChar[2][2] == 'X') || (tabChar[0][0] == 'O' && tabChar[1][1] == 'O' && tabChar[2][2] == 'O') ||
                (tabChar[2][0] == 'X' && tabChar[1][1] == 'X' && tabChar[0][2] == 'X') || (tabChar[2][0] == 'O' && tabChar[1][1] == 'O' && tabChar[0][2] == 'O')){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Wygrał gracz: "+tabChar[1][1], ButtonType.OK );
            alert.show();
        }
        else if(freeCells == 0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "REMIS!!!", ButtonType.OK );
            alert.show();
        }
    }

}
