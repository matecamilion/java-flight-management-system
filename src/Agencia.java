import java.util.ArrayList;
import java.util.Date;

public class Agencia {
    private String nombre;
    private String direccion;
    private double fondos;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Empleado> listaEmpleados;
    private Generica<Vuelo> listaVuelos;
    private ArrayList<Avion> listaAviones;



    public Agencia(String nombre, String direccion, double fondos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fondos = fondos;
        this.listaClientes = new ArrayList<Cliente>();
        this.listaEmpleados = new ArrayList<Empleado>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getFondos() {
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

    public boolean existeObjeto(String email) {
        boolean existe = false;
        boolean encontrado = false;

        for (Cliente p : listaClientes) {
            if (p.getEmail().equals(email)) {
                existe = true;
                encontrado = true;
                break;
            }
        }
        if(!encontrado) {
            for (Empleado a : listaEmpleados) {
                if (a.getEmail().equals(email)) {
                    existe = true;
                    break;
                }
            }
        }
        return existe;
    }


    public boolean crearVuelo(int numVuelo, Lugar origen, Lugar destino, Date fechaSalida, Date fechaVuelta, Avion avion, ArrayList<Reserva> listaReservas ) {

        return listaVuelos.agregarelementos(new Vuelo(numVuelo, origen, destino, fechaSalida, fechaVuelta, avion, listaReservas));
    }
}
