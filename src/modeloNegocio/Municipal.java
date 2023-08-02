package modeloNegocio;

public class Municipal extends Envio {

    @Override
    public int precioEnvio() {
        return 5000;
    }
    @Override
    public String tiempoEnvio() {
        return "Tiempo envio 12 horas";
    }
    @Override
    public boolean esPermitidoEnAvion() {
        return false;
    }
}
