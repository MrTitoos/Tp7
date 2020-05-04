/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    int mat = 0;
    ArrayList<Materia> materia = new ArrayList<>();

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void agregarMateria(Materia m){
        if (!materia.contains(m)){
            materia.add(m);
            mat+=1;
        }
    }
    
    int cantidadMaterias(){
        return mat;
    }
    
    public void mostrar(){
        materia.forEach((m) -> {
            System.out.println(m.getNombre());
        });
    }
}
