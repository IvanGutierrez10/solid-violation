package logica;

public class LogicaNegocio {

    public static void imprimirTiempoDeEnvio(InterfazEnvio[] envios) {
        for (InterfazEnvio envio : envios) {
            System.out.println(envio.tiempoEnvio());
        }
    }
    public void cargarMercancia() {
        //Cargando mercancia
    }
    public void rastrearPaquete() {
        //rastreando paquete
    }

    public boolean permitidoEnAvion(InterfazEnvio envio) {
        int precioPermitido = 100;

        if (envio.esPermitidoEnAvion()) {
            if (precioPermitido > envio.precioEnvio()) {
                return true;
            } else {
                return false;
            }
        }
        throw new IllegalArgumentException("no es posible cargar en avion un envio que no sea internacional");
    }
}

