package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	

	public static void main(String[] args) {
		int a = 45;
		int b = 100;
		Gato gato = new Gato("Rex ", "black ", 2);
		Livros livros = new Livros();
		System.out.println("Hello World! " + (a+b));
		System.out.println(gato);
		//na classe livros n�o coloquei o toString,
		//ir� apresentar o endere�o de mem�ria
		System.out.println("endere�o de mem�ria: "+livros);

	}

}
class Livros{
	private String nome;
	private String pagina;
	
}
