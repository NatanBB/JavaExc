package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rooms[] vect = new Rooms[10];
		
		System.out.println("How many rooms will be rented?");
		int qtd = sc.nextInt();
		
		for (int i=1; i<=qtd; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rooms(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i=1; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
