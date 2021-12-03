package org.generation.italy.eventi;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//inserire nome evento
		System.out.println("Inserire il nome dell'evento al quale si desidera partecipare: ");
		String titolo = scanner.nextLine();
		
		//inserire numero posti evento
		System.out.println("Inserire il numero di posti totali dell'evento al quale si desidera partecipare: ");
		int postiTotali = scanner.nextInt();
		
		//Data
		
		System.out.print("Inserisci il giorno dell'evento: ");
        int giorno = scanner.nextInt();
        System.out.print("Inserisci il mese: ");
        int mese = scanner.nextInt();
        System.out.print("Inserisci l'anno: ");
        int anno = scanner.nextInt();
        LocalDate data = LocalDate.of(anno, mese, giorno);
        System.out.println("La data è: " + data);
		
		//evento 
        try {
			Evento evento = new Evento(titolo, data, anno);
			String scelta;
			boolean valido = false;	
			System.out.println("Vuoi partecipare all'evento? si/no");
			scanner.nextLine();
			do {			
				 scelta = scanner.nextLine();
				if (scelta.equals("no")) {
					System.out.println("Ok,grazie e arrivederci");
					valido = true;
					break;
				}
				System.out.println("Seleziona il numero di prenotazioni da effettuare");
				int numeroPrenotazioni = scanner.nextInt();
				for (int i=0; i<numeroPrenotazioni; i++) {
					evento.prenota();
				}
				System.out.println("Hai effettuato " + numeroPrenotazioni + " prenotazioni, sono disponibili ancora " + (postiTotali - numeroPrenotazioni) + " posti.");
				System.out.println("Indica il numero di biglietti da disdire, altrimenti digita 0");
				int numeroDisdetta = scanner.nextInt();
				for (int i=0; i<numeroDisdetta; i++) {
					evento.disdici();
				}
				System.out.println("Hai prenotato " + (numeroPrenotazioni - numeroDisdetta) + " posti, sono disponibili ancora " + (postiTotali - (numeroPrenotazioni - numeroDisdetta) ) + " posti.");
				break;
			} while(valido == false);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} 
		
		
		
		
		
		
		
		
		scanner.close();
	}

}
