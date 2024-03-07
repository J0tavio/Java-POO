package YouTube2;

public class AppVideo {
    public static void main(String[] args) throws Exception {
        Video video[] = new Video[3];
        video[0] = new Video("Carros1");
        video[1] = new Video("Velozes e Furiosos");
        video[2] = new Video("Como falar chinês");

        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Joao", 19, "M", "JhoPK");
        gafanhoto[1] = new Gafanhoto("Fernando", 25, "M", "Nando");

        Visualizacao visualizacao[] = new Visualizacao[3];
        visualizacao[0] = new Visualizacao(gafanhoto[0], video[1]);
        visualizacao[0].avaliar();
        System.out.println(visualizacao[0].toString() + "\n");

        visualizacao[1] = new Visualizacao(gafanhoto[1], video[1]);
        visualizacao[1].avaliar(87.0f);
        System.out.println(visualizacao[1].toString());

        // System.out.println("Videos");
        // System.out.println(video[0].toString());
        // System.out.println(video[1].toString());
        // System.out.println(video[2].toString());
        // System.out.println("\nGafanhotos");
        // System.out.println(gafanhoto[0].toString());
        // System.out.println(gafanhoto[1].toString());

    }
}
