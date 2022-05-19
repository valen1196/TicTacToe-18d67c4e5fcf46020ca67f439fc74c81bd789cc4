package edu.proyectofinal.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage tictactoe) throws IOException {

//para probar las interfaces , simplemente cambiar el nombre del fxml

            Parent root = FXMLLoader.load(getClass().getResource("prueba.fxml"));


            tictactoe.setTitle("Tictactoe");
            tictactoe.setScene(new Scene(root));
            tictactoe.show();

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
      private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    public static void main(String[] args) {
        launch();
    }

}