package co.edu.ims.AppCompraventa;

import co.edu.ims.compraventa.Categoria;
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
        
        Producto escoba = new Producto(1, "Escoba", 20000, categorias);
        Gson gson = new Gson();
        String json = gson.toJson(escoba);
        System.out.println("Datos producto"+json);
        
        
        
        
        
    }
    
}
