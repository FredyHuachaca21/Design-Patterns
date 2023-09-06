package com.fredgar.pe.poo.herencia;

public class Herencia {
  public static void main(String[] args) {
    Empleado empleado = new Empleado();
    empleado.setNombre("Fredy");
    empleado.setEdad(30);
    empleado.setSalario(1000);
    System.out.println("Nombre: " + empleado.getNombre());
    System.out.println("Edad: " + empleado.getEdad());
    System.out.println("Salario: " + empleado.getSalario());
  }
}
