/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author Matias
 */
public class Tp7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia inglesI = new Materia(001, "Ingles I", 2020);
        Materia matematicaI = new Materia(002,"Matematica I", 2020);
        Materia labI = new Materia (003,"Laboratorio I", 2020);
        Alumno ml = new Alumno (1001, "Martin", "Lopez");
        Alumno mb = new Alumno (1002, "Brenda", "Martinez");
        ml.agregarMateria(labI);
        ml.agregarMateria(inglesI);
        ml.agregarMateria(matematicaI);
        mb.agregarMateria(labI);
        mb.agregarMateria(inglesI);
        mb.agregarMateria(matematicaI);
        ml.agregarMateria(labI);
        System.out.println("Berta Martinez esta inscripta a: ");
        ml.mostrar();
        System.out.println("\n");
        System.out.println("Martin Lopez esta inscripto a: ");
        mb.mostrar();
        
        /* Ambos estan inscriptos a la misma cantidad de materias, porque
        utilize una excepcion al momento de agregar la materia a la lista para
        saber si esa materia ya pertenecia o no a la lista.
        */
        
        
    }
    
}
