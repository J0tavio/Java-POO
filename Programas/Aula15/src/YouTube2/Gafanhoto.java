package YouTube2;

public class Gafanhoto extends Pessoa{
  private String login;
  private int totalAssitido;

  public Gafanhoto(String nome, int idade, String sexo, String login) {
    super(nome, idade, sexo);
    this.login = login;
    this.totalAssitido = 0;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public int getTotalAssitido() {
    return totalAssitido;
  }

  public void setTotalAssitido(int totalAssitido) {
    this.totalAssitido = totalAssitido;
  }

  @Override
  public String toString() {
    return "Gafanhoto login: " + login + ", " + super.toString() + ", totalAssitido: " + totalAssitido;
  }
}
