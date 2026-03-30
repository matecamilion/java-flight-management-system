public class Empleado extends Usuario {

    public Empleado(String nombre, String apellido, int DNI, String email, String password) {
        super(nombre, apellido, DNI, email, password);
    }

    @Override
    public String toString() {
        return "Agente{}";
    }
}
