import java.util.ArrayList;

public class Cliente extends Usuario {

    private ArrayList<Reserva> listaReservas;


    public Cliente(String nombre, String apellido, int DNI, String email, String password, TipoUsuario tipoUsuario) {
        super(nombre, apellido, DNI, email, password, tipoUsuario);
    }

    @Override
    public String toString() {
        return "Pasajero{}";
    }
}
