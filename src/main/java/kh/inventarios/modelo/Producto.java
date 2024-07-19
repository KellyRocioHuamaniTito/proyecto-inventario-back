package kh.inventarios.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // con esto se crea las tablas de manera automatica en la base de datos
@Data //Getter and setter
@NoArgsConstructor //para q se agregue un constrcutor vacio a la clase
@AllArgsConstructor // agregamos un constructor con todos los elementos
@ToString
public class Producto {
    @Id//llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)//tipo autoincrementable
    Integer idProducto;
    String descripcion;
    Double precio;
    Integer existencia;
}
