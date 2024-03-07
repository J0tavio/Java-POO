package UltraEmojiCombat;

import java.util.Random;

public class Luta {
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

  public void marcarLuta(Lutador lutador1, Lutador lutador2) {
    if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2) {
      this.aprovada = true;
      this.desafiado = lutador1;
      this.desafiante = lutador2;
      System.out.println("Luta marcada");
    } else {
      this.aprovada = false;
      this.desafiado = null;
      this.desafiante = null;
    }
  }

  public void lutar() {
    Random random = new Random();
    if (this.aprovada) {
      System.out.println("-----Desafiado-----");
      this.desafiado.apresentar();
      System.out.println("-----Desafiante-----");
      this.desafiante.apresentar();
      int vencendor = random.nextInt(3);

      switch (vencendor) {
        case 0:
          System.out.println("Empatou");
          this.desafiado.empatarLuta();
          this.desafiante.empatarLuta();
          break;
        case 1: //desafiado vence
          System.out.println("Venceu: "+ this.desafiado.getNome());
          this.desafiado.ganharLuta();
          this.desafiante.perderLuta();
          break;
        case 2: //desafiante vence
          System.out.println("Venceu: "+ this.desafiante.getNome());
          this.desafiante.ganharLuta();
          this.desafiante.perderLuta();
          break;
        default:
          System.out.println("");
          break;
      }
    } else {
      System.out.println("Luta Não pode acontecer");
    }
  }

  public Lutador getDesafiado() {
    return desafiado;
  }

  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

  public Lutador getDesafiante() {
    return desafiante;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public int getRounds() {
    return rounds;
  }

  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean getAprovada() {
    return aprovada;
  }

  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }
}
