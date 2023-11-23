package org.generation.italy;

public class automobili {
	
	int velocità;
	float carburante, consumoMedio, kmPercorsi;			// disponibilità 
	
	public void accelera() 
	{
		if (velocità<=190 && carburante>0)
			velocità+=10; 								// mi accelera di 10 km/h
	}
	
	public void decelera() 
	{
		if (velocità>=10)
			velocità-=10; 								// mi decelera di 10 km/h
	}
	
	public void visualizzaDati() 
	{
		System.out.println("Velocità: " + velocità + " km/h");
		System.out.println("Carburante: " + carburante + " l");
		System.out.println("Consumo medio: " + consumoMedio + "km/l");
		System.out.println("Chilometri percorsi: " + kmPercorsi + "km");
	}
	
	public void aggiorna ()								// simula il passaggio di 1h
	{
		int kmPercorsi1h=velocità;						// in un ora ho percorso un numero di km pari alla velocità
		kmPercorsi+=kmPercorsi1h;						// aggiunge al totale i km percorsi
		carburante-=kmPercorsi1h/consumoMedio;			// scalo i litri utilizzati dal carburante totale (in un ora)
		if (carburante<=0)								// se non c'è carburante la macchina "si ferma"
			velocità=0;
	}
}
