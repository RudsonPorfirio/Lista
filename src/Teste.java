public class Teste {

	public static void main(String[] args) {

		ListaFunc lista = new ListaFunc();

		NoPessoa p = new NoPessoa();
		p.setNome("Rudson");

		lista.adicionarInicio(p);

		NoPessoa p2 = new NoPessoa();
		p2.setNome("Fulano");
		lista.adicionarInicio(p2);

		NoPessoa p3 = new NoPessoa();
		p3.setNome("Sicrano");
		lista.adicionarInicio(p3);

		NoPessoa p4 = new NoPessoa();
		p4.setNome("Ana");
		lista.adicionarFim(p4);

		NoPessoa p5 = new NoPessoa();
		p5.setNome("Hemyli");
		lista.adicionarPorPosicao(3, p5);

		lista.imprimirLista();

		lista.removerPorPosicao(3);
		System.out.println(".....................");
		lista.imprimirLista();
		

	}

}
