package Clases;

import java.util.ArrayList;

public class Operativo extends Empleado{

	ArrayList<String> Cursos = new ArrayList<String>();
	String Zona;
	String Oficio;
	String Labores;
	
	public static void ActualizarCursos() {
		
		System.out.println("Acá Podrás Actualizar Tus Cursos: ");
		
	}
	
	public static void ConsultarCursos() {
		
		System.out.println("Aquí Podrás Consultar los Curos que tienes registrados: ");
		
	}
	
	public static void VerLabores() {
		
		System.out.println("A Continuación podrás ver Las Labores que te han sido Asignadas: ");
		
	}
	
	public static void CambiarLabores() {
		
		System.out.println("Acá podrás modícar las Labores que te han asignado: ");
		
	}
	
	public static void MDatosOperativo() {
		
	//Modifica los datos personales, los heredados de Empleado, como los de operativo.
		System.out.println("Desde acá podrás Modificar tus Datos personales como Operativo: ");
		
	}
}
