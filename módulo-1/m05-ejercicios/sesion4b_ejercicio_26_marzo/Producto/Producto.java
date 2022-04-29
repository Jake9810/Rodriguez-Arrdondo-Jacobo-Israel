/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author MSI
 */
public class Producto {
    private String nombre;
    private int id;
    private float precio;
    private int existencias;
    
    public Producto(String nom, int id, float prec, int exist)
    {
        this.nombre=nom;
        this.id=id;
        this.precio=prec;
        this.existencias=exist;
    }
    public Producto(String nom)
    {
        
    }
    
    public int MenosProducto(Producto prod, int cantidad)
    {
        if(this.existencias<=0)
        {
            System.out.printf("sin existencias\n");
            return 0;
        }
        else
        {
            this.existencias-=cantidad;
            return cantidad;
        }
    }
    /*public Prodcuto AgregarP()
    {
    }*/
}
