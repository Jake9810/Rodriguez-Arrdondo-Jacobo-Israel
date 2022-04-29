/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.*;
import Pago.Pago;
import Producto.Producto;
import java.util.Scanner;
public class Cliente {
    private String Nombre;
    private int id;
    //private String cuenta;
    private Pago MetPago;
    private List<Producto> Productos;
    
    
    public Cliente(String nom, int id)
    {
        this.Nombre=nom;
        this.id=id;        
    }
    
    public Cliente setCliente()
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Ingrese el nombre del cliente: ");
        String nom=sc.nextLine();
        System.out.printf("Ingrese el nombre del cliente: ");
        Random rn=new Random();
        int ran=rn.nextInt(50);
        Cliente client=new Cliente(nom,ran);
        return client;
    }
    public void setMetPa(Cliente client)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("ingrese su metodo de pago: ");
        String met=sc.nextLine();
        client.MetPago.setPago(met);
    }
    public void addProd(Cliente client)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("agrege el producto: ");
        String opc=sc.nextLine();
        Producto prod =new Producto(opc);
        //client.Productos.
    }
}
