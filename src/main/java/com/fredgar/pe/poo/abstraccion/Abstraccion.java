package com.fredgar.pe.poo.abstraccion;

public class Abstraccion {
  public static void main(String[] args) {
    Vehiculo auto = new Auto();
    auto.mover();
    Vehiculo bicicleta = new Bicicleta();
    bicicleta.mover();
  }
}
