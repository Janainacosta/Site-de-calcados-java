package calcado;

public class Calcado {
	private String nome; 
	private String marca; 
	private int tamanho; 
	private int estoque; 
	private double valor; 
	
	public Calcado(){
		System.out.println("Construindo objeto...");
	}
	
	public Calcado(String n, String m, int t, int e, double v) {
		nome = n;
		marca = m;
		tamanho = t;
		estoque = e;
		valor = v;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public double getValor(){
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public static void Mostra(Calcado c1) {
		System.out.println("Nome:" + c1.nome);
		System.out.println("Marca:" + c1.marca);
		System.out.println("Tamanho:" + c1.tamanho);
		System.out.println("Estoque:" + c1.estoque);
	}
	
	public void ConfereEstoque( int quantidade) {
		if(this.estoque >= quantidade ) {
			System.out.println("Tem em estoque!");
		}else System.out.println("Não tem em estoque!");
	}
	
	public void Calcular(int porcentagem) {
		double resultado = this.valor * porcentagem / 100;
		System.out.println(resultado);
	}
	
	
	public static void main(String[] args) {
		Calcado c1 = new Calcado();
		c1.setNome("Sapatilha");
		c1.setMarca("Moleca");
		c1.setTamanho(37);
		c1.setEstoque(10);
		c1.setValor(80);
		
		Calcado c2 = new Calcado();
		c1.setNome("Sandalia");
		c1.setMarca("Vizzano");
		c1.setTamanho(35);
		c1.setEstoque(6);
		c1.setValor(120);
		
		Calcado c3 = new Calcado("Bota over", "Mississipi", 34, 14, 200);
		
		Calcado c4 = new Calcado("Chinelo", "Ipanema", 38, 40, 22);
		
		c1.ConfereEstoque(5);
		c1.Calcular(25);
		
	}
	
}
