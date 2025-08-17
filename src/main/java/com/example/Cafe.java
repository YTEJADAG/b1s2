package com.example;

public class Cafe {

    private String nombre;
    private String region;
    private double precioPorKilo;
    private double cantidadEnKilos;

    public Cafe (String nombre, String region, double precioPorKilo, double cantidadEnKilos){
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;

    }

    public void setNombre (String nombre){
        this.nombre = nombre;

    }

    public void setRegion (String region){
        this.region = region;

    }

    public void setPrecioPorKilo (double precioPorKilo){
    this.precioPorKilo = precioPorKilo;

    }

    public void setCantidadEnKilos (double cantidadEnKilos){
    this.cantidadEnKilos = cantidadEnKilos;

    }

     public String getNombre (){
        return this.nombre;   

    }

      public String getRegion (){
        return this.region;   

    }

     public double getPrecioPorKilo (){
        return this.precioPorKilo;   

    }

     public double getCantidadEnKilos (){
        return this.cantidadEnKilos;   

    }

public void mostrarInformacion (){
    System.out.println("Información completa del cafe");
    System.out.println("nombre :" + this.nombre);
    System.out.println("Region :" + this.region);
    System.out.println("Precio por kilo :" + this.precioPorKilo);
    System.out.println("Cantidad en kilos :" + this. cantidadEnKilos);
}

public double calcularPrecioTotal(){
    return this.precioPorKilo * this.cantidadEnKilos;
 
}

public void actualizarCantidad(double nuevaCantidad) {
    
        if (nuevaCantidad >= 0) {
            this.cantidadEnKilos = nuevaCantidad;
            System.out.println("Cantidad actualizada a: " + nuevaCantidad + " unidades.");
        } else {
            System.out.println("La cantidad no puede ser negativa. La cantidad actual sigue siendo: " + this.cantidadEnKilos);
        }
    }


}

