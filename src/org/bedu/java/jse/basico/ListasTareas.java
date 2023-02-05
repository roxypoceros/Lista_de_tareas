package org.bedu.java.jse.basico;
import org.bedu.java.jse.basico.modelo.ListaTareas;
//Crear clase ListasTareas y
// un método para cada una de las opciones del menú, dentro de cada método
// x ahora solo es necesario mostrar un texto que indique el nombre de esa opción

public class ListasTareas {

    private Lector lector = new Lector();
    public void crearNuevaLista(){
        System.out.println("Crear nueva lista de tareas.");
    //Usa el nuevo método leeCadena de Lector
    // para leer el nombre de la nueva lista de tareas y
    // y crear un nuevo objeto de tipo ListaTareas,
    // pasando el nombre anterior en su constructor
    String nombre = lector.leeCadena();
    ListaTareas lista = new ListaTareas(nombre);
    }

    public void verListaTareas(){
        System.out.println("Ver listas de tareas.");
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");
        //usar el método leeOpcion para leer un valor numérico
        byte lista = lector.leeOpcion();
    }

    public void actualizarListaDeTareas(){
        System.out.println("Actualizar lista de tareas.");
        //usar el método leeOpcion para leer un valor numérico

        byte lista = lector.leeOpcion();
    }

    public void eliminarListaDeTareas(){
        System.out.println("Eliminar lista de tareas.");
    }
    //usar el método leeOpcion para leer un valor numérico
    byte lista = lector.leeOpcion();



}
