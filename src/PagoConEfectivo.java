import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PagoConEfectivo implements DatosDePago{


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
