import java.util.Scanner;
import java.util.ArrayList;

public class Cliente{
    String nome;
    int telefone;

    public Cliente(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

}

public class Mesa{
    int numero;
    int capacidade;
    String disponiblidade;
    
    public Mesa(int numero, int capacidade, String disponiblidade){
        this.numero = numero;
        this.capacidade = capacidade;
        this.disponiblidade = disponiblidade;
        
    }



}

public class Reserva{
    String cliente;
    int horario;
    int data;
    int espaco;

    public Reserva(String cliente, int horario, int data, int espaco){
        this.cliente = cliente;
        this.horario = horario;
        this.data = data;
        this.espaco = espaco;
    }
}