package pe.cibertec.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import pe.cibertec.repository.ProductoRepository;

@Service
public class ProductoService {
    //el de mayúscula es la clase, la minúscula es la variable
    //final porque no se reasigna, solo se asigna una vez
    private final ProductoRepository productoRepository;

    @PersistenceContext
    private EntityManager em;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
}
