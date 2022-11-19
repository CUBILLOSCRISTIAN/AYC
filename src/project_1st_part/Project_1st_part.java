/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_1st_part;

import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author crist
 */
public class Project_1st_part {

    /*      Declaration of global variables     */
    Point first;
    Point second;

    public static void main(String[] args) {
        /*      STATEMENT    */

        //Create a list with the points 
        ListPoints listPoints = new ListPoints();

        //Genera las coordenadas aleatoriamente y  sin repeticion
        listPoints.randomCoordinates(10);
        List<Point> points = listPoints.getPoints();

        //Oderna la lista en cuanto a la coordenada X
        DecimalFormat df = new DecimalFormat("#");
        Collections.sort(points, new comparePoints());

        System.out.println("La distancia minima es " + df.format(Point.closestPair(points, 0, points.size())));
        System.out.println("EL contador finalizo con: " + Point.count);

    }
}
