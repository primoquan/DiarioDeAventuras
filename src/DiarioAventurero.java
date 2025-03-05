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
            System.out.print("Ingrese el nombre de su nueva misión o selecciona opción 0 para regresar: ");
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
            System.out.println("Ingrese el número de la misión para completarla o selecciona opción 0 para regresar: ");
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
        if (MisionesCompletadas.isEmpty()) {
            System.out.println("🏆 No has completado ninguna mision todavia.");
            return;
        }
        System.out.println("Misiones Completadas:");
        for (int i = 0; i < MisionesCompletadas.size(); i++) {
            System.out.println((i + 1) + ". " + MisionesCompletadas.get(i));
        }

    }

    //Creamos nuestro metodo Eliminar misiones
    public void EliminarMision(){
        while (true) {
            MostarMisionesPendientes();
            if (MisionesPendientes.isEmpty()) {
                System.out.println("No tienes misiones pendientes.");
                return;
            }
            System.out.print("Ingresa el numero de la mision que deseas eliminaro o selecciona opción 0 para regresar: ");
            int opcion = scanner.nextInt();
            if (opcion == 0) return;
            if (opcion > 0 && opcion <= MisionesPendientes.size()) {
                String Eliminada = MisionesPendientes.remove(opcion - 1);
                System.out.println("Se ha eliminado la mision seleccionada " + Eliminada);
            } else {
                System.out.println("Opción no válida");
            }
        }

    }

    //Creamos nuestro metodo Mostrar misiones pendientes
    public void BuscarMision(){
        while (true) {
            System.out.println("Buscar misión:");
            MostarMisionesPendientes();
            MostrarMisionesCompletadas();
            System.out.print("Ingrese el nombre de la misión o selecciona opción 0 para regresar: ");
            String MisionBuscada = scanner.nextLine();
            if (MisionBuscada.equals("0")) return;
            if (MisionesPendientes.contains(MisionBuscada)) {
                System.out.println("Misión " + MisionBuscada + " todavia esta pendiente.");
            } else if (MisionesCompletadas.contains(MisionBuscada)) {
                System.out.println("Misión " + MisionBuscada + " ya esta completada.");
            } else {
                System.out.println("Misión no encontrada.");
            }
        }

    }
}
