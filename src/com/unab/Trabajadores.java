package com.unab;
import java.util.Scanner;

public class Trabajadores {
	
	private String nombres;
	private String apellidos;
	private String run;
	private String telefono;
	private String edad;
	private String rut;
	
	public Trabajadores() {
		
	}
	
	public Trabajadores(String nombres, String apellidos, String rut, String telefono, String edad) {
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.telefono = telefono;
		this.edad = edad;
	}

	@Override
	public String toString() {
		
		return "\nTrabajadores: \nNOMBRES --> " + nombres + "\nAPELLIDOS --> " + apellidos + "\nRUN --> " + rut + "\nTELEFONO --> "
				+ telefono + "\nEDAD --> " + edad;
	}
	
	public String nombreCompleto() {
		
		return "\nNOMBRE COMPLETO --> " + nombres + " " + apellidos;
 	}
	
	public int descomponerRun() {
		
		int rutEntero = 0;
		
		for (int x = 0; x < rut.length()-2; x++) {
			
			char c = rut.charAt (x); System.out.print(c);
			
			 rutEntero = Character.getNumericValue(c);
		}
		return rutEntero;
		
	}
	
	public String validarNombres(String mensaje, Scanner sc) {
		
		boolean condicion = true;
		String entrada = "";
		
		while (condicion) {
			System.out.print(mensaje);
				entrada = sc.nextLine();

				if (entrada.matches("[a-z A-Z\\s]+${1,}")) {
					condicion = false;

				} else {

					System.out.println("Dato no valido, intentelo nuevamente");
				}
			}
			return entrada;
		}
	
public String validarApellidos(String mensaje, Scanner sc) {
		
		boolean condicionApe = true;
		String entrada = "";
		
		while (condicionApe) {
			
			System.out.print(mensaje);
				entrada = sc.nextLine();

				if (entrada.matches("[a-z A-Z\\s]+${1,}")) {
					condicionApe = false;

				} else {

					System.out.println("Dato no valido, intentelo nuevamente");
				}
			}
			return entrada;
		}
	
	public String validarEdad(String mensaje, Scanner sc) {
		
		boolean condicionNum = true;
		String entrada = "";
		
		while(condicionNum) {
			
			System.out.print(mensaje);
			entrada = sc.nextLine();
			
			if (entrada.matches("[0-9]{1,2}")) {
				
				condicionNum = false;
			}
			else {
				
				System.out.println("Edad ingresada no válida, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	public String validarRut(String mensaje, Scanner sc) {
		
		boolean condicionRun = true;
		String runEntrada = "";
		
		while (condicionRun) {
			
			System.out.print(mensaje);
			runEntrada = sc.nextLine();
			
			if (runEntrada.matches("\\d{8}-\\d{1}")) {
				
				condicionRun = false;
			}
			else {
				
				System.out.println("Run ingresado no valido, intentelo nuevamente");
			}
		}
		
		return runEntrada;
	}
	
	public String validarTelefono(String mensaje, Scanner sc) {
		
		boolean condicionTel = true;
		String entrada = "";
		
		while(condicionTel) {
			
			System.out.print(mensaje);
			entrada = sc.nextLine();
			
			if (entrada.matches("\\d{8}")) {
				
				condicionTel = false;
			}
			else {
				
				System.out.println("Numero de telefono no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the run
	 */
	public String getRun() {
		return run;
	}

	/**
	 * @param run the run to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

}



