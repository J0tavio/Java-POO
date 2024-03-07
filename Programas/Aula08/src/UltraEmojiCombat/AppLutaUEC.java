package UltraEmojiCombat;
public class AppLutaUEC {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];

        lutador[0] = new Lutador("Pretty boy", "França", 31, 1.75, 68.9, 11, 2, 1);

        lutador[1] = new Lutador("PutScript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);

        lutador[2] = new Lutador("SnapShadow", "EUA", 35, 1.65, 81.9, 12, 2, 1);

        lutador[3] = new Lutador("Dead Code", "Austrália", 28, 1.97, 81.6, 13, 0, 2);

        lutador[4] = new Lutador("UFOcobol", "Brasil", 37, 1.70, 119.0, 5, 4, 3);

        lutador[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        Luta luta1 = new Luta();

        luta1.marcarLuta(lutador[0], lutador[0]);
        luta1.lutar();
        // lutador[0].status();;
        // lutador[1].status();;
    }

    
}
