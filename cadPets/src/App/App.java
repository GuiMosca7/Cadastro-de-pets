package App;

import model.*;
import val.Validacao;

import java.util.Scanner;

public class App {

    private static final Scanner sc = new Scanner(System.in);

    public static void Main(String[] args) {

        int option;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar Pet");
            System.out.println("2 - Cadastrar Dono");
            System.out.println("3 - Sair");
            System.out.println("========================");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    cadastrarPet();
                    break;

                case 2:
                    cadastrarDono();
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 3);
    }

    private static void cadastrarPet() {
        System.out.println("\n--- CADASTRO DE PET ---");

        Pets pets = new Pets();

        String nome = sc.nextLine();

        if (Validacao.validarString(nome)) {
            pets.setNome(nome);
        } else {
            System.out.println("Digite um nome valido");
        }

        String porte = sc.nextLine();

        if (Validacao.validarString(porte)) {
            pets.setPorte(porte);
        } else {
            System.out.println("Digite um porte valido");
        }

        String raca = sc.nextLine();

        if (Validacao.validarString(raca)) {
            pets.setRaca(raca);
        } else {
            System.out.println("Digite uma raça valida");
        }

    }

    private static void cadastrarDono() {
        System.out.println("\n--- CADASTRO DE DONO ---");

        Dono dono = new Dono();

        String nome = sc.nextLine();

        if (Validacao.validarString(nome)) {
            dono.setNome(nome);
        } else {
            System.out.println("Digite um nome valido");
        }

        String telefone = sc.nextLine();

        if (Validacao.validarTelefone(telefone)) {
            dono.setTelefone(telefone);
        } else {
            System.out.println("Digite um porte valido");
        }
    }
}
