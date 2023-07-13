package lifofifo;

import java.util.Arrays;

public class LifoFifo {

	public static void main(String[] args) {

		int[] pila = {};
		int[] fila = {};

		pila = pushPila(1, pila);
		pila = pushPila(2, pila);
		pila = pushPila(3, pila);
		System.out.println("PUSH PILA : "+Arrays.toString(pila));
		
		int elemntAEliminar = pila[pila.length-1];		
		pila = popPila(pila);
		
		System.out.println("POP PILA LIFO  elmento a eliminar : "+elemntAEliminar);
		System.out.println("POP PILA LIFO resultado array : "+Arrays.toString(pila));

		fila = pushFila(1, fila);
		fila = pushFila(2, fila);
		fila = pushFila(3, fila);
		System.out.println("PUSH FILA : "+Arrays.toString(fila));
		
		elemntAEliminar = pila[0];
		fila = popFila(fila);
		
		System.out.println("POP PILA LIFO elmento a eliminar: "+elemntAEliminar);
		System.out.println("POP FILA FIFO resultado array: "+Arrays.toString(fila));

	}

	static int[] pushPila(int element, int[] pila) {

		int[] res = new int[pila.length + 1];

		for (int i = 0; i < pila.length; i++) {

			res[i] = pila[i];
		}
		res[pila.length] = element;
		return res;

	}

	static int[] popPila(int[] pila) {
		int[] res = new int[pila.length - 1];
		for (int i = 0; i < pila.length - 1; i++) {

			res[i] = pila[i];
		}

		return res;
	}

	static int[] pushFila(int element, int[] fila) {
		int[] res = pushPila(element,fila);
		return res;
	}

	static int[] popFila(int[] fila) {
		int[] res = new int[fila.length - 1];

		for (int i = 1; i < fila.length; i++) {

			res[i - 1] = fila[i];
		}
		return res;
	}

}
