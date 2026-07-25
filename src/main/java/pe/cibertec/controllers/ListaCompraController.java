package pe.cibertec.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.cibertec.entities.ListaCompra;
import pe.cibertec.entities.Usuario;
import pe.cibertec.repository.ItemListaRepository;
import pe.cibertec.repository.ListaCompraRepository;
import pe.cibertec.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/listas")
public class ListaCompraController {
    private final UsuarioRepository usuarioRepository;
    private final ListaCompraRepository listaCompraRepository;
    private final  ItemListaRepository itemListaRepository;

    public ListaCompraController(UsuarioRepository usuarioRepository, ListaCompraRepository listaCompraRepository, ItemListaRepository itemListaRepository) {
        this.usuarioRepository = usuarioRepository;
        this.listaCompraRepository = listaCompraRepository;
        this.itemListaRepository = itemListaRepository;
    }

    //lógica: busca el usuario y solo si existe crea la lista
    @PostMapping("/{idUsuario}/crear")
    public ResponseEntity<?> crear(@PathVariable Long idUsuario, @RequestBody ListaCompra listaCompra)
    {
        Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);
        if (usuario==null)
        {
            return ResponseEntity.badRequest().body("Usuario no encontrado");
        }
        listaCompra.setUsuario(usuario);
        return ResponseEntity.ok(listaCompraRepository.save(listaCompra));
    }
}
