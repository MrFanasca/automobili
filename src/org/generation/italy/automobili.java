package org.generation.italy;

public class automobili {
	
	// con private non permetto la modifica di tali valori dall'esterno della classe automobili
	private int velocità;								
	private float carburante, consumoMedio, kmPercorsi;	// disponibilità 
	
	// metodo costruttore: si utilizza per inizializzare gli attributi di un oggetto, si differenzia dagli
	// altri metodi perché:
	// - il nome del metodo è uguale al nome della classe
	// - non ha un valore di ritorno (per il momento: non ha il "void")
	// ogni volta che si crea un oggetto automobile bisogna indicare il valore del carburante e del consumo
	// medio (nella classe in cui si creo l'oggetto (es. Main))
	 
	// le variabili (float consumoMedio, float carburante) indicate nel costruttore vengono chiamate "parametri"
	// e rappresenteno i valori che ci vengono forniti da chi "crea" l'oggetto
	// normalmente i parametri del costruttore hanno lo stesso nome degli attributi. Per capire a quale delle
	// due variabili ci si riferisce, si usa la parola chiave "this", ad esempio:
	// 	"this.carburante" 	indica l'attributo della classe
	// 	"carburante" 		indica il parametro
	// la parola "this" è obbligatoria solo se c'è ambiguità (variabili con lo stesso nome).
	// se i parametri hanno un nome diverso (anche se non è la prassi), il "this" non è necessario
	public automobili(float carburante, float consumoMedio)
	{
		if (carburante<0)
		{
			System.out.println("Carburante non valido");
			carburante=0;										// valore di default
		}
		else
			this.carburante =carburante;	
		
		if (consumoMedio<=0)
		{
			System.out.println("Consumo medio non valido");
			consumoMedio=0;										// valore di default
		}
		else
			this.consumoMedio =consumoMedio;	
		velocità=0;
		kmPercorsi=0;
	}
	
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
		for(int i=0; i<kmPercorsi/10;i++)
			System.out.print("-");
		System.out.println();
		
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
