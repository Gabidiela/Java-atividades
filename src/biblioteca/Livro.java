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
		System.out.println("Gênero: "+ super.getGenero());
		System.out.println("Editora: "+ super.getEditora());
		System.out.println("Ano de publicação: "+ super.getAno_publicacao());
		System.out.println("Edição: "+ edicao);
		System.out.println("isbn: "+ isbn);
		System.out.println("Quantidade disponível: "+ super.getQtd_disponivel());
	}

}
