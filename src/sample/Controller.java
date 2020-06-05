package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Controller {
    private Game game = new Game();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private StackPane stackPane;

    @FXML
    private GridPane gridPane;

    @FXML
    private Button onePlayerButton;

    @FXML
    private Button twoPlayerButton;

    @FXML
    private Button button00;

    @FXML
    private Button button01;

    @FXML
    private Button button02;

    @FXML
    private Button button11;

    @FXML
    private Button button10;

    @FXML
    private Button button12;

    @FXML
    private Button button20;

    @FXML
    private Button button21;

    @FXML
    private Button button22;

    @FXML
    void button00Click(MouseEvent event) {
        if (game.tabChar[0][0] == 'X' || game.tabChar[0][0] == 'O') {
            alertText();
        }
        else {
            button00.setText(String.valueOf(game.getCh()));
            game.tabChar[0][0] = game.getCh();
            game.setCh();
            game.freeCells--;
        }
        game.whoIsWon();
    }

    @FXML
    void button01Click(MouseEvent event) {
        if (game.tabChar[0][1] == 'X' || game.tabChar[0][1] == 'O') {
            alertText();
        }
        else {
            button01.setText(String.valueOf(game.getCh()));
            game.tabChar[0][1] = game.getCh();
            game.setCh();
            game.freeCells--;
        }
        game.whoIsWon();
    }

    @FXML
    void button02Click(MouseEvent event) {
        if (game.tabChar[0][2] == 'X' || game.tabChar[0][2] == 'O') {
            alertText();
        }
        else {
            button02.setText(String.valueOf(game.getCh()));
            game.tabChar[0][2] = game.getCh();
            game.setCh();
            game.freeCells--;
        }
        game.whoIsWon();
    }

    @FXML
    void button10Click(MouseEvent event) {
        if (game.tabChar[1][0] == 'X' || game.tabChar[1][0] == 'O') {
            alertText();
        }
        else {
            button10.setText(String.valueOf(game.getCh()));
            game.tabChar[1][0] = game.getCh();
            game.setCh();
            game.freeCells--;

        }
        game.whoIsWon();
    }

    @FXML
    void button11Click(MouseEvent event) {
        if (game.tabChar[1][1] == 'X' || game.tabChar[1][1] == 'O') {
            alertText();
        }
        else {
            button11.setText(String.valueOf(game.getCh()));
            game.tabChar[1][1] = game.getCh();
            game.setCh();
            game.freeCells--;

        }
        game.whoIsWon();
    }

    @FXML
    void button12Click(MouseEvent event) {
        if (game.tabChar[1][2] == 'X' || game.tabChar[1][2] == 'O') {
            alertText();
        }
        else {
            button12.setText(String.valueOf(game.getCh()));
            game.tabChar[1][2] = game.getCh();
            game.setCh();
            game.freeCells--;

        }
        game.whoIsWon();
    }

    @FXML
    void button20Click(MouseEvent event) {
        if (game.tabChar[2][0] == 'X' || game.tabChar[2][0] == 'O') {
            alertText();
        }
        else {
            button20.setText(String.valueOf(game.getCh()));
            game.tabChar[2][0] = game.getCh();
            game.setCh();
            game.freeCells--;

        }
        game.whoIsWon();
    }

    @FXML
    void button21Click(MouseEvent event) {
        if (game.tabChar[2][1] == 'X' || game.tabChar[2][1] == 'O') {
            alertText();
        }
        else {
            button21.setText(String.valueOf(game.getCh()));
            game.tabChar[2][1] = game.getCh();
            game.setCh();
            game.freeCells--;

        }
        game.whoIsWon();
    }

    @FXML
    void button22Click(MouseEvent event) {
        if (game.tabChar[2][2] == 'X' || game.tabChar[2][2] == 'O') {
            alertText();
        }
        else {
            button22.setText(String.valueOf(game.getCh()));
            game.tabChar[2][2] = game.getCh();
            game.setCh();
            game.freeCells--;

        }
        game.whoIsWon();
    }
    @FXML
    void buttonOnePlayerClick(MouseEvent event) {
        game.newGame();
    }

    @FXML
    void buttonTwoPlayerGameClick(MouseEvent event) {
        game.newGame();
    }

    @FXML
    void initialize() {
        assert stackPane != null : "fx:id=\"stackPane\" was not injected: check your FXML file 'sample.fxml'.";
        assert gridPane != null : "fx:id=\"gridPane\" was not injected: check your FXML file 'sample.fxml'.";
        assert button00 != null : "fx:id=\"button00\" was not injected: check your FXML file 'sample.fxml'.";
        assert button01 != null : "fx:id=\"button01\" was not injected: check your FXML file 'sample.fxml'.";
        assert button02 != null : "fx:id=\"button02\" was not injected: check your FXML file 'sample.fxml'.";
        assert button11 != null : "fx:id=\"button11\" was not injected: check your FXML file 'sample.fxml'.";
        assert button10 != null : "fx:id=\"button10\" was not injected: check your FXML file 'sample.fxml'.";
        assert button12 != null : "fx:id=\"button12\" was not injected: check your FXML file 'sample.fxml'.";
        assert button20 != null : "fx:id=\"button20\" was not injected: check your FXML file 'sample.fxml'.";
        assert button21 != null : "fx:id=\"button21\" was not injected: check your FXML file 'sample.fxml'.";
        assert button22 != null : "fx:id=\"button22\" was not injected: check your FXML file 'sample.fxml'.";
        assert onePlayerButton != null : "fx:id=\"onePlayerButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert twoPlayerButton != null : "fx:id=\"twoPlayerButton\" was not injected: check your FXML file 'sample.fxml'.";

    }

    private void alertText(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION,"To pole jest już zajęte", ButtonType.OK);
        alert.show();
    }

}
