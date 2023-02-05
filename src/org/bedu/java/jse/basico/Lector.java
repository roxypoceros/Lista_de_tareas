package org.bedu.java.jse.basico;
import java.util.Scanner;
public class Lector {
//En clase Lector encapsularemos el uso de Scanner para leer una opción del teclado

    private Scanner scanner = new Scanner(System.in);

    //Solo leeremos un byte
    //Representará la opción seleccionada por el usuario
    public byte leeOpcion(){
        System.out.print("Opción: ");
        return scanner.nextByte();
    }

    //método que permite leer una cadena y la regrese
    public String leeCadena(){
        System.out.print("Cadena: ");
        return scanner.nextLine();
    }


}
