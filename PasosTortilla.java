package tortillaPatata;

import java.util.Scanner;

public class PasosTortilla {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			boolean sufIngredientes = false;
			boolean sufPatatas = false;
			boolean sufCebolla = false;
			boolean sufHuevos = false;
			boolean bothSides = false;

			String Patata = "Patata";
			String huevos = "huevos";
			String resp = "";

			System.out.println("Bienvenido a como hacer una tortilla de patatas");
			// paso1 comprar ingredientes
			while (sufIngredientes == false) {
				resp = "";
				System.out.println("Primero, tienes suficientes ingredientes?: ");
				resp = sc.nextLine();
				if (resp.equalsIgnoreCase("si")) {
					sufIngredientes = true;
				} else {
					System.out.println("ve a comprar");
				}
			}

			// paso2 pelar patatas
			while (sufPatatas == false) {
				resp = "";
				System.out.println("Tienes suficientes patatas?: ");
				resp = sc.nextLine();
				if (resp.equalsIgnoreCase("si")) {
					sufPatatas = true;
				} else {
					System.out.println("pela mas patatas");
				}
			}
			// paso3 cortamos las patatas
			System.out.println("- cortamos las patatas");


			// paso3.1 tortilla patatas con cebolla
			System.out.println("Quieres una tortilla con cebolla?: ");
			resp = sc.nextLine();
			// si:
			if (resp.equalsIgnoreCase("si")) {
				resp = "";
				// comprobamos la cantidad de cebolla
				System.out.println("- picamos la cebolla");

				while (sufCebolla == false) {
					System.out.println("Tienes suficiente cebolla?: ");
					resp = sc.nextLine();
					if (resp.equalsIgnoreCase("si")) {
						sufCebolla = true;
					} else {
						System.out.println("- pica mas cebolla");
					}
				}
				System.out.println("- ponemos a calentar la sarten ");
				System.out.println("- añadimos aceite");

			} else {
				// a partir de aqui es lo mismo para sin cebolla que con cebolla
				System.out.println("- ponemos a calentar la sarten ");
				System.out.println("- añadimos aceite");
			}
			if (sufCebolla == true) {
				System.out.println("freimos la patata y la cebolla");
			} else {
				System.out.println("freimos la patata");
			}
			
			// Mientras vamos con los huevos:
			System.out.println("Cascamos unos huevos");
			while (sufHuevos == false) {
				System.out.println("Tienes suficientes Huevos?: ");
				resp = sc.nextLine();
				if (resp.equalsIgnoreCase("si")) {
					sufHuevos = true;
				} else {
					System.out.println("- casca mas huevos");
				}
			}
			System.out.println("- batimos los huevos");
			if (sufCebolla == true) {
				System.out.println("Mezclamos con la patata y la cebolla");
			} else {
				System.out.println("Mezclamos con las patatas");
			}
			
			System.out.println("freimos a fuego lento");
			
			while (bothSides == false) {
				resp = "";
				System.out.println("Está hecha por los dos lados?: ");
				resp = sc.nextLine();
				if (resp.equalsIgnoreCase("si")) {
					bothSides = true;
					System.out.println("- Ya tendrias tu tortilla de patata ");
				} else {
					System.out.println("dale la vuelta");
				}
			}
			
			
			
			
			

		}

	}