package pe.cibertec.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import pe.cibertec.entities.Producto;
import pe.cibertec.repository.ProductoRepository;

import java.util.List;

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

    //inserción por lotes (batching)
    public void registrarLote(List<Producto> productos){
        int i=0;
        for (Producto p: productos){
            em.persist(p);
            i++;
            if(i % 10==0){ //cada 10 inserciones
                em.flush();
                em.clear();
            }
        }
    }
}
