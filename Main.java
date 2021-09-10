package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Scanner;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;



public class Main extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
   public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("brosceneController.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Vedant's javafx program");
            primaryStage.setScene(scene);
            primaryStage.show();
            Image icon = new Image("Proimage.jpg");
            primaryStage.getIcons().add(icon);
//            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}
