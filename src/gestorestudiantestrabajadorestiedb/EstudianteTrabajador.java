/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorestudiantestrabajadorestiedb;

/**
 *
 * @author Estudiante
 */
public class EstudianteTrabajador extends Estudiante{
    String empresa, cargo;

    public EstudianteTrabajador(String empresa, String cargo, String cédula, String nombre, String dirección, String fechaNacimiento, char sexo, Carrera carrera) {
        super(cédula, nombre, dirección, fechaNacimiento, sexo, carrera);
        this.empresa = empresa;
        this.cargo = cargo;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Empresa donde trabaja: " + this.empresa);
        System.out.println("Cargo en empresa donde trabaja: " + this.cargo);
    } 

    
    
    
}
