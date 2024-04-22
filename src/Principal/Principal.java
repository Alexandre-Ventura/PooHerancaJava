package Principal;

import Model.Aluno;
import DAO.AlunoDAO;
import DAO.ProfessorDAO;
import Model.Professor;
import java.util.*;

public class Principal {
    
    public static void main(String[] args) {
        
        // Cria objeto vazio de aluno apenas para manipular o métodos relacionados a MinhaLista
        Aluno objetoaluno = new Aluno();
        //Insere um objeto completo de Aluno em MinhaLista
        objetoaluno.InsertAlunoBD(new Aluno("Sistemas", 7, 1111, "Tiburcio", 95));
        System.out.println("\n ##########----------TESTE 1 - Criando primeiro Aluno --------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
        
        // Insere um SEGUNDO objeto completo de Aluno em MinhaLista
        objetoaluno.InsertAlunoBD(new Aluno("Massagem", 2, 2222, "Marilene", 21));
        System.out.println("\n ##########----------TESTE 2 - Criando segundo Aluno --------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
        
        // APAGA um objeto de Aluno em MinhaLista Utilizando o campo ID como referência.
        objetoaluno.DeleteAlunoBD(1111);
        System.out.println("\n ##########----------TESTE 3 - Excluindo primero Aluno --------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
        
        // EDITA um objeto de Aluno dentro de MinhaLista Utilizando o campo ID como referência e mandando outro objeto como modelo.
        Aluno objetoaluno2 = new Aluno("Massagem Plus", 3, 2222, "Marileneeeee", 25);
        objetoaluno.UpdateAlunoBD(2222, objetoaluno2);
        System.out.println("\n ##########----------TESTE 4 - Editando segundo Aluno --------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
        
        
        // Cria objeto vazio de professor apenas para manipular o métodos relacionados a MinhaLista
        Professor objetoprofessor = new Professor();
        //Insere um objeto completo de Professor em MinhaLista
        objetoprofessor.InsertProfessorBD(new Professor(6540.50, "Mestre", 11, "Paulo", 41));
        System.out.println("\n ##########----------TESTE 5 - Criando primeiro Professor --------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoprofessor.getMinhaLista().toString());
        
        // Insere um SEGUNDO objeto completo de Professor em MinhaLista
        objetoprofessor.InsertProfessorBD(new Professor(10500.00, "Doutor", 22, "Maria", 50));
        System.out.println("\n ##########----------TESTE 6 - Criando segundo Professor--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoprofessor.getMinhaLista().size());
        System.out.println(objetoprofessor.getMinhaLista().toString());
        
        // APAGA um objeto de Professor em MinhaLista Utilizando o campo ID como referência.
        objetoprofessor.DeleteProfessorBD(22);
        System.out.println("\n ##########----------TESTE 7 - Excluindo segundo Professor --------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoprofessor.getMinhaLista().toString());
        
        // EDITA um objeto de Aluno dentro de MinhaLista Utilizando o campo ID como referência e mandando outro objeto como modelo.
        Professor objetoprofessor2 = new Professor(9000.60, "Mestre", 11, "Paulo", 41);
        objetoprofessor.UpdateProfessorBD(11, objetoprofessor2);
        System.out.println("\n ##########----------TESTE 8 - Editando primerio Professor --------####### \n ");
        System.out.println("Tamanho da lista: " + objetoprofessor.getMinhaLista().size());
        System.out.println(objetoprofessor.getMinhaLista().toString());
    }
}