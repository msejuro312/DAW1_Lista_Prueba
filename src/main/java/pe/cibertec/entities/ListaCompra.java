package pe.cibertec.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "listas_compra")
public class ListaCompra {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private LocalDateTime fechaCreacion;
}
