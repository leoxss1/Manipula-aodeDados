import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Scanner leitor = new Scanner(System.in);

        System.out.println(" === Bem vindo ao Laboratório === ");

        int opcao;

        do {
            System.out.println("1- Cadastrar paciente:");
            System.out.println("2- Próximo paciente:");
            System.out.println("3- Atender paciente:");
            System.out.println("4- Listar pacientes:");
            System.out.println("0- Sair");

            System.out.println("Digite uma opçao: ");
             opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" === Cadastrar paciente === ");

                    leitor.nextLine();

                    System.out.println("Nome: ");
                    String nome = leitor.nextLine();

                    System.out.println("Senha: ");
                    String senha = leitor.next();

                    System.out.println("Idade: ");
                    int idade = leitor.nextInt();

                    System.out.println("Tipo de atendimento: ");
                    String tipoAtendimento = leitor.next();

                    Cliente cliente = new Cliente(nome, senha, idade, tipoAtendimento);

                    fila.enfileirar(cliente);

                    System.out.println("Paciente cadastrado!");

                    break;
                case 2:
                    System.out.println(" === Próximo paciente ===");

                    Cliente proximo = fila.espiar();

                    if (proximo != null) {
                        System.out.println(proximo);
                    }
                    break;
                case 3:
                    System.out.println(" === Atender paciente ===");

                    Cliente clienteAtendido = fila.desenfileirar();

                    if (clienteAtendido != null) {
                        System.out.println("Paciente atendido:");
                        System.out.println(clienteAtendido);
                    }
                    break;
                case 4:
                    fila.listar();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção invalida!");

            }
        } while (opcao!= 0) ;
    }
}