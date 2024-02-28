package Classes;

public class Caneta {
  private String modelo, cor;
  private float ponta;
  private boolean tampada;

    public void status() {
        System.out.println("Sobre a caneta");
        System.out.println("Modelo "+ this.getModelo());
        System.out.println("Ponta "+ this.getPonta());
        System.out.println("Cor "+ this.cor);
        System.out.println("Tampada "+ this.tampada);
    }

    public Caneta(String modelo, String cor, float ponta) {
        this.tampar();
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

}
