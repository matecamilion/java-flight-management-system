import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PagoConTargeta implements DatosDePago {

    private String numeroTarjeta;
    private String titular;
    private String fechaExpiracion;
    private String cvv;

    public PagoConTargeta(String numeroTarjeta, String titular, String fechaExpiracion, String cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public double procesarPago(double fondo, double monto) {
        return fondo + monto;

    }

    @Override
    public String obtenerRecibo(double monto) {
        // Generamos una simulación de recibo
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaActual = LocalDateTime.now().format(formatter);

        return "------ Recibo de Pago ------\n" +
                "Fecha: " + fechaActual + "\n" +
                "Método de Pago: Efectivo\n" +
                "Monto: $" + monto + "\n" +
                "¡Gracias por su compra!\n" +
                "----------------------------";
    }
}
