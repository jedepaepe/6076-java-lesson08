package com.example.lesson08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DemoStart extends Application {
    @Override
    public void start(Stage stage) {
        Button button = new Button("click");
        button.setOnMouseClicked(event -> button.setText("clicked"));
        StackPane pane = new StackPane(button);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("start demo");
        stage.setMinWidth(300);
        stage.setMinHeight(200);
        stage.show();
    }
}
