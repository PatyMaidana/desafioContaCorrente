import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Jean Grey";
        String tipoConta = "corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*******************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Conta " + tipoConta);
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("\n*******************************");
        String menu = """
                
                \nMenu de opções:
                1 - Consultar Saldos
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                
                Digite a opção desejada:
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.printf("Saldo em conta: %.2f. ", saldo);

            } else if (opcao == 2) {
                System.out.println("Digite o valor recebido: ");
                double saldoRecebido = leitura.nextDouble();
                System.out.printf("O valor recebido é %.2f. ", saldoRecebido );
                saldo += saldoRecebido;
                System.out.printf("\nSeu saldo atual é %.2f. ",  saldo) ;
            } else if (opcao == 3){
                    System.out.println("Digite o valor a ser enviado: ");
                    double enviaValor = leitura.nextDouble();
                        if(saldo < enviaValor) {
                            System.out.println("Saldo insuficiente, tente outro valor. ");
                        } else {
                                saldo -= enviaValor;
                                System.out.printf("Seu saldo atual é %.2f. ", saldo);
                            }
                        }
                else if (opcao != 4){
                System.out.println("Opção inválida! Tente novamente.");
            }
                }
            }
        }

