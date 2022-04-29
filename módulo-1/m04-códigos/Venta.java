/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venta;
import Cliente.Cliente;
import Producto.Producto;
import Pago.Pago;
import Vendedor.Vendedor;
import java.util.*;

public class Venta {
    private int id;
    private Cliente cliente;
    private List<Producto> productos=new ArrayList<Producto>();
    private Vendedor vendedor;
    
    public Venta(int id, Cliente cliente, Producto producto, Vendedor vendedor)
    {
        this.id=id;
        this.cliente=cliente;
        this.productos.add(producto);
        this.vendedor=vendedor;
    }
}
