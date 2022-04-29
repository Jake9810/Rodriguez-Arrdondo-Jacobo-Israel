/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pago;
import java.util.*;
import Cliente.Cliente;

public class Pago {
    private List<String> metodo=new ArrayList();
    private Cliente cliente;
    private int id;
    
    
    public Pago(int id, String met, Cliente client)
    {
        this.cliente=client;
        this.metodo.add(met);
        this.id=id;
    }
    public void setPago(String met)
    {
        this.metodo.add(met);
    }
}
