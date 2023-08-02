package modeloNegocio;

public class Internacional extends Envio {

    @Override
    public int precioEnvio() {
    return 25000;
    }
    @Override
    public String tiempoEnvio() {
        return "Tiempo envio 190 horas";
    }
    @Override
    public boolean esPermitidoEnAvion() {
        return true;
    }
}
