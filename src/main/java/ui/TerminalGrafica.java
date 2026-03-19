package ui;

import service.GestorTareas;

import java.util.Scanner;

public class TerminalGrafica {

    private static GestorTareas gestorTareas;


    public static void run() {
        gestorTareas = new GestorTareas();
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        while (opcion != 5) {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String nombre = sc.nextLine();
                    gestorTareas.añadirTarea(nombre);
                    break;
                case 2:
                    gestorTareas.listarTareas();
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la tarea a marcar como completada: ");
                    int id = sc.nextInt();
                    gestorTareas.marcarComoCompletado(id);
                    break;
                case 4:
                    System.out.println("Ingrese el ID de la tarea a borrar: ");
                    int id2 = sc.nextInt();
                    gestorTareas.borrarTarea(id2);
            }
        }


    }

    private static void menu() {
        System.out.println("---Gestor de Tareas---");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Listar Tareas");
        System.out.println("3. Marcar como completado");
        System.out.println("4. Borrar Tarea");
        System.out.println("5. Salir");
        System.out.print("Opcion: ");
    }

}
