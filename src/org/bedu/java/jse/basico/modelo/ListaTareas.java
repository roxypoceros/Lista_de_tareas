package org.bedu.java.jse.basico.modelo;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class ListaTareas {
    //Atributos
    private String nombre;
    private final LocalDate fechaCreacion;
    //Para agrupar un conjunto de tareas relacionadas
    private final List<Tarea> tareas = new ArrayList<>();



    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }


    //Constructor recibe como params:
    //Nombre de lista
    //Bloque de inicialización que establece fecha de creación

    public ListaTareas(String nombre){
        this.nombre = nombre;
    }

    {
        fechaCreacion = LocalDate.now();
    }
    //Método que permite agregar una tarea
    public void agregaTarea(Tarea tarea){
        tareas.add(tarea);
    }
    //Método que permite eliminar una tarea

    public Tarea eliminaTarea(int indice){
        if(indice > tareas.size()){
            System.out.println("La tarea indicada no se encuentra en la lista.");
            return null;
        }

        return tareas.remove(indice);
    }
    //Método que permite obtener una lista de tareas

    public List<Tarea> getTareas() {
        return tareas;
    }
    //Método que permite obtener numero de tareas de lista

    public int numeroTareas(){
        return tareas.size();
    }
    //Método que imprime nombre de tareas

    public void muestraTareas(){
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i+1) + " - " + tareas.get(i).getNombre());
        }
    }



}
