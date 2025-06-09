import javax.swing.*;

public class areatri {
    public static void main(String args[]){
        double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do triangulo: "));        
        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do triangulo°: " ));
        double area = base * height / 2;
        JOptionPane.showMessageDialog(null, area);
}}
