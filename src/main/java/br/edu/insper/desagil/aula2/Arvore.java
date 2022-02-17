package br.edu.insper.desagil.aula2;

public class Arvore {

	public String constroi(int n) {
		String resposta = "";
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < n - i - 1; j++) {
				resposta += " ";
			}
			for (j = 0; j < i; j++) {
				resposta += "/";
			}
			resposta += "|";
			for (j = 0; j < i; j++) {
				resposta += "\\";
			}
			resposta += "\n";
		}
		return resposta;
	}

}
