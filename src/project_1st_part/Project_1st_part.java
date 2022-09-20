/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_1st_part;

import java.util.*;

/**
 *
 * @author crist
 */
public class Project_1st_part {

    /*      Declaration of global variables     */
    int first;
    int second;

    public static void main(String[] args) {
        /*      STATEMENT    */
        Project_1st_part eject = new Project_1st_part();

        //Create a list with the points 
        ListPoints listPoints = new ListPoints();

        listPoints.addPoints();
        ArrayList<Point> points = listPoints.getPoints();

        //Oderna la lista en cuanto a la coordenada X
        Collections.sort(points, new comparePoints());

        eject.splitTheArray(points);
    }

    /*                      Funtions             */
    public void bruteForceAlgorithm(List<Point> points, int tipe) {
        double d_min = 9999999;

        for (Point point : points) {
            for (Point point1 : points) {
                if (!point.equals(point1)) {
                    double d = distance(point, point1);
                    if (d < d_min) {
                        first = points.indexOf(point);
                        second = points.indexOf(point1);
                        d_min = d;
                    }
                }
            }
        }
        switch (tipe) {
            case 1:
                System.out.println("\nPrimer corte ");
                System.out.println("The minimum distance between points is: " + d_min + " \nthe first point is: " + first + " \nand the second point is: " + second);
                break;
            case 2:
                System.out.println("\nSegundo corte ");
                System.out.println("The minimum distance between points is: " + d_min + " \nthe first point is: " + first + " \nand the second point is: " + second);
                break;
            case 3:
                System.out.println("\nTercer corte ");
                System.out.println("The minimum distance between points is: " + d_min + " \nthe first point is: " + first + " \nand the second point is: " + second);
                break;
            default:
                throw new AssertionError();
        }
    }

    public double distance(Point point1, Point point2) {
        //calcula la distancia entre los elementos i-esimo y j-esimo

        //desempaca las coordenadas del i-ésimo elemento
        int x1 = point1.x_coordinate;
        int y1 = point1.y_coordinate;

        //desempeca las coordenadas del j-esimo elemento
        int x2 = point2.x_coordinate;
        int y2 = point2.y_coordinate;

        //calcula su distancia
        double d = Math.floor(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        return d;
    }

    public void splitTheArray(ArrayList<Point> points) {
        /*      Crea las sublistas para poder analizar los puntos por cuadrantes        */
        List<Point> firstPartToArray = points.subList(0, points.size() / 2);

        List<Point> secondPartToArray = points.subList(points.size() / 2, points.size());

        List<Point> thirdPartToArray = points.subList(points.size() / 3, points.size() * 3 / 4);

        bruteForceAlgorithm(firstPartToArray, 1);

        bruteForceAlgorithm(secondPartToArray, 2);

        bruteForceAlgorithm(thirdPartToArray, 3);
    }

}
