/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemas.operativos;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public abstract class Estrategias {

    int TamañoMemoria = 4000;
    ArrayList<ArrayList> Tabla = new ArrayList<>();
    String Forma;
    boolean Dinamico;

    public abstract int posicionProceso(String Estrategia);
    public abstract String[] linea(String Nombre,String Tamaño);
    public abstract int Posicion(Object[][] tabla,String Tamaño);

    public void AgregarDinamico(String NombreProceso, String TamañoProceso) {
        ArrayList<String> regreso = new ArrayList<>();
        regreso.add(decimalToHexadecimal(posicionProceso(Forma)));
        regreso.add(NombreProceso);
        regreso.add(TamañoProceso);
        if(Dinamico){
            regreso.add("particion");
        }
        Tabla .add(regreso);
        
    }


    public String decimalToHexadecimal(int PosicionNumerica) {
        String PosicionHexa = "";
        while (PosicionNumerica > 0) {
            int remainder = PosicionNumerica % 16;
            if (remainder < 10) {
                PosicionHexa = remainder + PosicionHexa;
            } else {
                PosicionHexa = (char) ('A' + remainder - 10) + PosicionHexa;
            }
            PosicionNumerica = PosicionNumerica / 16;
        }
        return PosicionHexa;
    }
}
