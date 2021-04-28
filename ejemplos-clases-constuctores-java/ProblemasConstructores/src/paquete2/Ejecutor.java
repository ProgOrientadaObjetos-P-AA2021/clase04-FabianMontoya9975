/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        String name;
        String city;
        int nDoc;
        int nEnf;
        System.out.println("Ingresar el nombre del hospital: ");
        name = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el hospital: ");
        city = entrada.nextLine();
        System.out.println("Ingresar el número de doctores que laboran: ");
        nDoc = entrada.nextInt();
        System.out.println("Ingresar el número de enfermeros que laboran:");
        nEnf = entrada.nextInt();
        Hospital hosp = new Hospital(name, city, nDoc, nEnf);

        System.out.printf("%s\n", hosp);
    }
}
