package kh.inventarios.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kh.inventarios.modelo.Producto;
import kh.inventarios.servicio.ProductoServicio;

@RestController
//http://localhost:8080/inventario-app
@RequestMapping("inventario-app")
@CrossOrigin(value="http://localhost:4200")//direccion de donde vamosa recibir peticiones y con esto damos permisos
public class ProductoControlador {
    
    //
    private static final Logger logger = 
        LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired //inyeccion de dependencia
    ProductoServicio  productoServicio;

    //localhost:8080/inventario-app/productos
    @GetMapping("/productos")
    public List<Producto> listarProductos(){
        List<Producto> productos =this.productoServicio.listarProductos();
        logger.info("Productos obtenidos");
        productos.forEach((producto->logger.info(producto.toString())));
        return productos;
    }


    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto){
        logger.info("Producto a agregar: "+ producto);
        return this.productoServicio.guardarProducto(producto);
    }

    

    

    
}
