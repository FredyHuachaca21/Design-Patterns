package com.fredgar.pe.poo.polimorfismo;

public class Polimorfismo {

  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.mostrar();

    Empleado empleado = new Empleado();
    empleado.mostrar();

    Persona persona2 = new Empleado();
    persona2.mostrar();
  }
}
