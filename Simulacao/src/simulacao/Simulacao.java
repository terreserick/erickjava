package simulacao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class Simulacao {
    public static void Listagem(List<Veiculo> listaVeiculos){
        for(Veiculo carro : listaVeiculos)
            System.out.println(carro);
    
    }
    public static void main(String[] args) {        
        //Simulação do robo veiculo
        List<Veiculo> listaVeiculos = new ArrayList<> ();
        String placa = JOptionPane.
                showInputDialog("Digite a placa: ");
        Veiculo corsa = new Veiculo(placa);
        listaVeiculos.add(corsa);
        //Pedir para o usuario ano, modelo, marca
        int ano = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o ano: "));
        corsa.setAno(ano);
        
        String marca = JOptionPane.
                showInputDialog("Digite a marca: ");
        corsa.setMarca(marca);
        String modelo = JOptionPane.
                showInputDialog("Digite a modelo: ");
        corsa.setModelo(modelo);
        
                String nome = JOptionPane.
                        showInputDialog("Digite o nome do motorista");
                String CPF = JOptionPane.
                        showInputDialog("Digite o seu CPF");
                corsa.setCPF(CPF);
                
                String CNH = JOptionPane.
                        showInputDialog("Digite sua CNH");

                String fone = JOptionPane.
                        showInputDialog("Digite o seu Telefone");
            
                String email = JOptionPane.
                        showInputDialog("Digite o seu E-mail");
                
                Pessoa Mutora = new Pessoa(CNH);
                Mutora.getNome();
                Mutora.getCPF();
                Mutora.getFone();
                Mutora.getEmail();
        
        //Chamar os métodos
        corsa.ligar();
        int marcha = 1;
        for(int i=10;i<150;i+=10){
           corsa.acelerar();
           if(corsa.getVelocidade()%40 == 0){
             marcha = marcha + 1;
             corsa.mudarMarcha(marcha);             
           }    
        }   
        for(int i=120;i>=0;i-=10){
          corsa.frear();
        }  
        corsa.setMarcha(1);
        corsa.desligar();
        Listagem(listaVeiculos);
    }
    
}
