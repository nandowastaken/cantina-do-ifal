package cantina;
import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
import cantina.Estoque;
import cantina.Item;
import cantina.ValorInvalidoException;
import cantina.ListaVaziaException;
import database.*;
import java.sql.*;
import interfaces.*;


public class Main {
	public static void main(String[] args) {
		// MySQL connection
		Connection con = ConnectionFactory.getConnection();
		System.out.println("Conectado ao banco de dados!");
		
		Selection s = new Selection();
		List<String[]> dados = s.SelectFuncionario();
		for (int i = 0; i < dados.size(); i ++) {
			String[] dados_login = dados.get(i);
			System.out.println(dados_login[0]);
			System.out.println(dados_login[1]);
		}
		
		// Login screen
		Login.loginWindow();
		
		// Estoque
		Estoque estoque = new Estoque();
		Scanner scanner_num = new Scanner(System.in);
		Scanner scanner_text = new Scanner(System.in);
		boolean on = false;
		
		
		
		while (on) {
			System.out.println("O que você deseja fazer?");
			System.out.println("1. Cadastrar item.");
			System.out.println("2. Acrescentar item.");
			System.out.println("3. Vender item.");
			System.out.println("4. Mostrar resumo dos itens e suas quantidades.");
			System.out.println("5. Mostrar itens com baixa quantidade no item.");
			System.out.println("6. Mostrar resumo de lucro ou prejuízo.");
			System.out.println("7. Sair.");
			int escolha = scanner_num.nextInt();
			
			switch (escolha) {
				case 1:
					System.out.println("Digite o nome do item: ");
					String nome = scanner_text.nextLine();
					System.out.println("Digite a descrição do item: ");
					String desc = scanner_text.nextLine();
					System.out.println("Digite o preço de compra do item: ");
					double preco_compra = scanner_num.nextDouble();
					System.out.println("Digite o preço de venda: ");
					double preco_venda = scanner_num.nextDouble();
					System.out.println("Digite a quantidade comprada: ");
					int quantidade_comprada = scanner_num.nextInt();
					
					try {
						estoque.cadastrarItem(nome,  desc,  preco_compra,  preco_venda,  quantidade_comprada);
					} catch (ValorInvalidoException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				
				case 2:
					System.out.println("Digite o nome do item: ");
					String nome_acrescentar = scanner_text.nextLine();
					System.out.println("Digite a quantidade: ");
					int quantidade_acrescentar = scanner_num.nextInt();
					
					try {
						estoque.acrescentarItem(nome_acrescentar, quantidade_acrescentar);
						System.out.println("Item acrescentado com sucesso!");
						
					} catch (ValorInvalidoException e) {
						System.out.println(e.getMessage());
					} 
					
					break;
				
				case 3:
					System.out.println("Digite o nome do item: ");
					String nome_vender = scanner_text.nextLine();
					System.out.println("Digite a quantidade: ");
					int quantidade_vender = scanner_num.nextInt();
					try {
						estoque.venderItem(nome_vender, quantidade_vender);
					} catch (ValorInvalidoException e) {
						System.out.println(e.getMessage());
					}
					
					break;
					
				case 4:
					System.out.println("Você deseja ter o resumo em qual ordem?");
					System.out.println("1. Quantidade disponível.");
					System.out.println("2. Descrição.");
					int ordem = scanner_num.nextInt();
					try {
						estoque.resumoItens(ordem);
					} catch (ListaVaziaException e) {
						System.out.println(e.getMessage());
					}
					break;
					
				case 5:
					try {
						estoque.itensQntdBaixa();
					} catch (ListaVaziaException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 6:
					try {
						estoque.lucroOuPrejuizo();
					} catch (ListaVaziaException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				case 7:
					on = false;
					break;
				default:
					System.out.println("Ponha um valor plausível!");
			}
			
			
		}
		
	}
}
