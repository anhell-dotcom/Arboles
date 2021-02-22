package models;

public class Nodo {
	int dato;
	String nombre; // nombre del nodo
	Nodo nodoIzq;
	Nodo nodoDer;
	
	// constructor
	public Nodo(int d, String nom) {
		this.dato=d;
		this.nombre=nom;
		this.nodoDer=null;
		this.nodoIzq=null;
	}
	
	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Nodo getNodoIzq() {
		return nodoIzq;
	}

	public void setNodoIzq(Nodo nodoIzq) {
		this.nodoIzq = nodoIzq;
	}

	public Nodo getNodoDer() {
		return nodoDer;
	}

	public void setNodoDer(Nodo nodoDer) {
		this.nodoDer = nodoDer;
	}

	public String toString() {
		return nombre + " Su dato es " + dato;		
	}
}