package pe.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
