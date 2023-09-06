package com.fredgar.pe.poo.herencia;

public class Empleado extends Persona {
  private int salario;

  public int getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }

  public void trabajar() {
    System.out.println("El empleado " + getNombre() + " está trabajando");
  }

}
