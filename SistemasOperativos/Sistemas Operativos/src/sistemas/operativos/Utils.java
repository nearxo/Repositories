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
public class Utils {

    public BigInteger calculate(String text) {
        // Obtener el primer número del texto
        if (text != null) {
            try {
                String[] parts = text.split("\\s+");
                BigInteger number = new BigInteger(parts[0]);

                // Obtener la unidad de medida
                String unit = parts[1].toLowerCase();

                // Realizar la multiplicación según la unidad de medida
                if (unit.equals("kb")) {
                    return number.multiply(BigInteger.valueOf(1024));
                } else if (unit.equals("mb")) {
                    return number.multiply(BigInteger.valueOf(1048576));
                } else if (unit.equals("gb")) {
                    return number.multiply(BigInteger.valueOf(1073741824));
                }
            } catch (Exception e) {
                return new BigInteger(text);
            }
        }
        return null;
    }

    public String decimalToHex(String decimal) {
        BigInteger decimalNumber = new BigInteger(decimal);  // crea un objeto BigInteger a partir de la cadena de caracteres decimal
        String hexadecimal = decimalNumber.toString(16);  // convierte el número decimal en hexadecimal
        return hexadecimal.toUpperCase();  // devuelve el resultado en mayúsculas
    }

    public BigInteger HexTodecimal(String hex) {
        BigInteger Hex = new BigInteger(hex, 16);
        BigInteger decimal = new BigInteger(Hex.toString(10));  // convierte el número hexadecimal en decimal
        return decimal;
    }

}
