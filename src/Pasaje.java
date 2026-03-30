public class Pasaje {

    private static int contId = 0;
    private int id;
    private int precio;
    private Vuelo vuelo;
    private Cliente cliente;

    public Pasaje(int id, int precio, Vuelo vuelo, Cliente cliente) {
        this.id = contId++;
        this.precio = precio;
        this.vuelo = vuelo;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
