public class Lugar {

    private String ciudad;
    private String codigoAeropuerto;
    private String pais;

    public Lugar(String pais, String codigoAeropuerto, String ciudad) {
        this.pais = pais;
        this.codigoAeropuerto = codigoAeropuerto;
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getcodigoAeropuerto() {
        return codigoAeropuerto;
    }

    public void setcodigoAeropuerto(String codigoAeropuerto) {
        this.codigoAeropuerto = codigoAeropuerto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "ciudad='" + ciudad + '\'' +
                ", codigoAeropuerto='" + codigoAeropuerto + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
