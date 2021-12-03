package org.generation.italy.eventi;
import java.util.ArrayList;
import java.util.List;

public class ProgrammEventi {

	//attributi
	private String titolo;
	private List<Evento> eventi;
	
	//costruttore
	public ProgrammEventi(String titolo) {
		this.titolo = titolo;
		this.eventi = new ArrayList<>();
		
	}
	
	//getter e setter
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Evento> getEventi() {
		return eventi;
	}

	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}

	//metodi
	public void addEvent() {
		
	}
	
	public void allEvent() {
		
	}
	
	
	
	
	
	
}
