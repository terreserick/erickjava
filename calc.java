import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
    double x, y, resul;
    int opp;
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite um n°:  ");
    x = ler.nextDouble();
    System.out.println("Digite outro n°:  ");
    y = ler.nextDouble();
    System.out.println("escolha uma opção para calcular: \n1 - (+)\n2 - (-)\n3- (*)\n4 - (/)");
    opp = ler.nextInt();
    switch (opp) {
        case 1:
            resul = x + y;
            System.out.println("O resultado foi de " + resul);
            break;
        case 2:
            resul = x - y;
            System.out.println("O resultado foi de " + resul);
            break;
        case 3:
            resul = x * y;
            System.out.println("O resultado foi de " + resul);
            break;
        case 4:
            resul = x / y;
            System.out.println("O resultado foi de " + resul);
            break;
        default:
            throw new AssertionError();
    }
    
    }
}
