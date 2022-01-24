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
		// TODO Esbozo de m�todo generado autom�ticamente
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
			diagnostico = "Obesidad prem�rbida";
		else
			diagnostico = "Obesidad m�rbida";
		
		System.out.printf("El paciente de %.2f kg y %.2f m de altura, tiene un IMC de %.2f y"
				+ "tiene un diagn�stico de %s",peso,altura,IMC,diagnostico);
	}

}
