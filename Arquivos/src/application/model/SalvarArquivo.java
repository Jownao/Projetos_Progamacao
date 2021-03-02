package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SalvarArquivo {
	
	public static void criarArquivo(
			String nome,
			String campo1,
			String campo2,
			String campo3,
			String campo4) {

		String nomeArquivo = nome+".txt";

		try {
			File arquivo = new File(nomeArquivo);
			if (arquivo.createNewFile()) {
				System.out.println("Arquivo " + nomeArquivo + " criado!");
				try {
					FileWriter arquivoCriar = new FileWriter(nomeArquivo);
					arquivoCriar.write(campo1+" - "+campo2+" - "+campo3+" - "+campo4);
					arquivoCriar.close();
				} catch (IOException e) {
					System.out.println("Ocorreu um erro na criação do cabeçalho do arquivo " + nomeArquivo + " !");
					e.printStackTrace();
				}
			} else {
				System.out.println("Arquivo " + nomeArquivo + " já existe!");
			}
		} catch (IOException e) {
			System.out.println("Ocorreu um erro na criação do arquivo " + nomeArquivo + " !");
			e.printStackTrace();
		}
	}

	public static void salvarArquivo(
			String nome,
			String dado1,
			String dado2,
			String dado3,
			String dado4) {
		
		String nomeArquivo = nome+".txt";

		try {
			FileWriter arquivo = new FileWriter(nomeArquivo, true);
			PrintWriter salvarArquivo = new PrintWriter(arquivo);
			salvarArquivo.println();
			salvarArquivo.print(dado1);
			salvarArquivo.print(" - ");
			salvarArquivo.print(dado2);
			salvarArquivo.print(" - ");
			salvarArquivo.print(dado3);
			salvarArquivo.print(" - ");
			salvarArquivo.print(dado4);
			salvarArquivo.flush();
			salvarArquivo.close();
			arquivo.close();

		} catch (IOException e) {
			System.out.println("Erro no arquivo!");
			e.printStackTrace();
		}

	}
}
