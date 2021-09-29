package biblioteca;

public class Filme extends Publicacao {
	public String diretor;
	public String ator_principal;
	public String sinopse;
	public String duracao;
	
	public Filme(String titulo, String autor, int ano_publicacao, String genero, String editora, int qtd_disponivel,
			String diretor, String ator_principal, String sinopse, String duracao) {
		super(titulo, autor, ano_publicacao, genero, editora, qtd_disponivel);
		this.diretor = diretor;
		this.ator_principal = ator_principal;
		this.sinopse = sinopse;
		this.duracao = duracao;
	}

	@Override
	public void imprime_publicacao() {
		System.out.println("Titulo: "+ super.getTitulo());
		System.out.println("Sinopse: "+ sinopse);
		System.out.println("Gênero: "+ super.getGenero());
		System.out.println("Ator principal: "+ ator_principal);
		System.out.println("Duração: "+ duracao);
		System.out.println("Ano de publicação: "+ super.getAno_publicacao());
		System.out.println("Diretor: "+ diretor);
		System.out.println("Autor: "+ super.getAutor());
		System.out.println("Editora: "+ super.getEditora());
		System.out.println("Quantidade disponível: "+ super.getQtd_disponivel());
	}
	
	

}
