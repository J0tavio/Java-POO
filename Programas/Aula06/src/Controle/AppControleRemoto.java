package Controle;

public class AppControleRemoto {
    public static void main(String[] args) throws Exception {
        
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.maisVolume();
        c1.abrirMenu();
    }
}
