package Apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.entities;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<entities> lista = new ArrayList<>();

		int x = 1000;
		int codigo =0;

		for (int i = 0; i <= x; i++) {
			System.out.println("Favor digite o codigo do produto, lembrando que o codigo do produto anterior �: " + codigo);
			codigo = scan.nextInt();

			while (hasCodigo (lista, codigo)) {

				System.out.println("c�digo j� existente favor digite novamente. ");

				codigo = scan.nextInt();
			}

			System.out.println("Favor digite a Descri��o do material: ");
			scan.nextLine();
			String descricao = scan.next();

			System.out.println("Voc� deseja iniciar o produto com algum saldo? se sim digite quantos.");

			double saldo = scan.nextDouble();

			lista.add(new entities(codigo, descricao, saldo));

			System.out.println("Deseja ver o saldo de todos os produtos? se sim digite 9 ");

			int escolha = scan.nextInt();

			if (escolha == 9) {

				for (entities obj : lista) {

					System.out.println(obj);
				}
			}
		}

		scan.close();

	}

	private static boolean hasCodigo(List<entities> lista, int codigo) {

			entities ent= lista.stream().filter(x-> x.getCodigo() == codigo).findFirst().orElse(null);
		return ent != null;
	}

}
