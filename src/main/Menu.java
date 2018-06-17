package main;
import java.util.Scanner;

import conversores.Operacao;
import sistemadearquivos.ConversorLayouts;

public class Menu {

	public static void main(String[] args) {
		String opcao = " ";
		try {
			Scanner scanner = new Scanner(System.in);
			while (opcao != null) {
				String numero1, numero2;
				displayInfo();
				System.out.print("Opcao: ");
				opcao = scanner.next();
				switch (opcao) {
				case "1":
					System.out.print("Numero 1: ");
					numero1 = scanner.next();
					System.out.print("Numero 2: ");
					numero2 = scanner.next();
					System.out.printf("\n==>%s + %s = %s\n", numero1, numero2,
							Operacao.somarHexadecimal(numero1, numero2));
					break;
				case "2":
					System.out.print("Numero 1: ");
					numero1 = scanner.next();
					System.out.print("Numero 2: ");
					numero2 = scanner.next();
					System.out.printf("\n==>%s * %s = %s\n", numero1, numero2,
							Operacao.multiplicarHexadecimal(numero1, numero2));
					break;
				case "3":
					System.out.print("Numero 1: ");
					numero1 = scanner.next();
					System.out.print("Numero 2: ");
					numero2 = scanner.next();
					System.out.printf("\n==>%s\n", ConversorLayouts.obterHoraMinSeg(numero1, numero2)); 
					break;
				case "4":
					System.out.print("Numero 1: ");
					numero1 = scanner.next();
					System.out.print("Numero 2: ");
					numero2 = scanner.next();
					System.out.printf("\n==>%s\n", ConversorLayouts.obterData(numero1, numero2));
					break;	
				case "0":
					opcao = null;
					break;
				}
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void displayInfo() {
		System.out.println("\n");
		System.out.println("****************************************");
		System.out.println("*              CONVERSOR               *");
		System.out.println("****************************************");
		System.out.println("*  OPCOES:                             *");
		System.out.println("*  0 - SAIR         3 - HORA/MIN/SEG   *");
		System.out.println("*  1 - SOMAR HEXA   4 - DATA           *");
		System.out.println("*  2 - MULTI HEXA                      *");
		System.out.println("****************************************");
	}

}