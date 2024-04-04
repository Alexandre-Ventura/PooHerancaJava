package Principal;

import Model.Aluno;
import DAO.AlunoDAO;
import java.util.*;

public class Principal {
    
    public static void main(String[] args) {
        
        // Cria objeto vazio de aluno apenas para manipular o métodos relacionados a MinhaLista
        Aluno objetoaluno = new Aluno();
        //Insere um objeto completo de Aluno em MinhaLista
        objetoaluno.InsertAlunoBD(new Aluno("Sistemas", 7, 1111, "Tiburcio", 95));
        System.out.println("\n ##########----------TESTE 1--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
        
        // Insere um SEGUNDO objeto completo de Aluno em MinhaLista
        objetoaluno.InsertAlunoBD(new Aluno("Massagem", 2, 2222, "Marilene", 21));
        System.out.println("\n ##########----------TESTE 2--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
        
        // APAGA um objeto de Aluno em MinhaLista Utilizando o campo ID como referência.
        objetoaluno.DeleteAlunoBD(1111);
        System.out.println("\n ##########----------TESTE 3--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
        
        // EDITA um objeto de Aluno dentro de MinhaLista Utilizando o campo ID como referência e mandando outro objeto como modelo.
        Aluno objetoaluno2 = new Aluno("Massagem Plus", 3, 2222, "Marileneeeee", 25);
        objetoaluno.UpdateAlunoBD(2222, objetoaluno2);
        System.out.println("\n ##########----------TESTE 4--------####### \n ");
        System.out.println("Tamanho da lista: " + objetoaluno.getMinhaLista().size());
        System.out.println(objetoaluno.getMinhaLista().toString());
    }
}