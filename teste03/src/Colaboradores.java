import java.util.Date;

public class Colaboradores extends Pessoa {
    public Colaboradores(String _name, String _cpf, String _endereco, String _RG, Date _data){
        super(_name, _cpf, _endereco, _RG, _data);
    } 
    protected double slario;
    protected String funcao;
    
}
