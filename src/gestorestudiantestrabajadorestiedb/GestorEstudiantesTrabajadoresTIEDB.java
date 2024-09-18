/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gestorestudiantestrabajadorestiedb;

/**
 *
 * @author Estudiante
 */
public class GestorEstudiantesTrabajadoresTIEDB {

    public static void main(String[] args) {
        GestorEstudiantes g = new GestorEstudiantes(5);
        Carrera c = new Carrera("Software");
        g.registrar(new Estudiante("1803193948", "Pedro Martínez", "Ambato", "02/12/1981", 'M', c));
        g.registrar(new EstudianteTrabajador("UTA EP", "Comercial", "0903193950", "Juana Achachi", "Quito", "02/12/1998", 'F', c ));
        g.imprimir();
    }
}
