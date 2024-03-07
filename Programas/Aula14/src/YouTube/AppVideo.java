package YouTube;

public class AppVideo {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Carros1");
        video[1] = new Video("Velozes e Furiosos");
        video[2] = new Video("Como falar chinês");

        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Joao", 19, "M", "JhoPK");
        gafanhoto[1] = new Gafanhoto("Fernando", 25, "M", "Nando");

        System.out.println(video[0].toString());
        System.out.println(gafanhoto[0].toString());
    }
}
