import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Reserva> reservas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        while (true) {

            System.out.println(
                    "1-Criar reserva\n" +
                    "2-Ver reservas\n" +
                    "3-Cancelar reservas\n" +
                    "4-Sair");

            String painel = entrada.nextLine();

            switch (painel) {

                case "1":

                    System.out.println("Nome:");
                    String nome = entrada.nextLine();

                    System.out.println("Horário:");
                    int horario = entrada.nextInt();

                    System.out.println("Data:");
                    int data = entrada.nextInt();

                    System.out.println("Espaço:");
                    int espaco = entrada.nextInt();

                    entrada.nextLine(); // limpar buffer

                    boolean ocupado = false;

                    for (Reserva r : reservas) {
                        if (r.horario == horario && r.data == data) {
                            ocupado = true;
                            break;
                        }
                    }

                    if (ocupado) {
                        System.out.println("Horário já reservado.");
                    } else {

                        Reserva novaReserva = new Reserva(
                                nome,
                                horario,
                                data,
                                espaco);

                        reservas.add(novaReserva);

                        System.out.println("Reserva criada com sucesso.");
                    }

                    break;

                case "2":

                    if (reservas.isEmpty()) {
                        System.out.println("Nenhuma reserva cadastrada.");
                    } else {

                        for (Reserva r : reservas) {
                            System.out.println(
                                    "Cliente: " + r.cliente +
                                    "\nHorário: " + r.horario +
                                    "\nData: " + r.data +
                                    "\nEspaço: " + r.espaco +
                                    "\n");
                        }
                    }

                    break;

                case "3":

                    System.out.println("Digite o nome da reserva para cancelar:");
                    String nomeCancelar = entrada.nextLine();

                    boolean removido = false;

                    for (int i = 0; i < reservas.size(); i++) {

                        if (reservas.get(i).cliente.equalsIgnoreCase(nomeCancelar)) {

                            reservas.remove(i);
                            removido = true;

                            System.out.println("Reserva cancelada.");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Reserva não encontrada.");
                    }

                    break;

                case "4":

                    System.out.println("Encerrando sistema...");
                    entrada.close();
                    return;

                default:

                    System.out.println("Opção inválida.");
            }
        }
    }
}