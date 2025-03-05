//Universidad Da Vinci de Guatemala
//Estructura de Datos
//Ingeniero Brandon Chitay
//Proyecto Diario de aventuras
//Luis Quan
//201927151

import src.DiarioAventurero;
import java.util.Scanner;

//Creamos nuestro menu principal
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hola aventurero! Estas listo para la aventura? Cual es tu nombre: ");
        String nombreAventurero = scanner.nextLine();
        System.out.println("Bienvenido, " + nombreAventurero + ". Este es tu diario de aventuras!");
    }
}
