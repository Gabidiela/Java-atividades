package biblioteca;

public class ProgramaBiblioteca {
	
	public static void main(String[] args) {
		Livro obra = new Livro("Violetas na janela", "Vera Lúcia Marinzeck de Carvalho", 1993, "Romance", "Petit Editora", 5, 3, 9786070751622l);
		Filme filminho = new Filme("Homem-Aranha: De Volta ao Lar", "Jon", 2017, "Ação/Aventura", "Marvel Studios", 3, "Jon Watts", "Tom Holland","Depois de lutar ao lado dos Vingadores, chegou a hora do jovem Peter Parker voltar para casa em Nova York ao lado de sua tia May. Peter começa a abraçar sua nova identidade como Homem-Aranha. Ele acredita que encontrou a missão de sua vida quando o terrível vilão Abutre surge ameaçando a cidade. O problema é que a tarefa não será tão fácil como ele imaginava.","2h 13m");
		Publicacao[] array  = new Publicacao[2];
		array[0] = obra;
		array[1] = filminho;
		
		for(int i =0; i< array.length; i++){
			array[i].imprime_publicacao();
			}
				
	}
}
	