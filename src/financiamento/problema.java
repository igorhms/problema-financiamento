package financiamento;
import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		nome = sc.nextLine();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		while (salario < 0){
			System.out.print("Salario: ");
			salario = sc.nextDouble();
		}
		
		
		
		sc.close();
	}
	

}
