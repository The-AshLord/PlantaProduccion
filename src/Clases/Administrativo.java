package Clases;

import java.util.ArrayList;

public class Administrativo extends Empleado {	
	
	ArrayList<String> Titulos = new ArrayList<String>();
	int Experiencia;
	int PersonasACargo;
	int Extesion; 
	
	public static void Informes() {
		
		System.out.println("Ac� Podr�s Generar los Informes de Planta: ");
		
	}
	
	public static void ConsultarTitulos() {
		
		System.out.println("A Continuaci�n podr�s consultar los T�tulos que tienes registrados: ");
		
	}
	
	public static void ModificarTitulos() {
		
		System.out.println("Aqu� podr�s Modificar tus T�tulos registrados: ");
		
	}
	
	public static void MDatosAdminstrativo() {
		
	//Modifica los datos personales, tanto los heredados de Empleado, como los de Administrativo.
		System.out.println("Desde ac� podr�s Modificar tus Datos personales como Administrativo: ");
		
	}
}