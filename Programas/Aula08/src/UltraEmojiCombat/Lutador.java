package UltraEmojiCombat;

public class Lutador {
  private String nome;
  private String nacionalidade;
  private int idade;
  private double altura;
  private double peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;

  public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
      int empates) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    this.setPeso(peso);
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
    this.setCategoria();
  }

  public String getCategoria() {
    return categoria;
  }

  private void setCategoria() {
    if (peso < 52.2) {
      categoria = "Inválido";
    } else if (peso <= 70.3) {
      categoria = "Leve";
    } else if (peso <= 83.9) {
      categoria = "Média";
    } else if (peso <= 120.2) {
      categoria = "Pesado";
    } else {
      categoria = "Inválido";
    }
  }

  public int getVitorias() {
    return vitorias;
  }

  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }

  public int getDerrotas() {
    return derrotas;
  }

  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }

  public int getEmpates() {
    return empates;
  }

  public void setEmpates(int empates) {
    this.empates = empates;
  }

  public void apresentar() {
    System.out.println("______________________________");
    System.out.println("Lutador: " + getNome());
    System.out.println("Origem: " + this.getNacionalidade());
    System.out.println(this.getIdade() + " anos");
    System.out.println(this.getAltura() + " de Altura");
    System.out.println("Pesando: " + this.getPeso() + " KG");
    System.out.println("Ganhou: " + this.getVitorias());
    System.out.println("Perdeu: " + this.getDerrotas());
    System.out.println("Empatou: " + this.getEmpates());
  }

  public void status() {
    System.out.println("-----------------------------------");
    System.out.println(this.getNome() + "da categoria " + this.getCategoria());
    System.out.println("Tem o peso de: " + this.getPeso());
    System.out.println(this.getVitorias() + " Vitórias");
    System.out.println(this.getDerrotas() + " Derrotas");
    System.out.println(this.getEmpates() + " Empate(s)");
  }

  public void ganharLuta() {
    this.setVitorias(getVitorias() + 1);
  }

  public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
  }

  public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
  }

}
