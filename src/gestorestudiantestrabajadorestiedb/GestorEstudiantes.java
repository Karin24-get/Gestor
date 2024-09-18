/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorestudiantestrabajadorestiedb;

/**
 *
 * @author Estudiante
 */
public class GestorEstudiantes {
    Estudiante[] estudiantes;
    
    public GestorEstudiantes(int dim){
        this.estudiantes = new Estudiante[dim];
    }
    
    public boolean registrar(Estudiante estudiante){
        int posLibreParaEstudiante = -1;
        for (int i = 0; i < this.estudiantes.length; i ++){
            if (this.estudiantes[i] == null){
                if (posLibreParaEstudiante == -1)
                    posLibreParaEstudiante = i;
            } else
            if (this.estudiantes[i].equals(estudiante))
                return false;
        }
        if (posLibreParaEstudiante != -1){
            this.estudiantes[posLibreParaEstudiante] = estudiante;
            return true;
        }
        return false;
    }
    
    public void imprimir(){
        int núm = 1;
        for (Estudiante e : this.estudiantes)
            if (e != null){
                System.out.println("Estudiante #" + núm);
                e.imprimir();
                System.out.println("  ");
                núm ++;
            }
    }
}
