package Animais;

public class Cachorro extends Mamifero{

  @Override
  public void emitirSom() {
    System.out.println("AU! AU!");
    super.emitirSom();
  }

}
