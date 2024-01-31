package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar?: ");
		int n = sc.nextInt();
		Client[] vect = new Client[n];

		sc.nextLine();

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa: \n", i + 1);

			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();

			sc.nextLine();

			vect[i] = new Client(name, age);
		}

		int idadeVelho = 0;
		String nomeVelho = null;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() > idadeVelho) {
				nomeVelho = vect[i].getName();

			}
		}

		System.out.println("O valor mais velho é: " + nomeVelho);

		sc.close();
	}

}
