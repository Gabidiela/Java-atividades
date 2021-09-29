package biblioteca;

public abstract class Publicacao {
	
	private String titulo;
	private String autor;
	private int ano_publicacao;
	private String genero;
	private String editora;
	private int qtd_disponivel;
	
	public abstract void imprime_publicacao();

	public Publicacao(String titulo, String autor, int ano_publicacao, String genero, String editora,
			int qtd_disponivel) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
		this.genero = genero;
		this.editora = editora;
		this.qtd_disponivel = qtd_disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno_publicacao() {
		return ano_publicacao;
	}

	public String getGenero() {
		return genero;
	}

	public String getEditora() {
		return editora;
	}

	public int getQtd_disponivel() {
		return qtd_disponivel;
	}


}
