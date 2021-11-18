public class Teste{
    public static void main(String[] args){
        Aluno a = new Aluno();

        a.setNome("Gabriela Pellin Perosa");
        a.setMatricula(1234);
        a.setCurso("BigData no Agronegócio");
        a.setDisciplina("Java, Internet das Coisas, Projeto Integrador");
        a.setNota1(9);
        a.setNota2(7);
        a.setNota3(10);

        System.out.println("Aluno: " + a.getNome());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Curso: " + a.getCurso());
        System.out.println("Disciplinas: " + a.getDisciplina());
        System.out.println("Notas nas disciplinas: " + a.getNota1() + ", " + a.getNota2() + ", " + a.getNota3());
        a.verificarNotas();
    }
}
