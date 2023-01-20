package org.bedu.java.jse.basico;

public class ListaTareasMain {


    //PW01.1 Desplagar un menú de opciones
    public static void main(String[] args) {

        //PW02.1 Agregar 2 variables:
        // short (selección del usuario)
        // string (mensaje que indica opción con # y texto y mensaje )
        short opcionSeleccionada = 3;
        String mensaje;

        System.out.println("1. Crear nueva lista de tareas");
        System.out.println("2. Ver listas de tareass");
        System.out.println("3. Ver tareas de listas");
        System.out.println("4. Actualizar lista de tareas");
        System.out.println("5. Crear nueva lista de tareas");
        System.out.println("6. Eliminar lista de tareas");

        //PW02.2 Usar switch con un case para cada opción
        //Cada case con nombre de opción seleccionada en mensaje

        switch (opcionSeleccionada) {
            case 1:
                mensaje = "Crear nueva lista de tareas.";
                break;
            case 2:
                mensaje = "Ver listas de tareas.";
                break;
            case 3:
                mensaje = "Ver tareas de lista.";
                break;
            case 4:
                mensaje = "Actualizar lista de tareas.";
                break;
            case 5:
                mensaje = "Eliminar lista de tareas.";
                break;
            default:
                mensaje = "Opción desconocida.";

        }


        //Mostrar mensaje con la opción seleccionada
        //Mostrar el mensaje En construcción...*:

        System.out.println("\n\nLa opción seleccionada es: " + opcionSeleccionada + " " + mensaje);
        System.out.println("En construcción.");
    }
}