/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

import java.math.BigInteger;

/**
 *
 * @author Thomas
 */
public class EstaticasDeTamañoVariable extends Estrategias {

    Utils herramientas = new Utils();

    public EstaticasDeTamañoVariable(String pa) {
        Forma = pa;
    }

    @Override
    public int posicionProceso(String Estrategia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] linea(String Nombre, String Tamaño) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int Posicion(Object[][] tabla, String Tamaño) {

        BigInteger TamañoPermitido = herramientas.calculate((String) tabla[0][3]);
        BigInteger tamaño = new BigInteger(Tamaño);

        switch (Forma) {
            //primer ajuste
            case "PRA":
                int Posicion = -1;
                if (Posicion == 7) {
                    Posicion = -1;
                }
                if (entra(TamañoPermitido, tamaño)) {
                    Posicion++;
                    return Posicion;
                }
                break;
            //mejor ajuste
            case "MA":
                int min = 0;
                for (int j = 0; j < tabla.length; j++) {
                    if (tabla[j][1] == null) {

                        if (entra(herramientas.calculate((String) tabla[j][3]), tamaño)) {
                            if (herramientas.calculate((String) tabla[min][3]).compareTo(herramientas.calculate((String) tabla[j][3])) == 1) {
                                min = j;
                            }
                        }
                    }
                }

                return min;
            //peor ajuste
            case "PA":
                int max = 6;
                for (int j = 0; j < tabla.length; j++) {
                    if (tabla[j][1] == null) {

                        if (entra(herramientas.calculate((String) tabla[j][3]), tamaño)) {
                            if (herramientas.calculate((String) tabla[max][3]).compareTo(herramientas.calculate((String) tabla[j][3])) == -1) {
                                max = j;
                            }
                        }
                    }
                }
                return max;

        }

        return 0;
    }

    private boolean entra(BigInteger tamañoPermitido, BigInteger tamaño) {

        switch (tamaño.compareTo(tamañoPermitido)) {
            case -1:
                return true;
            case 0:
                return true;
            case 1:
                return false;

        }
        return false;
    }

}
