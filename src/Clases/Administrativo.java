package Clases;

import java.util.ArrayList;

public class Administrativo extends Empleado {	
	
	ArrayList<String> Titulos = new ArrayList<String>();
	int Experiencia;
	int PersonasACargo;
	int Extesion; 
	
	public static void Informes() {
		
		System.out.println("Acá Podrás Generar los Informes de Planta: ");
		
	}
	
	public static void ConsultarTitulos() {
		
		System.out.println("A Continuación podrás consultar los Títulos que tienes registrados: ");
		
	}
	
	public static void ModificarTitulos() {
		
		System.out.println("Aquí podrás Modificar tus Títulos registrados: ");
		
	}
	
	public static void MDatosAdminstrativo() {
		
	//Modifica los datos personales, tanto los heredados de Empleado, como los de Administrativo.
		System.out.println("Desde acá podrás Modificar tus Datos personales como Administrativo: ");
		
	}
}