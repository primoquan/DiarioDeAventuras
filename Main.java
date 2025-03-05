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
        String NombreAventurero = scanner.nextLine();
        System.out.println("Bienvenido, " + NombreAventurero + ". Este es tu diario de aventuras!");

        DiarioAventurero diario = new DiarioAventurero();

        while (true){
            System.out.println("Diario de Aventuras de " + NombreAventurero );
            System.out.println("1. Registrar nueva misión");
            System.out.println("2. Ver misiones pendientes");
            System.out.println("3. Completar una misión");
            System.out.println("4. Ver misiones completadas");
            System.out.println("5. Eliminar una misión pendiente");
            System.out.println("6. Buscar una misión");
            System.out.println("7. Salir");
            System.out.print("Ingresa la opcion de lo que deseas hacer: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    diario.RegistrarMision();
                    break;
                case 2:
                    diario.MostarMisionesPendientes();
                    break;
                case 3:
                    diario.CompletarMision();
                    break;
                case 4:
                    diario.MostrarMisionesCompletadas();
                    break;
                case 5:
                    diario.EliminarMision();
                    break;
                case 6:
                    diario.BuscarMision();
                    break;
                case 7:
                    System.out.println("Nos vemos a la proxima, " + NombreAventurero );
                default:
                    System.out.println("Has ingresado una opcion invalida. Vuelve a intentarlo.");
            }

        }
    }
}
