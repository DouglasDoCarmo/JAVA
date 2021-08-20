package src;

import java.util.Date;
public class App {
    public static void main(String[] args){
        Pessoa prof = new Pessoa ("Andreia", "123.456.789-00", "Rua X", "12345", new Date());
        System.out.println("Atributos foram preenchidos\n\nNome: " + prof.nome);
        System.out.println("CPF: " + prof.cpf);
        System.out.println("Data de nascimento: " + prof.data_nascimento);
    }
}