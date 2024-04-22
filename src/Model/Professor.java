package Model;
import DAO.ProfessorDAO;
import java.util.*;

public class Professor extends Pessoa {
    
    // Atributos
    private double salario;
    private String titulo;

    // Método construtor vázio
    public Professor() {

    }

    // Método construtor de Objetos, inserindo dados
    public Professor(double salario, String titulo){
        this.salario = salario;
        this.titulo = titulo; 
    }

    // Método construtor de Objetos com dados da classe Pai
    public Professor(double salario, String titulo, int id, String nome, int idade){
        super(id, nome, idade);
        this.salario = salario;
        this.titulo = titulo;
    }

    // Métodos GET e SET
    public double getSalario(){
        return salario; 
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    // Exemplo de Override
    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Sálario R$: " + this.salario);
        System.out.println("Título: " + this.titulo);
    }

    // Override necessário para poder retornar os dados de Pessoa no toString para professor.
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
        + "\n Nome: " + this.getNome()
        + "\n Idade: " + this.getIdade()
        + "\n Sálario R$: " + this.getSalario()
        + "\n Título:" + this.getTitulo()
        + "\n -----------";
    }

    // Retorna a Lista de Professores(objetos)
    public ArrayList getMinhaLista() {
        return ProfessorDAO.MinhaLista;
    }

    // Cadastra novo professor
    public boolean InsertProfessorBD(Professor objeto) {
        ProfessorDAO.MinhaLista.add(objeto);
        return true;
    }
    
    // Deleta um professor específico pelo seu campo ID
    public boolean DeleteProfessorBD(int id) {
        int indice = this.procuraIndice(id);
        ProfessorDAO.MinhaLista.remove(indice);
        return true;
    }
    
    // Edita um aluno específico pelo seu campo ID
    public boolean UpdateProfessorBD(int id, Professor objeto) {
        int indice = this.procuraIndice(id);
        ProfessorDAO.MinhaLista.set(indice, objeto);
        return true;
    }
    
    // procura o ÍNDICE de objeto da MinhaLista que contem o ID enviado.
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < ProfessorDAO.MinhaLista.size(); i++) {
            if (ProfessorDAO.MinhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
}
