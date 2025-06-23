package conta_banca;

import java.util.ArrayList;


public class Conta {
    private int agencia;
    private int numero;
    private String cpf;
    private double saldo;
    private int tipoConta;
    private double limite;
    ArrayList<String> movimentacoes = new ArrayList<>();
    public Conta(int agencia ,int numero){
        this.agencia = agencia;
        this.numero = numero;        
        this.saldo = 0;
        this.limite = 0;
        
    
    }
    public  Conta(){
        this.saldo = 0;
        this.limite = 0;
    }
    
    
    /**
     * @return the agencia
     */
    public int getAgencia() {
        return this.agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoConta
     */
    public int getTipoConta() {
        return this.tipoConta;
    }

    /**
     * @param tipoConta the tipoConta to set
     */
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return this.limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double depositar(double valor) {
        this.saldo = this.saldo + valor;
        movimentacoes.add("Deposito de " + valor);
                return this.saldo;
    }
    public boolean sacar(double valor) {
        if(this.saldo - valor >= 0) {
            this.saldo = this.saldo - valor;
            movimentacoes.add("Saque de " + valor);
            return true;
        }else{
            return false;
        }
    }
   public void gerarExtrato(){
        System.out.println("===== Extrato ======");
        for(int i=0; i<movimentacoes.size(); i++) {
            System.out.println(movimentacoes.get(i));
        }
        System.out.println("Saldo = " + this.saldo);
   }
    }
