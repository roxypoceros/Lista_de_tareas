package org.bedu.java.jse.basico;

public class ListaTareasMain {


    //PW01.1 Desplagar un menú de opciones
    public static void main(String[] args) {

        //PW02.1 Agregar 2 variables:
        // short (selección del usuario)
        // string (mensaje que indica opción con # y texto y mensaje )

        //Inicializar la variable opcionSeleccionada a 0:

        //short opcionSeleccionada = 0;
        //String mensaje;

        //Reestructura el código del método main para usar las nuevas clases creadas.
        //Primero  crear una nueva instancia de cada una de las clases

        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lista = new ListasTareas();
        byte opcionSeleccionada = 0;

        //PW02.2 Usar switch con un case para cada opción
        //Cada case con nombre de opción seleccionada en mensaje
        // *** Cambios:
        // Mostrar menú de opciones y leer la opción seleccionada
        // por el usuario dentro de un bloque do...while para
        // para permitir al usuario seleccionar diferentes opciones
        // sin reiniciar la app.
        // Mantener bloque switch pero usar instancia de Lista de Tareas no String

        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leeOpcion();

            System.out.println("\n\nLa opción seleccionada es: " + opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaLista();
                    break;
                case 2:
                    lista.verListaTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaDeTareas();
                    break;
                case 5:
                    lista.eliminarListaDeTareas();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación.");
                    break;

                default:
                    System.out.println("Opción desconocida.");

            }
        }while(opcionSeleccionada != 6);

        }




        //Mostrar mensaje con la opción seleccionada
        //Mostrar el mensaje En construcción...*:

        //System.out.println("\n\nLa opción seleccionada es: " + opcionSeleccionada + " " + mensaje);
        //System.out.println("En construcción.");
    }
