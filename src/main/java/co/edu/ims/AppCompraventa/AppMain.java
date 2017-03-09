package co.edu.ims.AppCompraventa;

import co.edu.ims.compraventa.Categoria;
import co.edu.ims.compraventa.Cliente;
import co.edu.ims.compraventa.Producto;
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
        
        Gson gson = new Gson();
        String jscategotia = gson.toJson(aseo);
        System.out.println("Datos del Producto:"+jscategotia);
        String jsonproducto = gson.toJson(escoba);
        System.out.println("Datos producto"+jsonproducto);
        String jscliente = gson.toJson(cliente);
        System.out.println("Datos del Cliente:"+jscliente);
        
        
    }
    
}
