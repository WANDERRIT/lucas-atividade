import java.util.Scanner;

public class App {

    // public static final double PODE_COMPRAR = 16;

    public static void main(String[] args) throws Exception {
        //exercício 1
        System.out.println("Wander Riti Barbosa");

        Calculadora(5, 2);

        Correios("São Paulo");

        Concessionaria("Sonata", 45000);

        LojaPeixe(3, 6);

        PetShop(15, 2);

        MiniMercado(200);
    }

    //exercício 2
    public static void Calculadora(double num1, double num2) {
        double soma = num1 + num2;
        double sub = num1 - num2;
        System.out.println("Sua soma é: " + soma);
        System.out.println("Sua divisão é: " + num1 / num2);
        System.out.println("Sua multiplicação é: " + num1 * num2);
        System.out.println("Sua subtração é: " + sub);

    }

     //exercício 3
    public static void podeComprar(int podeComprar) {
        if (podeComprar >= 16) {
            System.out.println("Pode comprar");
        } else {
            System.out.println("Não pode comprar!");

        }
    }

     //exercício 4
    public static void Correios(String estado) {
        switch (estado) {
            case "São Paulo":
                System.out.println("Seu frete é de: " + 15.00);
                break;

            case "Minas Gerais":
                System.out.println("Seu frete é de: " + 12.00);
                break;

            case "Rio de Janeiro":
                System.out.println("Seu frete é de: " + 17.00);
                break;

            default:
                System.out.println("Estado não informado, favor informar um estado");
                break;
        }
    }

     //exercício 5
    public static void Concessionaria(String modelo, int preco) {
        // Scanner price = new Scanner(System.in);
        // preco = price.nextDouble();

        // Scanner model = new Scanner(System.in);
        // modelo = model.next();

        if (preco != 0 && modelo != "") {
            double entrada = (preco * 0.30);
            double parcela = preco / 12;

            System.out.println(
                    "O carro " + modelo + " tem entrada de " + entrada + " e parcelas a partir de: " + parcela);
        }
        // Não se esse atende o enunciado

    }

     //exercício 6
    public static void LojaPeixe(int pessoas, int peixe) {

        for (int i = 0; i < 1; i++) {
            int entrada = pessoas * 20;
            int peixes = 12;
            int totalPeixe = peixes * pessoas;
            System.out.printf(
                    "Uma família de %d pessoas, pagou um valor de %d na entrada, pescou %d peixes e seu valor total foi de %d \n",
                    pessoas, entrada, peixe, totalPeixe);
        }

        // Não entendi o enunciado
    }

     //exercício 7
    public static void PetShop(double peso, double consumo) {

        double pesoEmGramas = peso / 1000;
        double diasDeDuracao = (peso / consumo);

        double sobra = (pesoEmGramas % consumo);

        System.out.printf("A ração irá durar %.1f ", diasDeDuracao);
        System.out.println("A sobra é " + sobra);

    }

     //exercício 8
    public static void MiniMercado(double totalCompra) {

        double parcelas = totalCompra / 6;
        if (parcelas < 20.00) {
            System.out.println("Não é possível parcelar compra cuja a parcela é menor que R$20,00");
        } else{System.out.printf("Sua compra pode ser parcelada em 6x de %.2f ", parcelas);
    }

    }
}
