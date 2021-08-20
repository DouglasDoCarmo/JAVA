import java.util.Date;

public class Estudantes extends Pessoa {
    public Estudantes(String _name, String _cpf, String _endereco, String _RG, Date _data){
        super(_name, _cpf, _endereco, _RG, _data);
    } 
    protected String matricula;
}
