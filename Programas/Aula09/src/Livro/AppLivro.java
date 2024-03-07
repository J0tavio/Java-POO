package Livro;
import java.util.Scanner;
public class AppLivro {
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);
        Pessoa [] pessoa = new Pessoa[3];
        Livro [] livro = new Livro[3];

        pessoa[0] = new Pessoa("João", 19, "M");
        pessoa[1] = new Pessoa("Roberto", 97, "M");
        pessoa[2] = new Pessoa("Flavio", 40, "M");

        livro[0] = new Livro("Como andar", "Fernado Cabrini", 70, pessoa[0]);
        livro[1] = new Livro("A arte da guerra", "Sun Tzu",160, pessoa[1]);
        livro[2] = new Livro("Como beber água", "Santa Joana", 450, pessoa[2]);

        livro[0].abrir();
        System.out.println("Folhei uma ou mais páginas");
        livro[0].folhear(teclado.nextInt());
        System.out.println(livro[0].detalhes());

        teclado.close();
    }
}
