package financiamento;
import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, total;
		int prestacoes, entrada;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		nome = sc.nextLine();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		while (salario < 0){
			System.out.print("Salario: ");
			salario = sc.nextDouble();
		}
		System.out.print("Numero de prestacoes: ");
		prestacoes = sc.nextInt();
		System.out.print("Porcentagem de entrada: ");
		entrada = sc.nextInt();
		System.out.print("Valor total financiado: ");
		total = sc.nextDouble();
		while ((total / prestacoes) < (salario * 0.3)){
			System.out.print("Valor total financiado: ");
			total = sc.nextDouble();
		}
		
		
		sc.close();
	}
	

}
