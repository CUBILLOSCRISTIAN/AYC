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

        eject.bruteForceAlgorithm(points);

        Collections.sort(points, new comparePoints());

        for (Point point : points) {
            System.out.println("(" + point.x_coordinate + ")(" + point.y_coordinate + ")");
        }
        /*
        System.out.println("The minimum distance between points is: " + minimum_distance + " \nthe first point is: " + first + " \nthe first point is: " + second);
         */
    }

    /*                      Funtions             */
    public void bruteForceAlgorithm(ArrayList<Point> points) {
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
        System.out.println("The minimum distance between points is: " + d_min + " \nthe first point is: " + first + " \nand the second point is: " + second);
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

}
