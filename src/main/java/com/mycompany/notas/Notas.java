/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notas;

/**
 *
 * @author omarz
 */
/* Enunciado ejercicio 8.2
Se requiere desarrollar un programa con interfaz gráfica de usuario que
genere una ventana donde se solicite el ingreso de cinco notas obtenidas
por un estudiante.
El programa debe calcular y mostrar en la parte inferior de la ventana
los siguientes datos:
- El promedio de notas ingresadas.
- La desviación estándar de las notas ingresadas.
- La mayor nota obtenida.
- La menor nota obtenida.

*/
public class Notas {
    double[] listaNotas;

    public Notas() {
        listaNotas = new double[5];
    }

    double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            suma = suma + listaNotas[i];
        }
        return (suma / listaNotas.length);
    }

    double calcularDesviacion() {
        double prom = calcularPromedio();
        double suma = 0;
        for (int i = 0; i < listaNotas.length; i++) {
            suma += Math.pow(listaNotas[i] - prom, 2);
        }
        return Math.sqrt(suma / listaNotas.length);
    }

    double calcularMenor() {
        double menor = listaNotas[0];
        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] < menor) {
                menor = listaNotas[i];
            }
        }
        return menor;
    }

    double calcularMayor() {
        double mayor = listaNotas[0];
        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] > mayor) {
                mayor = listaNotas[i];
            }
        }
        return mayor;
    }
}