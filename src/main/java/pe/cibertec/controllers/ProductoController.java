package pe.cibertec.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.entities.Producto;
import pe.cibertec.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController (ProductoService productoService){
        this.productoService = productoService;
    }

    @PostMapping("/lote")
    public ResponseEntity<String> registrarLote(@RequestBody List<Producto> productos){
        productoService.registrarLote(productos);
        return ResponseEntity.ok("Productos registrados satisfactoriamente.");
    }

}
