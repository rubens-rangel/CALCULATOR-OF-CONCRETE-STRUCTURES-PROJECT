import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double valorfck;
        System.out.println("escreva a estrutura desejada:");
        System.out.println("digite 1 para Baldrame");
        System.out.println("digite 2 para Pilar");
        System.out.println("digite 3 para Calcada");
        System.out.println("digite 0 para finalizar");
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();

        switch (a) {
            case 1: // Baldrame
                System.out.println("voce escolheu Baldrame: /n");
                System.out.println("Escolha o tipo de concreto: \n 1 - Fck 15 Mpa \n 2 - Fck 18 Mpa \n 3 - Fck 20 Mpa \n 4 - Fck 25 Mpa");
                Scanner leitorfck = new Scanner(System.in);
                int b = leitorfck.nextInt();
                switch (b) {
                    case 1:
                        valorfck = 454.78;
                        break;
                    case 2:
                        valorfck = 471.61;
                        break;
                    case 3:
                        valorfck = 543.02;
                        break;
                    case 4:
                        valorfck = 578.87;
                        break;
                    default:
                        System.out.println("opcao invalida");
                        break;
                } //Valor do fck
                Baldrame baldrame = new Baldrame();
                //Entrada dos Dados
                Scanner scan = new Scanner(System.in);
                System.out.println("escreva a largura: (cm)");
                baldrame.largura = scan.nextDouble();
                System.out.println("escreva a altura: (cm)");
                baldrame.altura = scan.nextDouble();
                System.out.println("escreva o comprimento (metros)");
                baldrame.comprimento = scan.nextDouble();

                System.out.println(baldrame.calculo());

                break;

            case 2: // Pilar
                System.out.println("voce escolheu Pilar");
                break;

            case 3: // Calcada
                System.out.println("voce escolheu Calcada");
                break;

            case 4: // Finalizar
                System.out.println("");
                break;
            default:
                System.out.println("opcao invalida");
                break;
        }//Fim Switch Global
    }
}//fim Main