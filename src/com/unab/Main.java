/**
 * 
 */
package com.unab;

import java.util.Scanner;
import com.unab.Trabajadores.*;

/**
 * @author Luis Zenteno
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Trabajadores trabajador = new Trabajadores();

		trabajador.setNombres(trabajador.validarNombres("Ingrese los nombres: ", sc));
		trabajador.setApellidos(trabajador.validarApellidos("Ingrese los apellidos: ", sc));
		trabajador.setRut(trabajador.validarRut("Ingrese el run --> ", sc));
		trabajador.setTelefono(trabajador.validarTelefono("Ingrese el telefono: ", sc));
		trabajador.setEdad(trabajador.validarEdad("Ingrese la edad: ", sc));
		
		System.out.println(trabajador.toString());
		System.out.println("\nRut como número entero ↓ ");
		trabajador.descomponerRun();
		
		

	}

}
