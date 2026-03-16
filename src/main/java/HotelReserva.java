public class Reserva {

    String nomeHospede;
    int numeroQuarto;
    int quantidadeDias;
    double valorDiaria;

    void confirmarReserva() {
        System.out.println("Reserva confirmada para " + nomeHospede);
    }

    void cancelarReserva() {
        System.out.println("Reserva cancelada para " + nomeHospede);
    }

    void exibirReserva() {
        System.out.println("Hóspede: " + nomeHospede);
        System.out.println("Quarto: " + numeroQuarto);
        System.out.println("Dias: " + quantidadeDias);
        System.out.println("Valor da diária: " + valorDiaria);
    }

    double calcularTotalHospedagem() {
        return quantidadeDias * valorDiaria;
    }

}