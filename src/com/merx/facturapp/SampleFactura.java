package com.merx.facturapp;

import com.merx.facturapp.model.Cliente;
import com.merx.facturapp.model.Factura;
import com.merx.facturapp.model.ItemFactura;
import com.merx.facturapp.model.Producto;

import java.util.Scanner;

public class SampleFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRut("88888888-8");
        cliente.setNombre("Ingenieros S.A.");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String descripcion = s.nextLine();
        Factura factura = new Factura(descripcion, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i=0; i<5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            nombre = s.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura.generarDetalle());
    }
}
