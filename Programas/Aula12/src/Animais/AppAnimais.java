package Animais;
public class AppAnimais {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        // Reptil reptil = new Reptil();
        // Peixe peixe = new Peixe();
        // Ave ave = new Ave();

        mamifero.setPeso(40f);
        mamifero.setCorPelo("Preto");
        mamifero.alimentar();
        mamifero.emitirSom();
        mamifero.locomover();
    }
}
