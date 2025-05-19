import java.util.Scanner;

public class Exemplo2{

    public static void main(String args[]){
        Scanner ler = new  Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = ler.next();

        int anoAtual, anoNasc, idade; 
        System.out.println("Digite o ano atual: ");
        anoAtual = ler.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        anoNasc = ler.nextInt();
        
        idade = anoAtual - anoNasc;
        
        if(idade >= 18){
            System.out.println("CNH");
        } else{
            System.out.println("Não pode dirigir");
        }
        
        System.out.println("Olá " + nome);
        System.out.println("Sua idade é " + idade);


    }
}
