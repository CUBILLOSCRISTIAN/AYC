/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_1st_part;

import java.util.Comparator;

/**
 *
 * @author crist
 */
public class comparePoints implements Comparator<Point> {

    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getX_coordinate() > p2.getX_coordinate()) {
            return 1;
        } else if (p1.getX_coordinate() == p2.getX_coordinate()) {
            if (p1.getY_coordinate() > p2.getY_coordinate()) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }

}
