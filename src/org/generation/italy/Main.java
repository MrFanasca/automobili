package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Scrivere un programma che simula il funzionamento di due automobili. Ogni automobile ha:
		   una velocità attuale (numero intero, km/h)
		   ha una disponibilità di carburante (l)
		   un consumo medio km/l
		   km percorsi (km)
		   Ogni automobile può effettuare le seguenti operazioni:
		   accelera (incrementa di 10 la velocità attuale fino a un max di 200 km/h)
		   decelera (decrementa di 10 la velocità attuale fino ad un minimo di 0 km/h) 
		   visualizzaDati (mostra i dati dell'automobile)
		   aggiorna (simula il trascorrere di 1h di tempo)
		   All'avvio, creare due automobili con le seguenti caratteristiche:
		   auto1:
		   velocità attuale: 0
		   carburante: 30 l
		   un consumo medio: 20 km/l
		   km percorsi: 0
 		   auto2:
		   velocità attuale: 0
		   carburante: 50 l
		   un consumo medio: 23 km/l
		   km percorsi: 0
		   L'utente sceglie sceglie l'operazione (accelera/decelera) su una delle due automobili; dopo ogni 
		   scelta aggiornare i dati delle due automobili e visualizzarli */
		
		Scanner sc = new Scanner(System.in);
		
		// dichiaro gli oggetti della classe automobili
		// ogni volta che si scrive "nerw automobili (.....)" si 
		automobili auto1 = new automobili(30, 20);
		automobili auto2 = new automobili(50, 23);
		automobili autoCorrente;									
		String risposta;
		
		/* non lo posso più fare perché gli attributi sono "private" 
		//Dati relativi all'automobile 1
		auto1.velocità = 0;
		auto1.carburante = 30;
		auto1.consumoMedio = 20;
		auto1.kmPercorsi= 0;
		
		// Dati relativi all'automobile 2
		auto2.velocità = 0;
		auto2.carburante = 50;
		auto2.consumoMedio = 23;
		auto2.kmPercorsi= 0;*/
		
		do
		{
			// vado a visualizzare i dati
			System.out.println("\n\n\n\n\n\n\n\nAuto1: ");										
			auto1.visualizzaDati();
			System.out.println("\n\nAuto2: ");
			auto2.visualizzaDati();
			
			System.out.println("Quale auto vuoi guidare? (1/2)");
			risposta=sc.nextLine();
			if (risposta.equals("1"))
				autoCorrente=auto1;
			else
				autoCorrente=auto2;
			
			System.out.println("Cosa vuoi fare? (accelerare/decelarare/continuare)");
			risposta=sc.nextLine();
			switch (risposta)
			{
				case "accelerare":
					autoCorrente.accelera();
					break;
				case "decelerare":
					autoCorrente.decelera();
					break;
				default:
					System.out.println("Le auto preseguiranno alla stessa velocità");
			}
			auto1.aggiorna();
			auto2.aggiorna();
			
			System.out.println("Vuoi continuare? (s/n)");
			risposta=sc.nextLine();
			
		}	while (risposta.equals("s"));
		
		sc.close();
	}

}
