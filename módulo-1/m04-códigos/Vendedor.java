/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vendedor;

/**
 *
 * @author MSI
 */
import Cliente.Cliente;
import Producto.Producto;
import Venta.Venta;
import java.util.*;
public class Vendedor {
    private String nombre;
    private int id;
    private List<Venta> ventas=new ArrayList<Venta>();
    private List<Cliente> clientes=new ArrayList<Cliente>();
}
