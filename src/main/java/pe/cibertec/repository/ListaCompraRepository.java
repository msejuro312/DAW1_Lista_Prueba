package pe.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.entities.ListaCompra;

import java.util.List;

public interface ListaCompraRepository extends JpaRepository<ListaCompra, Long> {
    List<ListaCompra> findByUsuarioId(Long idUsuario);

}
