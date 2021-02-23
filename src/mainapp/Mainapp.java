package mainapp;

import javax.swing.JOptionPane;
import models.Arbol;
import models.Nodo;

public class Mainapp {
	/**
	 * Dado el c�digo base de los �rboles con sus respectivos recorridos (pre, in y
	 * post). Se pide:
	 * 
	 * 1. Cambiar el valor que almacenan los nodos a String. 
	 * 2. Hacer que el �rbol
	 * no sea binario, sino N-ario. Es decir, un nodo puede tener tantos hijos como
	 * desee. 
	 * 3. Cambiar los m�todos pre y post recorrido, el recorrido inorden es
	 * imposible con �rboles n-arios, elim�nalo. 
	 * 4. Implementa los siguientes
	 * m�todos en �rbol (y los necesarios en Nodo):
	 * 
	 * 4.1.- Nodo buscarNodo(String valor); Busca a lo largo del recorrido del �rbol
	 * si existe un nodo con ese valor. Si lo encuentra, lo devuelve (el nodo en
	 * s�). Si no lo encuentra en todo el �rbol devuelve null.
	 * 
	 * 4.2.- Nodo insertarNodo(Nodo padre, String valor); Inserta un nuevo nodo con
	 * el valor que se pasa por par�metro bajo el nodo padre si existe. Deber�
	 * buscar el nodo, y al encontrarlo, crear� un nodo hijo con ese valor y lo
	 * devuelve.
	 * 
	 * 4.3.- String path(String valor); Se le pasar� un String valor, este m�todo
	 * buscar� si hay un Nodo con ese valor, y si lo encuentra devolver� la ruta o
	 * camino a seguir desde la ra�z hasta dicho nodo. E.g.:
	 * 
	 * ~/pollo/dos/cinco/seis/
	 * 
	 * 4.4.- void mostrarArbol(); Este m�todo mostrar� el path de cada uno de los
	 * nodos siguiendo un recorrido PREORDEN. E.g.:
	 * 
	 * ~/ ~/pollo/ ~/pollo/uno/ ~/pollo/dos/ ~/pollo/dos/cinco/
	 * ~/pollo/dos/cinco/seis/ ~/cerdo/ ~/cerdo/tres/ ~/ternera/ ~/ternera/cuatro/
	 * 
	 * Los ejemplos que dejo est�n basados en el �rbol de la imagen.
	 * 
	 * Buena suerte.
	 * 
	 * P.D.: esta pr�ctica es corta (en LoC) pero conseguir los 4 m�todos puede
	 * resultar estresante, recomiendo paciencia y depurar. Ahora bien, los que lo
	 * consig�is ser�is expertos en recursividad.
	 * 
	 */

	public static void main(String[] args) {

		int opcion = 0;
		int elemento = 0;
		String nombre;
		Arbol arbolito = new Arbol();

		// menu de opciones
		do {

			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
								  "1 - Agregar Nodo\n" 
								+ "2 - Recorrer el Arbol en inOrden\n" 
								+ "3 - Recorrer el Arbol en preOrden\n"
								+ "4 - Recorrer el Arbol en postOrden\n" 
								+ "5 - Buscar nodo en el Arbol\n"
								+ "6 - Salir\n" + "Elige una opcion",
						"Arboles", JOptionPane.QUESTION_MESSAGE));

				switch (opcion) {
				case 1:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del nodo",
							"Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
					nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo", "Agregando Nodo",
							JOptionPane.QUESTION_MESSAGE);
					arbolito.insertarNodo(elemento, nombre);
					break;

				case 2:
					if (!arbolito.estaVacio()) {
						arbolito.inOrden(arbolito.raiz);
					} else {
						JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Cuidado",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;

				case 3:
					if (!arbolito.estaVacio()) {
						arbolito.preOrden(arbolito.raiz);
					} else {
						JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Cuidado",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;

				case 4:
					if (!arbolito.estaVacio()) {
						arbolito.postOrden(arbolito.raiz);
					} else {
						JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Cuidado",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;

				case 5:
							// WIP
					break;

				case 6:
					JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",
							JOptionPane.INFORMATION_MESSAGE);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Cuidado",
							JOptionPane.INFORMATION_MESSAGE);
				}

			} catch (NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
			}
		} while (opcion != 6);
	}
}