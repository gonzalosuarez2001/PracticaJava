package prueba;

public class SalaDeCine {

	boolean butacas[][];

	public SalaDeCine() {
		butacas = new boolean[4][4];
	}

	public boolean estaSalaVacia() {

		boolean estaVacia = true;

		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas.length; j++) {
				if (butacas[i][j] != false) {
					estaVacia = false;
					return estaVacia;
				}
			}
		}
		return estaVacia;
	}

	public boolean estaButacaVacia(int fila, int columna) {

		boolean estaVacia = true;

		if (butacas[fila][columna] != false) {
			estaVacia = false;
			return estaVacia;
		}

		return estaVacia;

	}

	public boolean ocuparButaca(int fila, int columna) {

		boolean seOcupo = false;

		if (butacas[fila][columna] == false) {
			butacas[fila][columna] = true;
			seOcupo = true;
			return seOcupo;
		}
		return seOcupo;
	}

	public int calcularButacasOcupadas() {

		int contador = 0;

		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas.length; j++) {
				if (butacas[i][j] == true) {
					contador++;
				}
			}
		}
		return contador;
	}

	public boolean hayEspacioPara(int cantidadDePersonas) {

		boolean hayEspacio = false;
		int contadorButacasVacias;

		for (int i = 0; i < butacas.length; i++) {
			contadorButacasVacias = 0;
			for (int j = 0; j < butacas.length; j++) {
				if (butacas[i][j] == false) {
					contadorButacasVacias++;
				}
				if (contadorButacasVacias >= cantidadDePersonas) {
					hayEspacio = true;
					return hayEspacio;
				}
				if (butacas[i][j] == true) {
					contadorButacasVacias = 0;
				}
			}
		}
		return hayEspacio;
	}
	
	public int resta() {
		
		return 5 - 5;
	}
	
public int div() {
		
		return 5 / 5;
	}
}
