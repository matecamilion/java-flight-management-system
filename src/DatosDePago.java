public interface DatosDePago {

    double procesarPago(double fondo, double monto);
    String obtenerRecibo(double monto);
}
