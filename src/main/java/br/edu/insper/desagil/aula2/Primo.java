package br.edu.insper.desagil.aula2;

public class Primo {

	public int conta(int limite) {
		int resposta = 0;
		for (int n = 2; n <= limite; n++) {
			boolean primo = true;
			for (int d = 2; d < n; d++) {
				if (n % d == 0) {
					primo = false;
				}
			}
			if (primo) {
				resposta++;
			}
		}
		return resposta;
	}
}
