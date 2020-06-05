package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    static Stage stage;
    private Parent root;

    public Parent getRoot() {
        return root;
    }

    public void setRoot(){
        try {
            this.root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Can't load fxml.file", ButtonType.OK);
            stage.close();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        setRoot();
        getRoot();
        primaryStage.setTitle("Tic Tac Toe in Java FX");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        this.stage = primaryStage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
