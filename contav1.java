import javax.swing.*;

public class contav1 {
    public static  double depositar(double saldo, double valor){
        return saldo + valor;
    };
    public static double sacar(double saldo, double valor){
        return saldo - valor;
    }

    public static void main(String args[]){
        double saldo = 0.0;
        int opp = 0;
        double valor = 0.0;

        while (opp != 5) {
            opp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada \n1- Depositar\n2-Sacar\n3-ver saldo \n5-Sair"));
            switch (opp) {
                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar"));
                    saldo = depositar(saldo, valor);
                    JOptionPane.showMessageDialog(null, "saldo atual: " + saldo);
                    break;
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar"));
                    saldo = sacar(saldo, valor);
                    JOptionPane.showMessageDialog(null, "saldo atual: " + saldo);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, saldo);
                case 5:
                break;    
                
                default:
                    throw new AssertionError();
            }
        }
    }
}

