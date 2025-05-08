package git5;

import java.util.ArrayList;
import java.util.Scanner;

public class version1_0 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        Estudiante estudiante = new Estudiante();

	        System.out.print("Introduce el nombre: ");
	        estudiante.nombre = scanner.nextLine();

	        System.out.print("Introduce los apellidos: ");
	        estudiante.apellidos = scanner.nextLine();

	        System.out.print("Introduce la fecha de nacimiento (dd/mm/aaaa): ");
	        estudiante.fechaNacimiento = scanner.nextLine();

	        System.out.print("Introduce el DNI: ");
	        estudiante.dni = scanner.nextLine();

	        System.out.print("Introduce los estudios previos: ");
	        estudiante.estudiosPrevios = scanner.nextLine();

	        System.out.print("Introduce el teléfono: ");
	        estudiante.telefono = scanner.nextLine();

	       
	        System.out.println("\n--- DATOS DEL ESTUDIANTE ---");
	        System.out.println("Nombre: " + estudiante.nombre);
	        System.out.println("Apellidos: " + estudiante.apellidos);
	        System.out.println("Fecha de nacimiento: " + estudiante.fechaNacimiento);
	        System.out.println("DNI: " + estudiante.dni);
	        System.out.println("Estudios previos: " + estudiante.estudiosPrevios);
	        System.out.println("Teléfono: " + estudiante.telefono);

	        scanner.close();
	    }
	}

	class Estudiante {
	    String Nombre;
	    String apellidos;
	    String fechaNacimiento;
	    String dni;
	    String estudiosPrevios;
	    String telefono;
	}