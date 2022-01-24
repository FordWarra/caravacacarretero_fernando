/**
 * 
 */

/**
 * @author Fernando
 *
 */
public class examen {

	/**
	 * @param matriz
	 * La funci�n se encarga de mostrar la matriz dada. A trav�s de dos bucles for,
	 * que recorren la matriz por filas(i) y columnas(j) y van mostrando mediante un printf 
	 * el valor de la matriz en cada momento de matriz[i][j].
	 */
	public static void mostrar_imcs(double matriz[][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++)
				System.out.printf(" %.2f ",matriz[i][j]);
			System.out.println("");
		}
		
	}
		
		/**
		 * @param matriz
		 * @param paciente
		 * @return sumatorio
		 * 
		 * La funci�n considera los pacientes a partir del 1, teniendo en cuenta que si es
		 * introducido un n�mero para paciente menor o igual que 0 o mayor que 4, no entrar� en
		 * la funci�n porque se comprueba antes de entrar.
		 */
		public static double media_paciente(double matriz[][], int paciente) {
		double sumatorio = 0;
		for (int i = paciente-1; i < paciente; i++) {
			for (int j = 0; j < matriz[0].length; j++)
				sumatorio += matriz[i][j];
			}
		sumatorio = sumatorio /matriz[0].length;
		return sumatorio;
		}
}
