package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Abdelbary Yussef
 */



public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //The stage displays the hello fmxl file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 500);
        stage.setTitle("Hello! Welcome to your to-do list");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}