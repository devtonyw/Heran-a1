import entidades.Aluno;
import entidades.Funcionario;
import entidades.Pessoa;
import entidades.Professor;

import java.time.temporal.TemporalField;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 19,"M");
        Pessoa p2 = new Aluno("Joao", 18, "M", 1234,"Informatica");
        Pessoa p3 = new Professor("Cab", 34,"F","Computação", 3.500f);
        Pessoa p4 = new Funcionario("JOTA", 20, "M", "TI",true);

        //erros
        //p1.receberAumento(550.2f);
        //p2.mudarTrabalho();
        //p4.cancelarMatri();

        System.out.print(p1.toString());
        System.out.print(p2.toString());
        System.out.print(p3.toString());
        System.out.print(p4.toString());

    }
}