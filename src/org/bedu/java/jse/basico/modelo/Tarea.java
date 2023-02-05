package org.bedu.java.jse.basico.modelo;

import java.time.LocalDate;

public class Tarea {
    //atributos
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaExpiracion;
    private boolean realizada;
    private LocalDate fechaRealizacion;

   //getters y setters
    public String getNombre() { return nombre;
    }
    public void setNombre(String nombre) { this.nombre = nombre;
    }
    public LocalDate getFechaCreacion() { return fechaCreacion;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) { this.fechaCreacion = fechaCreacion;
    }
    public LocalDate getFechaExpiracion() { return fechaExpiracion;
    }
    public void setFechaExpiracion(LocalDate fechaExpiracion) { this.fechaExpiracion = fechaExpiracion;
    }
    public boolean isRealizada() { return realizada;
    }
    public void setRealizada(boolean realizada) { this.realizada = realizada;
    }
    public LocalDate getFechaRealizacion() { return fechaRealizacion;
    }
    public void setFechaRealizacion(LocalDate fechaRealizacion) { this.fechaRealizacion = fechaRealizacion;
    }

    // Crear nombre para tarea, lo escribe el usuario
    // Constructor que recibe como parámetro del nombre de la tarea

    public Tarea(String nombre){
        this.nombre = nombre;
    }

    //Tarea debe tener fecha de creación.
    // Se obtiene automáticamente por el sistema al crear tarea
    //Iniciarla con bloque de inicialización
    {
       fechaCreacion = LocalDate.now();
    }

    // Sobreescribir métodos equals y hashCode,
    // para que sólo se use el nombre.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tarea tarea = (Tarea) o;

        return nombre.equals(tarea.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }









}
