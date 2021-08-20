import java.util.Date;

public class Professores extends Pessoa {
    public Professores(String _name, String _cpf, String _endereco, String _RG, Date _data);{
    super(_name, _cpf, _endereco, _RG,_data);
    }
    protected double salario;
    protected String diciplina;   
}

