package org.bedu.java.jse.basico.modelo;
import java.time.LocalDate;

public class ListaTareas {
    //Atributos
    private String nombre;
    private final LocalDate fechaCreacion;

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





}
