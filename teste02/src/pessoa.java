package src;

import java.util.Date;

public class pessoa {   
    public String nome;
    public String cpf;
    public String endereco;
    public String RG;
    public Date data_nascimento;
    
    public pessoa(String _nome, String _cpf, String _endereco, String RG,Date _data){
        this.nome = _nome;
        this.cpf = _cpf;
        this.endereco = _endereco;
        this.RG = _RG;
        this.data_nascimento =_data;
    }
}    