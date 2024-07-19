package kh.inventarios.servicio;

import java.util.List;

import kh.inventarios.modelo.Producto;

public interface IProductoServicio {
    
    public List<Producto> listarProductos();
    public Producto buscaProductoPorId (Integer idProducto);
    public Producto guardarProducto(Producto producto);//insertar o actualizar
    public void eliminarProductoPorId(Integer idProducto);


}
