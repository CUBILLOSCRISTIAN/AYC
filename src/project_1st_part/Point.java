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
public class Point {

    static int count = 0;
    private int x_coordinate;
    private int y_coordinate;

    static Point first;
    static Point second;

    public Point(int x_coordinate, int y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public int getX_coordinate() {
        return x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }

    public static double bruteForce(List<Point> points) {
        double d_min = Double.POSITIVE_INFINITY;
        for (Point point : points) {
            for (Point point1 : points) {
                if (!point.equals(point1)) {
                    double d = distance(point, point1);
                    if (d < d_min) {
                        first = point;
                        second = point1;
                        d_min = d;
                    }
                }
            }
        }
        return d_min;
    }

    public static double distance(Point point1, Point point2) {
        //calcula la distancia entre los elementos i-esimo y j-esimo

        //desempaca las coordenadas del i-ésimo elemento
        int x1 = point1.getX_coordinate();
        int y1 = point1.getY_coordinate();

        //desempeca las coordenadas del j-esimo elemento
        int x2 = point2.getX_coordinate();
        int y2 = point2.getY_coordinate();

        //calcula su distancia
        double d = Math.floor(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        return d;
    }

    public static double closestPair(List<Point> points, int startIndex, int endIndex) {

        //Si la lista tiene de 2 a 3 puntos se ejecuta brute force
        if ((endIndex - startIndex) <= 3) {
            return bruteForce(points);
        }

        //Encuentra el punto medio.
        int mid = startIndex + (endIndex - startIndex) / 2;
        Point midPoint = points.get(mid);

        //Divide la lista en dos considerando el punto medio
        //Sea Izq la distancia del lado izquierdo
        //y Der la distancia del lado derecho
        double Izq = closestPair(points, startIndex, mid);
        double Der = closestPair(points, mid, endIndex);

        //Se encuentra la distancia mas pequeña entre los dos lados
        double d = Math.min(Izq, Der);

        //Lista point guardaran los puntos mas cercados
        //a la linea del medio
        List<Point> midList = new ArrayList<>();

        for (Point point : points) {
            if (Math.abs(point.getX_coordinate() - midPoint.getX_coordinate()) < d) {
                midList.add(point);
            }
        }
        count = 0;
        //Encuentra el minimo entre El punto mas cercano de midList y d
        return Math.min(d, stripClosest(midList, midList.size(), d));
    }

    public static double stripClosest(List<Point> strip, int size, double d) {
        double min = d;

        Collections.sort(strip, new comparePoints());

        //Compara la distancias de los puntos de la lista y si es menos a min
        //la distancia de estos puntos va a se la nueva min
        for (int i = 0; i < strip.size() - 1; i++) {
            count++;
            if (distance(strip.get(i), strip.get(i + 1)) < min) {
                min = distance(strip.get(i), strip.get(i + 1));
            }
        }
        return min;
    }

}
