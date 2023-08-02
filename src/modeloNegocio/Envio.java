package modeloNegocio;

import logica.InterfazEnvio;

public abstract class Envio implements InterfazEnvio {

  public abstract int precioEnvio();
  public abstract String tiempoEnvio();
  public abstract boolean esPermitidoEnAvion();

}