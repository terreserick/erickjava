package boletim_project;
import javax.swing.*;
public class Boletim_project {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 1° nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 2° nota"));
        
        Aluno aluno_1 = new Aluno(nome, idade, nota1, nota2);
        
        JOptionPane.showMessageDialog(null , "A média de " + aluno_1.getNome() + " é " + aluno_1.calc_media(nota1, nota2));
        if(aluno_1.getMedia()< 6){
            JOptionPane.showMessageDialog(null, "Reprovado");
        }else{
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
    }
}
