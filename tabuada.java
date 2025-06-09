import javax.swing.*;

public class tabuada {
    public static void main(String args[]){
    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n°: "  ));
    for (int i = 0; i <= 10; i++){
        int r = i * num;
        System.out.println(i + " X " +num+ " = " +r);    
    }
}
}
