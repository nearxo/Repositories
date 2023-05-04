/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

/**
 *
 * @author Thomas
 */
public class DinamicasConCompactacion extends Estrategias {

    Utils herramientas = new Utils();
    @Override
    public int Posicion(Object[][] tabla, String Tamaño) {
        int posicion=0;
        for (int i = 0 ;i<tabla.length;i++){
            if (tabla[i][1]==null ){
                return i;
            }else{
                posicion++;
            }
        }
        return posicion;
    }
    
}
