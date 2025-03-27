/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio1 {

class Aluno {
    private final String matricula;
    private final String nome;
    private final double notaProva1;
    private final double notaProva2;
    private final double notaTrabalho;

    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia() {
        return ((notaProva1 * 2.5) + (notaProva2 * 2.5) + (notaTrabalho * 2)) / 7;
    }

    public boolean aprovacao() {
        return calcularMedia() >= 6;
    }

    public void exibirResultado() {
        double media = calcularMedia();
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média Final: " + media);
        System.out.println("Status: " + (aprovacao() ? "APROVADO" : "REPROVADO"));
    }
}

public class Escola {
    private Aluno aluno; // Agora 'aluno' é um atributo de instância

    public void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        aluno = new Aluno(matricula, nome, notaProva1, notaProva2, notaTrabalho);
        
        scanner.close();
    }

    public void exibirResultadoAluno() {
        if (aluno != null) {
            aluno.exibirResultado();
        } else {
            System.out.println("Nenhum aluno cadastrado.");
        }
    }

    public static void main(String[] args) {
        Escola escola = new Escola(); // Criando um objeto de 'Escola'
        escola.cadastrarAluno(); // Cadastrando um aluno
        escola.exibirResultadoAluno(); // Exibindo o resultado
    }
}

}

    

