package org.bedu.java.jse.basico;
import org.bedu.java.jse.basico.modelo.ListaTareas;

import java.util.ArrayList;
import java.util.List;
//Crear clase ListasTareas y
// un método para cada una de las opciones del menú, dentro de cada método
// x ahora solo es necesario mostrar un texto que indique el nombre de esa opción

public class ListasTareas {

    private Lector lector = new Lector();
    //Crear nueva List para agrupar ListaTareas
    //(las cuales a su vez contendrán Tareas).
    //Declarar e inicializar una nueva instancia de esta forma
    private List<ListaTareas> listasTareas = new ArrayList<>();
    public void crearNuevaLista(){
        System.out.println("Crear nueva lista de tareas.");
    //Usa el nuevo método leeCadena de Lector
    // para leer el nombre de la nueva lista de tareas y
    // y crear un nuevo objeto de tipo ListaTareas,
    // pasando el nombre anterior en su constructor
    String nombre = lector.leeCadena();
    ListaTareas lista = new ListaTareas(nombre);
    //Tomar ese objeto (nueva instancia de ListaTareas) y
        // agrégalo a listasTareas:
        listasTareas.add(lista);
    }

    public void verListaTareas(){
        System.out.println("Ver listas de tareas.");


    //Si existe al menos una lista de tareas,
    //muestra todos los elementos contenidos en listasTareas,
    //indicando su índice y su nombre

    for (int i = 0; i < listasTareas.size(); i++) {
            System.out.println((i + 1) + " - " + listasTareas.get(i).getNombre());
        }
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");
        //usar el método leeOpcion para leer un valor numérico
        byte indice = validaIndice();

        if(indice == 0){
            return;
        }
        ListaTareas lista = listasTareas.get(indice - 1);

        if (lista.numeroTareas() == 0) {
            System.out.println("Aún no hay tareas en la lista.");
        }

        lista.muestraTareas();

    }

    public void actualizarListaDeTareas(){
        System.out.println("Actualizar lista de tareas.");
        //usar el método leeOpcion para leer un valor numérico

        byte indice = validaIndice();

        if (indice == 0) {
            return;
        }
    }

    public void eliminarListaDeTareas(){
        System.out.println("Eliminar lista de tareas.");

        byte indice = validaIndice();

        if(indice == 0){
            return;
        }

        ListaTareas listaEliminada = listasTareas.remove((indice - 1));

        System.out.println("Se eliminó la lista de tareas: " + listaEliminada.getNombre());
    }
    //usar el método leeOpcion para leer un valor numérico
    byte lista = lector.leeOpcion();

    //agregar método de utilidad que valide
    //si ya existe alguna lista de tareas. /
    //validación que estarás haciendo de forma constante,
    //es una buena práctica agregarla dentro de un método
    //que posteriormente puedas invocar.
    //Valida si listasTareas ha sido inicializado y si no está vacía
    private boolean validaExistenciaLista() {
        if (listasTareas == null || listasTareas.isEmpty()) {
            System.out.println("Aún no se ha creado ninguna lista de tareas.");
            return false;
        }
        return true;
    }

    private byte validaIndice() {
        byte indice = 0;
        //Verificar que se tenga al menos una lista de tareas,
        //usando el método que acabas de crear (validaExistenciaLista);
        //si no hay ninguna lista de tareas entonces no hay nada que mostrar,
        //por lo tanto, terminaremos la ejecución el método:

        if (!validaExistenciaLista()) {
            return indice;
        }

        System.out.println("Indique el índice de la lista de tareas.");
        indice = lector.leeOpcion();

        if (indice > listasTareas.size() || indice < 0) {
            System.out.println("No existen listas de tareas en el índice seleccionado.");
            indice = 0;
        }

        return indice;
    }

}
