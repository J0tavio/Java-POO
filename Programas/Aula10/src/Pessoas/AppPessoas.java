package Pessoas;
public class AppPessoas {
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Aluno();
        Pessoa p3 = new Professor();
        Pessoa p4 = new Funcionario();

        p1.setNome("João");
        p2.setNome("Maria");
        p3.setNome("Claudia");
        p4.setNome("Fabiana");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
