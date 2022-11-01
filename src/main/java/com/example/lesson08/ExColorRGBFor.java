package com.example.lesson08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExColorRGBFor extends Application {
    @Override
    public void start(Stage stage) {
        double width = 50;
        double nr = 10;
        Canvas canvas = new Canvas(nr * width, 3 * width);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int i = 0; i < nr; ++i) {
            double percent = i / (nr - 1);
            fillCircle(gc, Color.color(1 - percent, percent, 0), i * width, 0, width);
            fillCircle(gc, Color.color(0, 1 - percent, percent), i * width, width, width);
            fillCircle(gc, Color.color(percent, 0, 1 - percent), i * width, 2 * width, width);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("color RGB red-green-blue");
        stage.show();
    }

    /**
     * dessine un cercle
     * @param gc est le context graphique
     * @param color est la couleur de remplissage du cercle
     * @param x est l'absisse du sommet supérieur gauche du rectangle qui contient le cercle
     * @param y est l'ordonnée du sommet supérieur gauche du rectangle qui contient le cercle
     * @param radius est le rayon du cercle
     */
    private void fillCircle(GraphicsContext gc, Color color, double x, double y, double radius) {
        gc.setFill(color);
        gc.fillOval(x, y, radius, radius);
    }
}
