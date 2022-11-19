/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_1st_part;

import java.util.*;

/**
 *
 * @author crist
 */
public class ListPoints {

    ArrayList<Point> points = new ArrayList<>();

    public ListPoints() {
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    // Crea las coordenadas y crea un punto
    // ademas verifica que esta punto no exista
    // en la lista de puntos.
    public void randomCoordinates(int numbersCoords) {
        if (numbersCoords != 0) {
            boolean verif = true;
            int x_coordenate = (int) (Math.random() * 15);
            int y_coordenate = (int) (Math.random() * 15);

            Point point = new Point(x_coordenate, y_coordenate);

            for (int i = 0; i < points.size(); i++) {
                if (points.get(i).getX_coordinate() == point.getX_coordinate()
                        && points.get(i).getY_coordinate() == point.getY_coordinate()) {
                    verif = false;
                }
            }
            if (verif) {
                points.add(point);
                randomCoordinates(numbersCoords - 1);
            } else {
                randomCoordinates(numbersCoords);
            }
        }
    }
}
