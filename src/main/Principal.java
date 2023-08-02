package main;

import logica.InterfazEnvio;
import modeloNegocio.Internacional;
import modeloNegocio.Municipal;
import logica.LogicaNegocio;

public class Principal {

  public static void main(String[] args) {
    LogicaNegocio logicaNegocio = new LogicaNegocio();
    InterfazEnvio[] envios = {
        new Internacional(),
        new Municipal(),
    };
    logicaNegocio.imprimirTiempoDeEnvio(envios);
  }

}
