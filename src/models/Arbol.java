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
	
	/**
	 * Método para insertar un nodo en el árbol
	 * 
	 * @param d
	 * @param nom
	 */
	public void insertarNodo(int d, String nom) {
		Nodo nuevo = new Nodo(d, nom);
		if (raiz == null) {
			raiz = nuevo;
		} else {
			Nodo auxiliar = raiz;
			Nodo padre;
			while (true) {
				padre = auxiliar;
				if (d < auxiliar.dato) {
					auxiliar = auxiliar.nodoIzq;
					if (auxiliar == null) {
						padre.nodoIzq = nuevo;
						return; // finaliza la ejecución del método
					}
				} else {
					auxiliar = auxiliar.nodoDer;
					if (auxiliar == null) {
						padre.nodoDer = nuevo;
						return;
					}
				}
			}
		}
	}
	
	/**
	 * Método para buscar un nodo en el arbol
	 * @param d
	 * @return
	 */
	public Nodo buscarNodo(int d) {
		Nodo aux = raiz;
		while (aux.dato != d) {
			if (d < aux.dato) {
				aux = aux.nodoIzq;
			} else {
				aux = aux.nodoDer;
			}
			if (aux == null) {
				return null; // no encontró nada...
			}
		}
		return aux;
	}
}