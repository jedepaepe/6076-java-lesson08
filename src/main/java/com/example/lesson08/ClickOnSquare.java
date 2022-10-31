package com.example.lesson08;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ClickOnSquare extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(300, 300);
        double width = canvas.getWidth() * 2 / 3;

        drawRectangle(canvas, width);
        canvas.setOnMouseClicked(event -> {
            if (isOnRectangle(canvas, width, event)) {
                drawRectangle(canvas, width);
            }
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("carré click -> nouvelle couleur aléatoire");
        stage.show();
    }

    private boolean isOnRectangle(Canvas canvas, double width, MouseEvent event) {
        double x = canvas.getHeight() / 2 - width / 2;
        double y = canvas.getHeight() / 2 - width / 2;
        return x < event.getX() && event.getX() < canvas.getWidth() - x &&
                y < event.getY() && event.getY() < canvas.getHeight() - y;
    }

    private void drawRectangle(Canvas canvas, double width) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        gc.fillRect(canvas.getHeight() / 2 - width / 2, canvas.getHeight() / 2 - width / 2, width, width);
    }
}
