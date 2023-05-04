/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class DinamicasSinCompactacion extends Estrategias {

    public DinamicasSinCompactacion(String pa) {
        Forma = pa;
    }
    Utils herramientas = new Utils();

    public int Posicion(Object[][] tabla, String Tamaño) {
        int posicion = 0;
        ArrayList<Integer> opciones = new ArrayList<>();

        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i][1] == null && herramientas.entra(herramientas.calculate((tabla[i][tabla[i].length]).toString()), herramientas.calculate(Tamaño))) {
                opciones.add(i);
            } else {
                posicion++;
            }
        }
        for (int i = 0; i < opciones.size(); i++) {

            /*if (herramientas.calculate(Tamaño).compareTo(new BigInteger(tabla[i][tabla.length].toString())){
                
            }*/
        }

        return posicion;
    }

    public int tabular(Object[][] tabla, String Tamaño, String nombre) {
        int posicion = 0;
        ArrayList<Integer> opciones = new ArrayList<>();
        BigInteger TamañoEntre;
        BigInteger Temp;
        BigInteger menosUno= new BigInteger("-1");
        for (int i = 0; i < tabla.length; i++) {
            try {

                if (tabla[i][tabla[1].length] != null && tabla[i + 1][tabla[1].length] != null && tabla[i + 2][tabla[1].length] != null) {
                    TamañoEntre = new BigInteger(tabla[i][tabla[1].length].toString());
                    TamañoEntre.multiply(menosUno);
                    Temp = new BigInteger(tabla[i+2][tabla[1].length].toString());
                    TamañoEntre.add(Temp);
                    tabla[i][tabla[1].length] =TamañoEntre;
                    
                }
            } catch (Exception e) {

            }
            if (tabla[i][1] == null) {
                opciones.add(i);
            } else {
                posicion++;
            }
        }
        for (int i = 0; i < opciones.size(); i++) {
            BigInteger hueco = new BigInteger(tabla[i][tabla[1].length].toString());
            BigInteger tamaño = new BigInteger(Tamaño);
            if(herramientas.entra(hueco,tamaño)){
                
            }
            /*if (herramientas.calculate(Tamaño).compareTo(new BigInteger(tabla[i][tabla.length].toString())){
                
            }*/
        }

        return posicion;
    }
}
