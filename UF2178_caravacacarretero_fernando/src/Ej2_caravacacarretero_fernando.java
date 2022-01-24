import java.util.Scanner;

/**
 * 
 */

/**
 * @author Fernando
 *
 */
public class Ej2_caravacacarretero_fernando {

	/**
	 * @param args
	 * Se comprueba mediante un bucle do while que el valor de paciente se encuentre entre [1-4] antes de la 
	 * llamada a la funcion media_paciente.
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner (System.in);
		int paciente;
		double imcs_pacientes [][] = {

			    {15.7,15.8,16.1,16.3,16.7,17,17.4,17.1,17.5,17.6,18.4,18.6},

			    {38.5,38.4,38.3,38.3,38.8,37.5,37.4,37.1,36.8,36.0,35.4,35.2},

			    {33.5,33.6,33.8,33.9,33.6,33.1,32.4,31.8,31.7,29.8,28.4,27.2},

			    {32.7,32.4,33,32.7,32.9,31.6,31.5,30.4,29.2,27.3,25.2,24.7}

			};
		
		examen.mostrar_imcs(imcs_pacientes);
		
		do {
		System.out.println("\nIntroduce el número de paciente [1-4] para realizar su media: ");
		paciente = teclado.nextInt();
		if (paciente <=0 || paciente > 4)
			System.out.println("\nERROR. ¡Vuelve a introducir el número de nuevo!");
		}while(paciente<=0 || paciente >4);
		
		
		
		System.out.printf("\nLa media es: %.2f",examen.media_paciente(imcs_pacientes, paciente));
	}

}
