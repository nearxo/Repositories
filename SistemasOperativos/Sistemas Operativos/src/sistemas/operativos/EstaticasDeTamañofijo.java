/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas.operativos;

/**
 *
 * @author Thomas
 */
public class EstaticasDeTamañofijo extends Estrategias {
    int posicion = -1;
    public EstaticasDeTamañofijo() {
    }

    @Override
    public int posicionProceso(String Estrategia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String[] linea(String Nombre, String Tamaño) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int Posicion(Object[][] tabla,String tamaño) {
        posicion++;
        return posicion;
    }
    
}
