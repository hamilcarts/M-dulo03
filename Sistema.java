package Aula02;

import java.util.Collections;

public class Sistema{
    public static void main(String[] args) {
        Turma<AlunoJava> turmaJava = new Turma<>();
        Turma<AlunoJs> turmaJS = new Turma<>();

        Professor professorJava = new Professor("Kadu Borges");
        Professor professorJS = new Professor("Kadu");
        turmaJava.setProfessor(professorJava);
        turmaJS.setProfessor(professorJS);

        AlunoJava alunoJava1 = new AlunoJava("Tereza");
        AlunoJava alunoJava2 = new AlunoJava("Jõao");
        AlunoJava alunoJava3 = new AlunoJava("Pedro");

        AlunoJs alunoJs1 = new AlunoJs("Jorge");
        AlunoJs alunoJs2 = new AlunoJs("Adriana");
        AlunoJs alunoJs3 = new AlunoJs("Marinez");

        incluirAluno(alunoJava1, turmaJava);
        incluirAluno(alunoJava2, turmaJava);
        incluirAluno(alunoJava3, turmaJava);

        incluirAluno(alunoJs1, turmaJS);
        incluirAluno(alunoJs2, turmaJS);
        incluirAluno(alunoJs3, turmaJS);

        System.out.println(turmaJava);
        System.out.println(turmaJS);

        Collections.sort(turmaJava.getAlunos());
        Collections.sort(turmaJS.getAlunos());

        System.out.println(turmaJava);
        System.out.println(turmaJS);


    }
    public static <T extends Aluno> void incluirAluno(T aluno, Turma<T> turma){
        turma.getAlunos().add(aluno);
    }


    }


