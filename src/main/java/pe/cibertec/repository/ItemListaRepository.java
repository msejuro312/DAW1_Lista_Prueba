package pe.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.entities.ItemLista;

public interface ItemListaRepository extends JpaRepository<ItemLista, Long> {
}
