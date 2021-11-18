public class Aluno{
    private String nome;
    private int matricula;
    private String curso;
    private String disciplina;
    private float nota1;
    private float nota2;
    private float nota3;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return this.matricula;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return this.curso;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return this.disciplina;
    }

    public void setNota1(float nota1){
        this.nota1 = nota1;
    }
    public float getNota1(){
        return this.nota1;
    }

    public void setNota2(float nota2){
        this.nota2 = nota2;
    }
    public float getNota2(){
        return this.nota2;
    }

    public void setNota3(float nota3){
        this.nota3 = nota3;
    }
    public float getNota3(){
        return this.nota3;
    }

    public void verificarNotas(){
        if (nota1 >= 7 && nota2 >= 7 && nota3 >= 7){
            System.out.println("Aluno(a) Aprovado(a)!!");
        }else{
            System.out.println("Aluno(a) Reprovado(a)!!");
        }
    }

}