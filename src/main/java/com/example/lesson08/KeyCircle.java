package com.example.lesson08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KeyCircle extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(400, 300);
        canvas.setFocusTraversable(true);

        canvas.setOnKeyPressed(event -> {
            switch (event.getText()) {
                case "r" -> drawCircle(canvas, Color.RED);
                case "g" -> drawCircle(canvas, Color.GREEN);
                case "b" -> drawCircle(canvas, Color.BLUE);
            }
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("cercles sur clavier");
        stage.show();
    }

    private void drawCircle(Canvas canvas, Color color) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillOval(Math.random() * (canvas.getWidth() - 15), Math.random() * (canvas.getHeight() - 15), 30, 30);
    }
}
