/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_1st_part;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author crist
 */
public class Project_1st_part {

    public static void main(String[] args) {
        /*      STATEMENT    */
        //Create a list with the points 
        ListPoints listPoints = new ListPoints();

        //Genera las coordenadas aleatoriamente y  sin repeticion
        int tamaño = 10;

        for (int i = 0; i <= 10; i++) {
            listPoints.randomCoordinates(tamaño);
            List<Point> points = listPoints.getPoints();
            //Oderna la lista en cuanto a la coordenada X
            DecimalFormat df = new DecimalFormat("#.##");
            Collections.sort(points, new comparePoints());

            long inicio = System.currentTimeMillis();
            System.out.println("La distancia minima es " + df.format(Point.closestPair(points, 0, points.size())));
            long fin = System.currentTimeMillis();

            long tiempo = (fin - inicio);
            System.out.println(tiempo);
            save(tamaño, tiempo, Point.count);
            tamaño = tamaño + 2;
        }

    }

    public static void save(int tamaño, double tiempo, int contador) {
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("Datos.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir = new FileWriter(archivo, true);

            //Escribimos en el archivo con el metodo write 
            escribir.write(tamaño + "##" + tiempo + "##" + contador);
            escribir.write("\r\n");

            //Cerramos la conexion
            escribir.close();// closes the file

        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

}
