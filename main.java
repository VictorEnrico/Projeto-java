import java.util.Scanner;
import java.util.ArrayList;


public class main {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> reserva  = new ArrayList<Integer>();
        while(true) {
            String painel;
            Scanner entrada = new Scanner(System.in);
            String escolha;
            int horario;
            System.out.println(
                "1-Criar reserva\n"+
                "2-Ver reservas\n"+
                "3-Cancelar reservas\n"+
                "4-sair");

            switch(painel){
                case "1":
                    System.out.println( "Deseja colocar qual horario:" );

                    try{
                        horario = entrada.nextInt();
                        reserva.add(horario);
                        
                    } catch(NumberFormatException e) {
                        System.out.println("Digite apenas números.");
                        
                    }
                    System.out.println("");

                    if(reserva.contains(horario)){
                        System.out.println("Horário ja reservdo");
                    } else{
                        System.out.println("Reserva feita");
                        reserva.add(horario);
                    }
                        break;

                case "2":
                    System.out.println(
                        "nome: \n"+nomes+
                        "horario: "+reserva
                    );

                case "3";
                

                
                    

                
            
            }
                
            
            
            
        }
    }
}
