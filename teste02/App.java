import java.util.Date;

public class App {
    public static void main(String [] args){
        pessoa prof = new pessoa("Andreia","123.456.789-00","Rua X", new Date());
        System.out.println("Atributos foram preenchidos\n\nNome:" + prof.nome);
        System.out.println("CPF" + prof.cpf);
        System.out.println("Data de nascimento:" + prof.data_nascimento);
    }
    
}
