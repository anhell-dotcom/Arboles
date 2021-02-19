package mainapp;

import models.Arbol;
import models.Nodo;

public class Mainapp {

	/**
	 * Dado el código base de los árboles con sus respectivos recorridos (pre, in y
	 * post). Se pide:
	 * 
	 * 1. Cambiar el valor que almacenan los nodos a String. 
	 * 2. Hacer que el árbol
	 * no sea binario, sino N-ario. Es decir, un nodo puede tener tantos hijos como
	 * desee. 
	 * 3. Cambiar los métodos pre y post recorrido, el recorrido inorden es
	 * imposible con árboles n-arios, elimínalo. 
	 * 4. Implementa los siguientes
	 * métodos en Árbol (y los necesarios en Nodo):
	 * 
	 * 4.1.- Nodo buscarNodo(String valor); Busca a lo largo del recorrido del árbol
	 * si existe un nodo con ese valor. Si lo encuentra, lo devuelve (el nodo en
	 * sí). Si no lo encuentra en todo el árbol devuelve null.
	 * 
	 * 4.2.- Nodo insertarNodo(Nodo padre, String valor); Inserta un nuevo nodo con
	 * el valor que se pasa por parámetro bajo el nodo padre si existe. Deberá
	 * buscar el nodo, y al encontrarlo, creará un nodo hijo con ese valor y lo
	 * devuelve.
	 * 
	 * 4.3.- String path(String valor); Se le pasará un String valor, este método
	 * buscará si hay un Nodo con ese valor, y si lo encuentra devolverá la ruta o
	 * camino a seguir desde la raíz hasta dicho nodo. E.g.:
	 * 
	 * ~/pollo/dos/cinco/seis/
	 * 
	 * 4.4.- void mostrarArbol(); Este método mostrará el path de cada uno de los
	 * nodos siguiendo un recorrido PREORDEN. E.g.:
	 * 
	 * ~/ ~/pollo/ ~/pollo/uno/ ~/pollo/dos/ ~/pollo/dos/cinco/
	 * ~/pollo/dos/cinco/seis/ ~/cerdo/ ~/cerdo/tres/ ~/ternera/ ~/ternera/cuatro/
	 * 
	 * Los ejemplos que dejo están basados en el árbol de la imagen.
	 * 
	 * Buena suerte.
	 * 
	 * P.D.: esta práctica es corta (en LoC) pero conseguir los 4 métodos puede
	 * resultar estresante, recomiendo paciencia y depurar. Ahora bien, los que lo
	 * consigáis seréis expertos en recursividad.
	 * 
	 */

	public static void main(String[] args) {

		// Creamos la raiz
		Nodo raiz = new Nodo(1, null);

		// Creamos nodos y sus papas
		Nodo nodo2 = new Nodo(2, raiz);
		Nodo nodo7 = new Nodo(7, raiz);
		Nodo nodo3 = new Nodo(3, nodo2);
		Nodo nodo4 = new Nodo(4, nodo2);
		Nodo nodo5 = new Nodo(5, nodo4);
		Nodo nodo6 = new Nodo(6, nodo4);
		Nodo nodo8 = new Nodo(8, nodo7);
		Nodo nodo9 = new Nodo(9, nodo7);

		// Establecemos los hijos de cada nodo
		raiz.setNodoIzq(nodo2);
		raiz.setNodoDer(nodo7);
		nodo2.setNodoIzq(nodo3);
		nodo2.setNodoDer(nodo4);
		nodo7.setNodoIzq(nodo8);
		nodo7.setNodoDer(nodo9);
		nodo4.setNodoIzq(nodo5);
		nodo4.setNodoDer(nodo6);

		Arbol arbolito = new Arbol(raiz);

		arbolito.preOrden();
	}
}