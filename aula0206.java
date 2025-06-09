import java.util.Scanner;

public class aula0206 {
    public static void main(String[] args) {
        String nome;
        Integer dia_da_semana; 
        Integer idade; 
        Scanner read = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = read.nextLine();
        System.out.println("Digite sua idade:");
        idade = read.nextInt();
        System.out.println("Digite o N° do dia da semana:");
        dia_da_semana = read.nextInt();
        switch (dia_da_semana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                throw new AssertionError();
        }
        if (idade <= 24) {
            System.out.println("Jovem Aprediz!");
        } else {
            System.out.println("CLT!");
        }
    }
}
