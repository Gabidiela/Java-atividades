package biblioteca;

public class ProgramaBiblioteca {
	
	public static void main(String[] args) {
		Livro obra = new Livro("Violetas na janela", "Vera L�cia Marinzeck de Carvalho", 1993, "Romance", "Petit Editora", 5, 3, 9786070751622l);
		Filme filminho = new Filme("Homem-Aranha: De Volta ao Lar", "Jon", 2017, "A��o/Aventura", "Marvel Studios", 3, "Jon Watts", "Tom Holland","Depois de lutar ao lado dos Vingadores, chegou a hora do jovem Peter Parker voltar para casa em Nova York ao lado de sua tia May. Peter come�a a abra�ar sua nova identidade como Homem-Aranha. Ele acredita que encontrou a miss�o de sua vida quando o terr�vel vil�o Abutre surge amea�ando a cidade. O problema � que a tarefa n�o ser� t�o f�cil como ele imaginava.","2h 13m");
		Publicacao[] array  = new Publicacao[2];
		array[0] = obra;
		array[1] = filminho;
		
		for(int i =0; i< array.length; i++){
			array[i].imprime_publicacao();
			}
				
	}
}
	