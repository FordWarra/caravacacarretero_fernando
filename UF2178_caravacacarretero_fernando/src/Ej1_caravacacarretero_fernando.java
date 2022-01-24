import java.util.Scanner;

/**
 * 
 */

/**
 * @author Fernando
 *
 */
public class Ej1_caravacacarretero_fernando {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner (System.in);
		
		double peso, altura;
			
		System.out.println("Introduce el peso(kg) del paciente: ");
		peso = teclado.nextDouble();
		System.out.println("Introduce la altura(m) del paciente: ");
		altura = teclado.nextDouble();
		
		double IMC = peso / Math.pow(altura, 2);
	

		
		String diagnostico;
		if (IMC<18.5)
			diagnostico = "Bajo peso";
		else if(IMC>18.5 && IMC<24.9)
			diagnostico = "Peso normal (saludable)";
		else if(IMC>25 && IMC<29.9)
			diagnostico = "Sobrepeso";
		else if(IMC>30 && IMC<40)
			diagnostico = "Obesidad premórbida";
		else
			diagnostico = "Obesidad mórbida";
		
		System.out.printf("El paciente de %.2f kg y %.2f m de altura, tiene un IMC de %.2f y"
				+ "tiene un diagnóstico de %s",peso,altura,IMC,diagnostico);
	}

}
