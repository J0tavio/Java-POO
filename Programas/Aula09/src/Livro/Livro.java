package Livro;

public class Livro implements Publicacao {
  private String titulo, autor;
  private int totalPaginas, paginaAtual;
  private boolean aberto;
  private Pessoa leitor;

  public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totalPaginas = totalPaginas;
    this.aberto = false;
    this.paginaAtual = 0;
    this.leitor = leitor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotalPaginas() {
    return totalPaginas;
  }

  public void setTotalPaginas(int totalPaginas) {
    this.totalPaginas = totalPaginas;
  }

  public int getPaginaAtual() {
    return paginaAtual;
  }

  public void setPaginaAtual(int paginaAtual) {
    this.paginaAtual = paginaAtual;
  }

  public boolean isAberto() {
    return aberto;
  }

  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  public String detalhes() {
    return "Título do livro: " + titulo + "\nAutor: " + autor + "\nTotal de Paginas: " + totalPaginas
        + "\nPágina atual: "
        + paginaAtual + "\naberto: " + aberto + "\nleitor: " + leitor.getNome() + ", Sexo: " + leitor.getSexo()
        + ", Idade: " + leitor.getIdade();
  }

  @Override
  public void abrir() {
    this.aberto = true;
  }

  @Override
  public void fechar() {
    this.aberto = false;
  }

  @Override
  public void folhear(int pagina) {
    if (pagina > totalPaginas) {
      this.paginaAtual = 0;
    } else {
      this.paginaAtual = pagina;
    }
    
  }

  @Override
  public void avançarPaginas() {
    this.paginaAtual++;
  }

  @Override
  public void voltarPaginas() {
    this.paginaAtual--;
  }

}
