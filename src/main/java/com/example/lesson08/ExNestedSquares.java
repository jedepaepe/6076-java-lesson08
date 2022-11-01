package com.example.lesson08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExNestedSquares extends Application {
    @Override
    public void start(Stage stage) {
        double nr = 10;
        double delta = 50;
        Canvas canvas = new Canvas(nr * delta, nr * delta);

        for (int i = 0; i < nr; ++i) {
            drawSquare(canvas, delta, nr, i);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("carrés imbriqués");
        stage.show();
    }

    /**
     * dessine un carré centré dans le canvas dont
     *      la largeur est la largeur du canvas moins index * delta
     *      la hauteur est la hauteur du canvas moins index * delta
     *      la couleur est bleu avec un pourcentage de vert égal à index / nr
     * @param canvas est le canvas
     * @param delta est un facteur de taille
     * @param nr est un facteur de pondération
     * @param index est un facteur de pondération, il doit être plus petit ou égal à nr
     */
    private void drawSquare(Canvas canvas, double delta, double nr, int index) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.color(0, index / nr, 1));
        gc.fillRect(index * delta / 2, index * delta / 2, canvas.getWidth() - index * delta, canvas.getHeight() - index * delta);
    }
}
