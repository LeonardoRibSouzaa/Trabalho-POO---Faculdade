/**
 * Atividade Prática - Cofrinho de Moedas
 * Disciplina: Programação Orientada a Objetos
 * Aluno: Leonardo Ribeiro Souza
 * RU: 5223563
 */



import cofre.Cofrinho;
import cofre.model.Dolar;
import cofre.model.Euro;
import cofre.model.Moeda;
import cofre.model.Real;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Cofrinho cofre = new Cofrinho();
        Scanner input = new Scanner(System.in);

        String resp = "";
        while (!resp.equals("5")) {
            System.out.println("""
                    Aluno: Leonardo Ribeiro Souza
                    RU: 5223563
                    
                    ---------Cofre---------
                    [1] Adicionar moeda
                    [2] Remover moeda
                    [3] Listar todas as moedas
                    [4] Total em Real
                    [5] Sair
                    """);
            resp = input.next();

            switch (resp){
                case "1":
                    adicionarMoeda(cofre,input);
                    break;
                case "2":
                    removerMoeda(cofre,input);
                    break;
                case "3":
                    cofre.listagemMoedas();
                    break;
                case "4":
                    System.out.println("Total em reais: " + cofre.totalConvertido());
                    break;
                case "5":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
    public static void adicionarMoeda(Cofrinho cofre, Scanner input){

        String resp = "";
        while (!resp.equals("4")) {
            System.out.println("""
                    ---------Cofre---------
                    [1] Dolar
                    [2] Euro
                    [3] Real
                    [4] Voltar
                    """);
            resp = input.next();

            if (resp.equals("4")){
                break;
            }

            System.out.println("Digite o valor: ");
            double valor = input.nextDouble();

            switch (resp){
                case "1":
                    cofre.adicionar(new Dolar(valor));
                    break;
                case "2":
                    cofre.adicionar(new Euro(valor));
                    break;
                case "3":
                    cofre.adicionar(new Real(valor));
                    break;
            }

        }

    }

    public static void removerMoeda(Cofrinho cofre, Scanner input) {
        System.out.println("Tipo (1-Dolar, 2-Euro, 3-Real): ");
        String tipo = input.next();
        System.out.println("Valor: ");
        double valor = input.nextDouble();

        Moeda moeda = switch (tipo) {
            case "1" -> new Dolar(valor);
            case "2" -> new Euro(valor);
            case "3" -> new Real(valor);
            default -> null;
        };

        if (moeda != null) cofre.remover(moeda);
    }


}