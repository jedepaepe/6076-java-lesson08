package com.example.lesson08;

import javafx.application.Application;
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

        drawSquare(canvas, width);
        canvas.setOnMouseClicked(event -> {
            if (isOnSquare(canvas, width, event)) {
                drawSquare(canvas, width);
            }
        });

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("carré click -> nouvelle couleur aléatoire");
        stage.show();
    }


    /**
     * dessine un carré centré dans le canvas dont la couleur est tirée aléatoirement
     * @param canvas le canvas
     * @param width la largeur du carré
     */
    private void drawSquare(Canvas canvas, double width) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        gc.fillRect(getSquareX(canvas, width), getSquareY(canvas, width), width, width);
    }

    /**
     * calcule l'absisse x du sommet supérieur gauche du carré
     * @param canvas est le canvas
     * @param width est la larguer du carré
     * @return l'absisse x
     */
    private double getSquareX(Canvas canvas, double width) {
        return canvas.getWidth() / 2 - width / 2;
    }

    /**
     * calcule l'ordonnée y du sommet supérieur gauche du carré
     * @param canvas est le canvas
     * @param width est la largeur du carré
     * @return l'ordonnée y
     */
    private double getSquareY(Canvas canvas, double width) {
        return canvas.getHeight() / 2 - width / 2;
    }

    /**
     * indique si la souris est sur le carré
     * @param canvas est le canvas
     * @param width est la largeur du carré
     * @param event est l'événement souris
     * @return true si la souris est sur le carré, sinon false
     */
    private boolean isOnSquare(Canvas canvas, double width, MouseEvent event) {
        double x = getSquareX(canvas, width);
        double y = getSquareY(canvas, width);
        return x < event.getX() && event.getX() < canvas.getWidth() - x &&
                y < event.getY() && event.getY() < canvas.getHeight() - y;
    }
}
