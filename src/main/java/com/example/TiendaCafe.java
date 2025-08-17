package com.example;

public class TiendaCafe {
    public static void main(String[] args) {

        System.out.println("¡Bienvenido a nuestra Tienda de Café Colombiano!");

        Cafe CafedeNariño = new Cafe ("Supremo" , "Nariño" , 5000, 30);
        Cafe CafedeAntioquia = new Cafe ("Excelso" , "Antioquia" , 8000, 50);
        Cafe CafedeQuindio = new Cafe ("Premium" , "Quindio" , 10000, 25);

         CafedeNariño.mostrarInformacion();
         System.out.println();

         CafedeAntioquia.mostrarInformacion();
         System.out.println();

         CafedeQuindio.mostrarInformacion();
         System.out.println();

         double precioTotalCafedeNariño = CafedeNariño.calcularPrecioTotal();
         System.out.println("Precio total del :" + CafedeNariño.getNombre() + " es: $" + precioTotalCafedeNariño);

         double precioTotalCafedeAntioquia  = CafedeAntioquia .calcularPrecioTotal();
         System.out.println("Precio total del :" + CafedeAntioquia .getNombre() + " es: $" + precioTotalCafedeAntioquia);

         double precioTotalCafedeQuindio  = CafedeQuindio .calcularPrecioTotal();
         System.out.println("Precio total del :" + CafedeAntioquia .getNombre() + " es: $" + precioTotalCafedeQuindio);

         System.out.println("Información actualizada " + CafedeNariño.getNombre() + ":");
         CafedeNariño.mostrarInformacion();

       



    }


       
    }


