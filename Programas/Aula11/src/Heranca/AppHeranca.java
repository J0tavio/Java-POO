package Heranca;
public class AppHeranca {
    public static void main(String[] args) throws Exception {
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");
        aluno1.setMatricula(055);
        aluno1.setIdade(19);
        aluno1.setCurso("ADS");
        aluno1.pagarMensalidade();

        Bolsista bolsista1 = new Bolsista();
        bolsista1.setNome("João");
        bolsista1.setMatricula(7777);
        bolsista1.setIdade(20);
        bolsista1.setCurso("SI");
        bolsista1.pagarMensalidade();

        Professor professor1 = new Professor();
        professor1.setNome("Lêndio");
        professor1.setIdade(40);
        professor1.setSalario(4000);
        professor1.statusProfessor();
        professor1.receberAumento(500);
    }
}
