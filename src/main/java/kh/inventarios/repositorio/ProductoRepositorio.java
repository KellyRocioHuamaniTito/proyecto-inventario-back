package kh.inventarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import kh.inventarios.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
    
}
