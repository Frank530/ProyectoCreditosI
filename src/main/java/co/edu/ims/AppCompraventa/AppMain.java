package co.edu.ims.AppCompraventa;

import co.edu.ims.compraventa.Categoria;
import co.edu.ims.compraventa.Cliente;
import co.edu.ims.compraventa.Detalle;
import co.edu.ims.compraventa.Producto;
import co.edu.ims.compraventa.Factura;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *t
 * @author Silvia
 */
public class AppMain {

    public static void main(String[] args) {
        Categoria aseo = new Categoria(1,"Aseo");
        List<Categoria> categorias=new ArrayList<>();
        categorias.add(aseo);
        
        Cliente nombre = new Cliente(1, "Cristian", "Cra 12 # 17-93", 123456789, "Popayan", "3123123123");
        List<Cliente> cliente = new ArrayList<>();
        cliente.add(nombre);
        
        Producto escoba = new Producto(1, "Escoba", 20000, categorias);
        List<Producto> producto = new ArrayList<>();
        producto.add(escoba);
        
        Factura num1 = new Factura(1,"FAC1","09/03/2017",cliente);
        List<Factura> factura = new ArrayList<>();
        factura.add(num1);
        
        Detalle nuevo = new Detalle(1, "10", factura, producto);
        List<Detalle> detalle = new ArrayList<>();
        detalle.add(nuevo);
        
        Gson gson = new Gson();
        String jscategotia = gson.toJson(aseo);
        System.out.println("Datos de la categoria:"+jscategotia);
         String jscliente = gson.toJson(cliente);
        System.out.println("Datos del Cliente:"+jscliente);
        String jsonproducto = gson.toJson(escoba);
        System.out.println("Datos producto"+jsonproducto);
        
        
    }
    
}
