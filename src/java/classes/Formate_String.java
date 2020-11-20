/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author diegonarvaez
 */
public class Formate_String {

    private int contadorVowels = 0;
    private int contadorQ = 0;
    private int contadorSpaces = 0;

    public String countVowel(String c) {
        
        

        if (validate_letter(c) && c.contains(" ")) {
            return "La cadena " + c + " , contiene " + contadorVowels + " letra(s) vocales.";
        } else {
            return "La cadena" + c + ", no cumple con las condiciones necesarias";

        }

    }

    public boolean validate_letter(String c) {
        boolean res = false;

        c = c.toUpperCase();

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z' || c.charAt(i)==' ') {
                if (c.charAt(i) == 'A' || c.charAt(i) == 'E' || c.charAt(i) == 'I' || c.charAt(i) == 'O' || c.charAt(i) == 'U') {
                    contadorVowels++;
                }
                res = true;
            } else {
                res = false;
                break;
            }
        }

        return res;
    }

    public String textConvert(String c) {
        String mayus = c.toUpperCase();
        int tam = c.length();
        String respuesta = "";

        char[] array = new char[tam];

        for (int i = 0; i < mayus.length(); i++) {
            if (mayus.charAt(i) >= 'A' && mayus.charAt(i) <= 'Z') {

                array[i] = mayus.charAt(i);

                if (mayus.charAt(i) == 'Q') {
                    contadorQ++;
                }

            } else {
                break;
            }

        }
        
        

        for (int i = 0; i < mayus.length(); i++) {
            switch (array[i]) {
                case 'I':
                    array[i] = '1';
                    break;
                case 'Z':
                    array[i] = '2';
                    break;
                case 'E':
                    array[i] = '3';
                    break;
                case 'A':
                    array[i] = '4';
                    break;
                case 'S':
                    array[i] = '5';
                    break;
                case 'G':
                    array[i] = '6';
                    break;
                case 'T':
                    array[i] = '7';
                    break;
                case 'B':
                    array[i] = '8';
                    break;
                case 'P':
                    array[i] = '9';
                    break;
                case 'O':
                    array[i] = '0';
                    break;

            }
        }

        String valor = "";

        for (char a : array) {
            valor += a;
        }

        return respuesta = "La cadena " + mayus + " , tiene un \n tamaño de " + tam + " carácteres, la cadena reemplazada\n sería " + valor + ", la cual contiene " + contadorQ + " letra(s) Q.";
    }

    public String countSpaces(String c) {

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == ' ') {
                contadorSpaces++;
            }
        }

        String nuevaCadena = c.replaceAll(" ", "");

        return "El texto " + c + " contiene " + contadorSpaces + " espacio en blanco, la nueva cadena generada es:" + nuevaCadena + ".";
    }

    public String validateEmail(String c) {

        String respuesta = "";
        String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(c);
        if (matcher.matches() && c.endsWith("@hotmail.com") || c.endsWith("@hotmail.com.mx") || c.endsWith("@yahoo.com.mx") || c.endsWith("@live.com.mx") || c.endsWith("@outlook.com.mx") || c.endsWith("@gmail.com.mx") || c.endsWith("@gmail.com.mx")) {
            return " El correo electrónico " + c + " es válido";
        } else {
            return " El correo electrónico " + c + " es inválido";
        }

    }

}
