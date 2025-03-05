//Universidad Da Vinci de Guatemala
//Estructura de Datos
//Ingeniero Brandon Chitay
//Proyecto Diario de aventuras
//Luis Quan
//201927151

package src;

import java.util.LinkedList;
import java.util.Scanner;

public class DiarioAventurero {
    //Creamos las listas que vamos a usar para nuestro diario
    private LinkedList<String> MisionesPendientes;
    private LinkedList<String> MisionesCompletadas;
    private Scanner scanner;

    public DiarioAventurero() {
        MisionesPendientes = new LinkedList<>();
        MisionesCompletadas = new LinkedList<>();
        scanner = new Scanner(System.in);
    }

    //Creamos nuestros metodos de las acciones del menu

    //Creamos nuestro metodo Registrar Mision
    public void RegistrarMision(){
        while (true) {
            System.out.print("Ingrese el nombre de su nueva misión o seleccione opción 0 para regresar: ");
            String NuevaMision = scanner.nextLine();
            //Opcion para regresar al menu principal
            if (NuevaMision.equals("0")) return;
            MisionesPendientes.add(NuevaMision);
            System.out.println("Misión agregada en su lista de pendientes.");
        }
    }

    //Creamos nuestro metodo Mostrar misiones pendientes
    public void MostarMisionesPendientes(){
        if (MisionesPendientes.isEmpty()){
            System.out.println("No tiene misiones pendientes.");
            return;
        }
        System.out.println("Estas son sus misones pendientes: ");
        for (int i=0; i < MisionesPendientes.size(); i++){
            System.out.println((i+1) + ". " + MisionesPendientes.get(i));
        }
    }


    //Creamos nuestro metodo Completar misiones
    public void CompletarMision(){
        while (true) {
            MostarMisionesPendientes();
            System.out.println("Ingrese el número de la misión para completarla o seleccione opción 0 para regresar: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 0) return;
            if (opcion > 0 && opcion <= MisionesPendientes.size()) {
                String MisionCompletada = MisionesPendientes.remove(opcion - 1);
                MisionesCompletadas.add(MisionCompletada);
                System.out.println("La misión " + MisionCompletada + " ha sido completada.");
            } else {
                System.out.println("Opción no válida");
            }
        }

    }

    //Creamos nuestro metodo Mostrar misiones Completadas
    public void MostrarMisionesCompletadas(){

    }

    //Creamos nuestro metodo Eliminar misiones
    public void EliminarMision(){

    }

    //Creamos nuestro metodo Mostrar misiones pendientes
    public void BuscarMision(){

    }
}
