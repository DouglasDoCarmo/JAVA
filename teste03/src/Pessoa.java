package src;

import java.util.Date;

public class Pessoa {   
    protected String nome;
    protected String cpf;
    public String endereco;
    protected String RG;
    public Date data_nascimento;
    
    public Pessoa(String _nome, String _cpf, String _endereco, String _RG, Date _data){
        this.nome = _nome;
        this.cpf = _cpf;
        this.endereco = _endereco;
        this.RG = _RG;
        this.data_nascimento =_data;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public double tirarCopias(int qtd){
        //Retorna o preço da copia//
        return 0.15 * (double) qtd;
    }
}    