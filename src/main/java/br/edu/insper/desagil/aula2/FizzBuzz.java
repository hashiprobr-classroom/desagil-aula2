package br.edu.insper.desagil.aula2;

public class FizzBuzz {

	public String calcula(int n) {
		String resposta = "";
		if (n % 3 == 0) {
			resposta += "Fizz";
		}
		if (n % 5 == 0) {
			resposta += "Buzz";
		}
		if (resposta.length() > 0) {
			return resposta;
		}
		return Integer.toString(n);
	}

}
