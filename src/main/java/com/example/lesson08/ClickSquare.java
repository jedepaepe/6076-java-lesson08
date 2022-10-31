package com.example.lesson08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ClickSquare extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 600);
        double width = canvas.getWidth() / 10;
        GraphicsContext gc = canvas.getGraphicsContext2D();

        canvas.setOnMouseClicked(event -> {
            gc.setFill(Color.color(0.3, 1, 0.3));
            gc.fillRect(event.getX(), event.getY(), width, width);
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("click carré");
        stage.show();
    }
}
