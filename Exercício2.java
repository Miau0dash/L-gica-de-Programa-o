/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício2;

/**
 *
 * @author usuario
 */
public class Exercício2 {

    public class Carro {
    // Atributos encapsulados
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int velocidade;

    // Construtor
    public Carro(String modelo, String cor, int ano, String marca) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.velocidade = 0; // Inicializa a velocidade com 0
    }

    // Métodos getter e setter para encapsulamento
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // Método para acelerar ou desacelerar
    public void acelera(int direcao) {
        if (direcao == 1) {
            velocidade += 5; // Aumenta 5 km/h
        } else if (direcao == -1) {
            velocidade -= 5; // Diminui 5 km/h
            if (velocidade < 0) {
                velocidade = 0; // Evita que a velocidade seja negativa
            }
        }
    }

    // Método para frear o carro (velocidade = 0)
    public void freia() {
        velocidade = 0;
    }

    // Método para exibir as informações do carro
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}

    

public class Principal {
    public static void main(String[] args) {
        // Criando o scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados do carro
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        
        System.out.print("Digite a cor do carro: ");
        String cor = scanner.nextLine();
        
        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        
        scanner.nextLine();  // Consome a nova linha deixada pelo nextInt()
        
        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        // Instanciando um objeto da classe Carro
        Carro meuCarro = new Carro(modelo, cor, ano, marca);

        // Exibe as informações iniciais do carro
        System.out.println("\nInformações do carro:");
        meuCarro.exibirInfo();

        // Interação com o usuário para testar aceleração e frenagem
        System.out.print("\nDeseja acelerar (1) ou desacelerar (-1)? ");
        int direcao = scanner.nextInt();
        meuCarro.acelera(direcao);

        // Exibe a nova velocidade após aceleração ou desaceleração
        System.out.println("\nInformações após aceleração/desaceleração:");
        meuCarro.exibirInfo();

        // Pergunta se deseja frear
        System.out.print("\nDeseja frear o carro (Sim = 1, Não = 0)? ");
        int opcaoFreio = scanner.nextInt();
        
        if (opcaoFreio == 1) {
            meuCarro.freia();
        }

        // Exibe as informações após frear
        System.out.println("\nInformações após frenagem:");
        meuCarro.exibirInfo();

        // Fecha o scanner
        scanner.close();
    }
}

    
}
