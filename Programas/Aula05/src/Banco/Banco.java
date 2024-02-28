package Banco;

public class Banco {
  public int numeroConta;
  protected String tipo;
  private String dono;
  private boolean status;
  private double saldo;

  public Banco() {
    saldo = 0;
    status = false;
  }

  public void estadoAtual() {
    System.out.println("_____________________________");
    System.out.println("Número da Conta: "+ this.numeroConta);
    System.out.println("Tipo: "+ this.getTipo());
    System.out.println("Dono: "+ this.getDono());
    System.out.println("Saldo: "+ this.getSaldo());
    System.out.println("Status: "+ this.getStatus());
  }

  public void abrirConta(String tipo) {
    this.tipo = tipo;
    setStatus(true);

    if (tipo == "Conta corrente") {
      System.out.println("Conta aberta com sucesso");
      saldo += 50;
    } else if (tipo == "Conta poupança") {
      System.out.println("Conta aberta com sucesso");
      saldo += 150;
    }
  }

  public void fecharConta() {
    if (saldo > 0) {
      System.out.println("Conta com Saldo. Não pode ser fechada");
    } else if (saldo < 0) {
      System.out.println("Conta com dívida");
    } else {
      setStatus(false);
    }
  }

  public void depositar(double valor) {
    if (status == true) {
      saldo = saldo + valor;
    } else {
      System.out.println("Impossível Depositar nessa conta");
    }
  }

  public void sacar(double valor) {
    if (status == true) {
      if (saldo >= valor) {
        saldo = saldo - valor;
        System.out.println("Saque realizado da conta de: " + getDono());
      } else {
        System.out.println("Saldo insuficiente");
      }
    } else {
      System.out.println("Conta não está aberta");
    }
  }

  public void pagamentoMensal() {
    double valor = 0;
    if (tipo == "Conta corrente") {
      valor = 12;
    } else if (tipo == "Conta poupança") {
      valor = 20;
    }
    if (status == true) {
      if (saldo >= valor) {
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Mensalidade Paga por: " + this.getDono());
      } else {
        System.out.println("Saldo insuficiente");
      }
    } else {
      System.out.println("Impossível pagar");
    }
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getDono() {
    return dono;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public boolean getStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}
