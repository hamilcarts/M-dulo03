package Aula02;

import java.util.ArrayList;


public class Turma<T extends Aluno>{
    Professor professor;
    ArrayList<T> alunos = new ArrayList<>();

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<T> getAlunos() {
        return alunos;
    }


    @Override
    public String toString() {
        return "Turma{" +
                "professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }

}
