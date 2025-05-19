import java.util.Scanner;

public class Exemplo{

    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = ler.next();
        System.out.println("boa tarde " + nome);
    }
}
