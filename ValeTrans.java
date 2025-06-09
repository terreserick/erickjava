import javax.swing.*;

public class ValeTrans {
    public static void main(String args[]){
        double preco = 0.1;
        int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de passagens desejadas "));
        int status = Integer.parseInt(JOptionPane.showInputDialog(null, "Estudante [1] [0 cidadão]:"));
        if (status == 1) {
            preco = 3.75;
        } else {
            preco = 5.45;
        }
        double valorf = preco * qtd;
        JOptionPane.showMessageDialog(null, valorf);  
    }
}
