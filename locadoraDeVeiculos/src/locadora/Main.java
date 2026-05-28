package locadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        boolean rodando = true;

        do {
            System.out.println("1 - Cadastro de cliente");
            System.out.println("2 - Criar Locação");
            System.out.println("3 - sair");

            int escolha = sc.nextInt();

            switch(escolha) {

                case 1:
                    System.out.println("====================");
                    System.out.println("CADASTRO DE CLIENTE");
                    System.out.println("====================");
                    System.out.println("Informe CPF do cliente:  ");
                    String cpfInserido = sc.next();

                    System.out.println("Informe o nome do cliente: ");
                    String nomeInserido = sc.next();
                    System.out.println("Informe idade do cliente");
                    int idadeInserida = sc.nextInt();
                    sc.nextLine();

                    Cliente novoCliente = new Cliente(cpfInserido,nomeInserido,idadeInserida);
                    System.out.println("CLIENTE CADASTRADO!");
                    System.out.println(novoCliente.toString());
                break;
                case 2:

                break;
                case 3:
                rodando = false;
                break;

                default:
                    System.out.println("opção inválida");

            }

        }while(rodando);


        }
    }
