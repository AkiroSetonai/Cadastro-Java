package Cadastro;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner cadastro = new Scanner(System.in);

        int numeroMax = 10;
        String[] usuarios = new String[numeroMax];

        int usuariosCadastrados = 0;
        int opcao = 0;

        while (opcao != 4){
            System.out.println("\n===== Menu ======");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Excluir Usuário");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção.");
            opcao = cadastro.nextInt();
            cadastro.nextLine();

            switch (opcao){
                case 1:
                    if(usuariosCadastrados < numeroMax){
                        System.out.println("Coloque o nome do usuário");
                        String nomeUsuario = cadastro.nextLine();
                        usuarios[usuariosCadastrados] = nomeUsuario;
                        usuariosCadastrados++;
                        System.out.println("Usuário cadastrado com sucesso");
                    } else {
                        System.out.println("Limite de cadastro atingido");
                    }
                    break;
                case 2:
                    if (usuariosCadastrados == 0){
                        System.out.println("Nenhum usuário cadastrado");
                    } else {
                        System.out.println("===== Usuários Cadastrados =====");
                        for (int i = 0; i < usuariosCadastrados ; i++) {
                            System.out.println((i + 1) + ". " + usuarios[i]);
                        }
                    }
                    break;
                case 3:
                    if (usuariosCadastrados == 0){
                        System.out.println("Não existe usuários para remover");
                    } else {
                        System.out.println("===== Usuários Cadastrados =====");
                        for (int i = 0; i < usuariosCadastrados; i++) {
                            System.out.println((i + 1) + ". " + usuarios[i]);
                        }

                        System.out.println("Informe o número do usuário que deseja remover:");
                        int removerUsuario = cadastro.nextInt();
                        cadastro.nextLine(); //

                        if (removerUsuario < 1 || removerUsuario > usuariosCadastrados) {
                            System.out.println("Número inválido.");
                        } else {
                            for (int i = removerUsuario - 1; i < usuariosCadastrados - 1; i++) {
                                usuarios[i] = usuarios[i + 1];
                            }
                            usuarios[usuariosCadastrados - 1] = null;
                            usuariosCadastrados--;

                            System.out.println("Usuário removido com sucesso.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Finalizando Programa");
                    break;
                default:
                    System.out.println("Escolha uma opção valida");
                    break;
            }

        }
    }
}
