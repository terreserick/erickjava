package conta_banca;
import javax.swing.*;
public class Conta_banca {

    public static void main(String[] args) {
        int opp = 0;
        Conta conta_beta = new Conta();
        while(opp != 5) {
        opp = Integer.parseInt(JOptionPane.
                showInputDialog("Selecione uma opção:\n1- Criar conta\n2- Depositar\n3-Sacar \n4- Ver Saldo\n5- Sair"));
        switch(opp) {
            case 1:
                int agencia = Integer.parseInt(JOptionPane.
                showInputDialog("Digite o Id da agencia: "));; 
                int numero = Integer.parseInt(JOptionPane.
                showInputDialog("Digite o N° da conta"));; 
                String cpf = JOptionPane.
                showInputDialog("Digite seu CPF");
                int tipoConta = Integer.parseInt(JOptionPane.
                showInputDialog("Digite o N° de uso da conta"));; ;
                
                conta_beta = new Conta(agencia , numero);
                
                break;
            case 2:
                double valor = Double.parseDouble
        (JOptionPane.showInputDialog("Digite o valor que deseja depositar"));
                conta_beta.depositar(valor);
                break;
            case 3:
                valor = Double.parseDouble
        (JOptionPane.showInputDialog("Digite o valor que deseja sacar"));
                if(conta_beta.sacar(valor) == true){
                    conta_beta.sacar(valor);
                }else{
                    JOptionPane.showMessageDialog(null , "Saque invalido");
                }
               break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "Saldo = " + conta_beta.getSaldo());
                break;
                
            case 5:
                break;
            default:
                throw new AssertionError();
        }
        }
    }
    
}
