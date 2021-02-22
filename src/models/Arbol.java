package models;

public class Arbol {
	public Nodo raiz;

	public Arbol() {
		raiz = null;
	}

	/**
	 * Metodo para saber cuando arbol esta vacio
	 */
	public boolean estaVacio() {
		return raiz == null;
	}
	
	/**
	 * Método para recorrer recursivamente el árbol preOrden
	 * @param r
	 */
	public void preOrden(Nodo r) {
		if (r != null) {
			System.out.println(r.dato);
			preOrden(r.nodoIzq);
			preOrden(r.nodoDer);
		}
	}

	/**
	 * Método para recorrer recursivamente el árbol inOrden
	 * @param r
	 */
	public void inOrden(Nodo r) {
		if (r != null) {
			inOrden(r.nodoIzq);
			System.out.println(r.dato);
			inOrden(r.nodoDer);
		}
	}
	
	/**
	 * Método para recorrer recursivamente el árbol postOrden
	 * @param r
	 */
	public void postOrden(Nodo r) {
		if (r != null) {
			postOrden(r.nodoIzq);
			postOrden(r.nodoDer);
			System.out.println(r.dato);
		}
	}
}