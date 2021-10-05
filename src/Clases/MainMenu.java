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
		             		//Codigo Opción 1
		                    break;
		                case 2: 
		                	//Codigo Opción 2
		                    break;
		                case 3: 
		                	//Codigo Opción 3
		                    break;
		                case 4:
		                	//Codigo Opción 4
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
