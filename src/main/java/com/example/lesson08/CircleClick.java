package com.example.lesson08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CircleClick extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        canvas.setOnMouseClicked(event -> drawCircle(gc, event));

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("click cercles");
        stage.show();
    }

    /**
     * dessine un cercle de couleur AQUA et de 30px de diamètre dont le centre est positionné
     * sur la souris
     * @param gc est le context graphique
     * @param event est l'événement MouseEvent
     */
    private void drawCircle(GraphicsContext gc, MouseEvent event) {
        gc.setFill(Color.AQUA);
        gc.fillOval(event.getX() + 15, event.getY() + 15, 30, 30);
    }
}
