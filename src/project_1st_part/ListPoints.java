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

    Point point1 = new Point(1, 1);
    Point point2 = new Point(4, 1);
    Point point3 = new Point(6, 2);
    Point point4 = new Point(1, 3);
    Point point5 = new Point(5, 4);
    Point point6 = new Point(2, 2);

    ArrayList<Point> points = new ArrayList<>();

    public void addPoints() {
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point5);
        points.add(point6);
    }

    public ListPoints() {
    }

    public ArrayList<Point> getPoints() {
        return points;
    }
    
}
