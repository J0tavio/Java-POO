package Heranca;

public class Professor extends Pessoa {
  private String especialidade;
  private double salario;

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public void receberAumento(double aumento) {
    this.salario += aumento;
    System.out.println("RECEBEU AUMENTO. Salário atual é:" + this.salario);
  }

  public void statusProfessor() {
    System.out.println("O professor "+ getNome()+ " Tem "+ getIdade() +" anos"+ " e recebe "+ this.salario);
  }
}
