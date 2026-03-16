public class HotelApp {

    String nomeHotel;
    String cidade;
    int quantidadeQuartos;

    void abrirHotel() {
        System.out.println("Hotel aberto!");
    }

    void mostrarHotel() {
        System.out.println("Hotel: " + nomeHotel);
        System.out.println("Cidade: " + cidade);
        System.out.println("Quantidade de quartos: " + quantidadeQuartos);
    }

    void fecharHotel() {
        System.out.println("Hotel fechado!");
    }

    public static void main(String[] args) {

        HotelApp hotel = new HotelApp();

        hotel.nomeHotel = "Hotel Timbó Paradise";
        hotel.cidade = "Maracanaú";
        hotel.quantidadeQuartos = 50;

        hotel.abrirHotel();
        hotel.mostrarHotel();

        Reserva reserva = new Reserva();

        reserva.nomeHospede = "João";
        reserva.numeroQuarto = 12;
        reserva.quantidadeDias = 3;
        reserva.valorDiaria = 150;

        reserva.confirmarReserva();
        reserva.exibirReserva();

        double total = reserva.calcularTotalHospedagem();

        System.out.println("Total da hospedagem: R$ " + total);

        hotel.fecharHotel();
    }

}