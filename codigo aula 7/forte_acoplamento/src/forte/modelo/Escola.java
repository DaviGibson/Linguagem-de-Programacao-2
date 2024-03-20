package forte.modelo;
import java.util.Scanner;

public class Escola {
	Evento e = new Evento();
	public void cadastrarEvento() {
		Scanner ler = new Scanner(System.in);
		String nome = "";
		int dia, mes, ano;
		
		System.out.println("Informe a descricao do evento:\n");
		nome = ler.next();
		
		System.out.println("Informe o dia do evento:\n");
		dia = ler.nextInt();
		
		System.out.println("Informe o mes do evento:\n");
		mes = ler.nextInt();
		
		System.out.println("Informe o ano do evento:\n");
		ano = ler.nextInt();
		
		e.agendar(nome, dia, mes, ano);
	}
	
	public void mostrarEvento() {
		System.out.println("\n");
		System.out.println("Evento: " + e.getNome());
		System.out.println("Data: " + e.getDia() + "/" + 
		e.getMes() + "/" + e.getAno());
	}
	
}
