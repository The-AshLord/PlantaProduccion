package Clases;

import java.util.ArrayList;

public class Operativo extends Empleado{

	ArrayList<String> Cursos = new ArrayList<String>();
	String Zona;
	String Oficio;
	String Labores;
	
	public static void ActualizarCursos() {
		
		System.out.println("Ac� Podr�s Actualizar Tus Cursos: ");
		
	}
	
	public static void ConsultarCursos() {
		
		System.out.println("Aqu� Podr�s Consultar los Curos que tienes registrados: ");
		
	}
	
	public static void VerLabores() {
		
		System.out.println("A Continuaci�n podr�s ver Las Labores que te han sido Asignadas: ");
		
	}
	
	public static void CambiarLabores() {
		
		System.out.println("Ac� podr�s mod�car las Labores que te han asignado: ");
		
	}
	
	public static void MDatosOperativo() {
		
	//Modifica los datos personales, los heredados de Empleado, como los de operativo.
		System.out.println("Desde ac� podr�s Modificar tus Datos personales como Operativo: ");
		
	}
}
