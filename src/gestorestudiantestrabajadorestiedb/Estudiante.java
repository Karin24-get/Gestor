/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorestudiantestrabajadorestiedb;

/**
 *
 * @author Estudiante
 */
public class Estudiante {
    String cédula, nombre, dirección, fechaNacimiento;
    char sexo;
    Carrera carrera;

    public Estudiante(String cédula, String nombre, String dirección, String fechaNacimiento, char sexo, Carrera carrera) {
        this.cédula = cédula;
        this.nombre = nombre;
        this.dirección = dirección;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.carrera = carrera;
    }

    public void imprimir() {
        System.out.println("Cédula: " + this.cédula);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Dirección: " + this.dirección);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Carrera: " + this.carrera.nombre);
    }
    
    
}
