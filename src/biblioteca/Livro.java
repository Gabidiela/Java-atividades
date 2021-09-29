package biblioteca;

public class Livro extends Publicacao {
	private int edicao;
	private long isbn;

	public Livro(String titulo, String autor, int ano_publicacao, String genero, String editora, int qtd_disponivel,
			int edicao, long isbn) {
		super(titulo, autor, ano_publicacao, genero, editora, qtd_disponivel);
		this.edicao = edicao;
		this.isbn = isbn;
	}

	@Override
	public void imprime_publicacao() {
		System.out.println("Titulo: "+ super.getTitulo());
		System.out.println("Autor: "+ super.getAutor());
		System.out.println("G�nero: "+ super.getGenero());
		System.out.println("Editora: "+ super.getEditora());
		System.out.println("Ano de publica��o: "+ super.getAno_publicacao());
		System.out.println("Edi��o: "+ edicao);
		System.out.println("isbn: "+ isbn);
		System.out.println("Quantidade dispon�vel: "+ super.getQtd_disponivel());
	}

}
