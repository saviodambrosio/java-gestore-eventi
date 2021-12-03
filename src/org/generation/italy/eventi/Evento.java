package org.generation.italy.eventi;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

	//Attributi
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	
	//Costruttore
	public Evento(String titolo, LocalDate data, int postiTotali) throws Exception {
		
		if (postiTotali > 0) {
			this.postiTotali = postiTotali;
		}else {
			throw new Exception ("Errore : il valore dei posti totali deve essere maggiore di zero");
		}
		
		if (data.isAfter(LocalDate.now())) {
			this.data = data;
		}else {
			throw new Exception ("Errore : il valore della data deve essere valido");
		}
		this.titolo = titolo;
		this.postiPrenotati = 0;
	}
	
	
	
	

	//Getter and Setter 
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	//Metodi
	public void prenota() throws Exception {
		if (data.isBefore(LocalDate.now())) {
			throw new Exception ("Errore : il valore della data deve essere valido");
		}else if (postiPrenotati == postiTotali) {
			throw new Exception ("Errore : non ci sono più posti disponibili");
		}else {
			postiPrenotati++;
		}
			
	}
	
	public void disdici() throws Exception {
		if (data.isBefore(LocalDate.now())) {
			throw new Exception ("Errore : il valore della data deve essere valido");
		}else if (postiPrenotati == 0) {
			throw new Exception ("Errore : non hai posti prenotati");
		}else {
			postiPrenotati--;
		}
	}

	//Override
	@Override
	public String toString() {
		String dataFormattata;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dataFormattata = this.data.format(df);
		return dataFormattata + " - " + this.titolo;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

