package br.com.abc.test;

import br.com.abc.classes.Professor;



public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "José";
        professor.matricula = "P654";
        professor.cpf= 12346;
        professor.rg=78956235;

        System.out.println(professor.nome);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);
        System.out.println(professor.matricula);
    }
}
