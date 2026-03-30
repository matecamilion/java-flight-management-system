import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
    private int numVuelo;
    private Lugar origen;
    private Lugar destino;
    private Date fechaSalida;
    private Date fechaVuelta;
    private Avion avion;
    private ArrayList<Reserva> listaReservas;

    public Vuelo(int numVuelo, Lugar origen, Lugar destino, Date fechaSalida, Date fechaVuelta, Avion avion, ArrayList<Reserva> listaReservas) {
        this.numVuelo = numVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaVuelta = fechaVuelta;
        this.avion = avion;
        this.listaReservas = new ArrayList<>();
    }

    public int getNumVuelo() {
        return numVuelo;
    }


    public Lugar getOrigen() {
        return origen;
    }


    public Lugar getDestino() {
        return destino;
    }


    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(Date fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "numVuelo=" + numVuelo +
                ", origen=" + origen +
                ", destino=" + destino +
                ", fechaSalida=" + fechaSalida +
                ", fechaVuelta=" + fechaVuelta +
                ", avion=" + avion +
                '}';
    }
}
