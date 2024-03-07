package Heranca;

public class Bolsista extends Aluno{
  private double bolsa;

  public double getBolsa() {
    return bolsa;
  }

  public void setBolsa(double bolsa) {
    this.bolsa = bolsa;
  }

  public void renovarBolsa() {

  }
  @Override
  public void pagarMensalidade() {
    System.out.println(this.getNome()+" é bolsista pagamento facilitdado ");
  }
  
}
