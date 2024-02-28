package Class;

public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada;

  public void status() {
    System.out.println("Modelo " + this.modelo);
    System.out.println("Cor " + this.cor);
    System.out.println("Ponta " + this.ponta);
    System.out.println("Carga " + this.carga);
    System.out.println("Está tampada? " + this.tampada);
  }

  public void rabiscar() {
    if (this.tampada == true) {
      System.out.println("Não posso rabiscar");
    } else {
      System.out.println("Estou rabiscando");
    }
  }

  public void tampar() {
    tampada = true;
  }

  public void destampar() {
    tampada = false;
  }

    /**
     * @return float return the ponta
     */
    public float getPonta() {
        return ponta;
    }

    /**
     * @param ponta the ponta to set
     */
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    /**
     * @return boolean return the tampada
     */
    public boolean isTampada() {
        return tampada;
    }

    /**
     * @param tampada the tampada to set
     */
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

}
