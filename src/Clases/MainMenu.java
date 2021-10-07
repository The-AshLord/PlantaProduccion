package Clases;
import java.util.Scanner;

public class MainMenu {

	  static int OpcionUsuario = -1;                                     
	    static Scanner scanner = new Scanner(System.in);    
	    
	  public static void main(String[] args) {
		  while (OpcionUsuario != 0)
	      {
			  try{
				  System.out.println("***   PLANTA DE PRODUCCION ***\n");
	              System.out.println("     .:: MENU PRINCIPAL ::.   \n");
	              System.out.println("1. Operativos.                      ");
	              System.out.println("2. Administrativos.              ");            
	              System.out.println("3. Tecnicos.                     ");
	              System.out.println("4. No Tecnicos.                      ");
	              System.out.println("0. Salir                      \n");
	              System.out.print("Señor usuario, elige opción: _    ");
	              OpcionUsuario = Integer.parseInt(scanner.nextLine());   
	              switch(OpcionUsuario)
		             {
		             	case 1: 
		             		Operativo.ConsultarCursos();
		             		Operativo.ActualizarCursos();
		             		Operativo.VerLabores();
		             		Operativo.CambiarLabores();
		             		Operativo.MDatosOperativo();
		             		Operativo.DatosPersonales();
		             		Operativo.Nomina();
		             		Operativo.Vacaciones();
		                    break;
		                case 2: 
		                	Administrativo.ConsultarTitulos();
		                	Administrativo.Informes();
		                	Administrativo.MDatosAdminstrativo();
		                	Administrativo.ModificarTitulos();
		                	Administrativo.DatosPersonales();
		                	Administrativo.Nomina();
		                	Administrativo.Vacaciones();
		                    break;
		                case 3:
		                	Tecnico.ConsultarCursos();
		                	Tecnico.ActualizarCursos();
		                	Tecnico.VerLabores();
		                	Tecnico.CambiarLabores();
		                	Tecnico.MDatosOperativo();
		                	Tecnico.DatosPersonales();
		                	Tecnico.Nomina();
		                	Tecnico.Vacaciones();
		                    break;
		                case 4:
		                	NoTecnico.ConsultarCursos();
		                	NoTecnico.ActualizarCursos();
		                	NoTecnico.VerLabores();
		                	NoTecnico.CambiarLabores();
		                	NoTecnico.MDatosOperativo();
		                	NoTecnico.DatosPersonales();
		                	NoTecnico.Nomina();
		                	NoTecnico.Vacaciones();
		                	break;
		                case 0: 
		                    System.out.println("¡Gracias por Preferirnos!");
		                    break;
		                default:
		                    System.out.println("Número no valido");break;
		                }
		             System.out.println("\n"); 
		            }
		            catch(Exception e){
		                System.out.println("Uoop! Error!");
		            }
	        	}
		   }

}
