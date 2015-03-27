public class ListaFunc {

	private NoPessoa primeiro;

	private NoPessoa ultimo;

	public void inicializarLista(NoPessoa noPessoa) {
		System.out.println("Inicializando ....");

		primeiro = noPessoa;
		ultimo = primeiro;

	}

	public void adicionarInicio(NoPessoa noPessoa) {

		if (primeiro == null) {
			inicializarLista(noPessoa);
		} else {
			noPessoa.setProximo(primeiro);
			primeiro = noPessoa;

		}

	}

	public void adicionarFim(NoPessoa noPessoa) {

		if (primeiro == null) {
			inicializarLista(noPessoa);
		} else {

			ultimo.setProximo(noPessoa);

			ultimo = noPessoa;

		}

	}

	public void adicionarPorPosicao(int posicao, NoPessoa novoNo) {

		NoPessoa aux = primeiro;

		if (posicao == 0) {
			adicionarInicio(novoNo);
		} else if (posicao == totalItensLista()) {
			// System.out.println("if do fim");
			adicionarFim(novoNo);
		} else if (posicao < 0 || posicao > totalItensLista()) {
			System.out.println("POSIÇÃO INVALIDA");
			return;
		} else {

			posicao--;

			for (int i = 0; i < totalItensLista(); i++) {

				if (i == posicao) {

					novoNo.setProximo(aux.getProximo());
					aux.setProximo(novoNo);

				} else {

					aux = aux.getProximo();
				}

			}

		}
	}

	public void removerPorPosicao(int posicao) {

		NoPessoa aux = primeiro;

		if (posicao == 0) {
			removerItemInicio();
		} else if (posicao == totalItensLista()) {
			removerItemFim();
		} else if (posicao < 0 || posicao > totalItensLista()) {
			System.out.println("POSIÇÃO INVALIDA");
			return;
		} else {

			// 2
			posicao--;
			// 1

			for (int i = 0; i < totalItensLista(); i++) {

				if (i == posicao) {

					NoPessoa aux2 = aux.getProximo();
					aux.setProximo(aux.getProximo().getProximo());
					aux2.setProximo(null);
					return;

				} else {

					aux = aux.getProximo();
				}

			}

		}
	}

	public void imprimirLista() {

		NoPessoa aux = primeiro;

		boolean lop = true;

		while (lop) {

			System.out.println(aux.getNome());

			if (aux.getProximo() != null) {

				aux = aux.getProximo();

			} else {

				return;

			}

		}

	}

	public int totalItensLista() {

		int total = 0;
		if (primeiro != null) {

			NoPessoa aux = primeiro;

			boolean lop = true;

			while (lop) {

				total++;

				if (aux.getProximo() != null) {

					aux = aux.getProximo();

				} else {

					return total;
				}

			}
		}

		return total;
	}

	public void removerItemInicio() {

		NoPessoa aux = new NoPessoa();

		aux.setProximo(primeiro.getProximo());
		primeiro.setProximo(null);

		primeiro = aux.getProximo();

		aux = null;

	}

	public void removerItemFim() {

		NoPessoa aux = new NoPessoa();

		aux = primeiro;

		for (int i = 0; i < totalItensLista(); i++) {

			if (aux.getProximo().getProximo() != null) {
				aux = aux.getProximo();

			} else {

				ultimo = aux;
				ultimo.setProximo(null);
				return;

			}
		}

	}

	public NoPessoa getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoPessoa primeiro) {
		this.primeiro = primeiro;
	}

	public NoPessoa getUltimo() {
		return ultimo;
	}

	public void setUltimo(NoPessoa ultimo) {
		this.ultimo = ultimo;
	}

}
