package pe.cibertec.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.entities.Usuario;
import pe.cibertec.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping ("/api/usuarios")

//Constructor para inicializar repository
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //Función para registrar un nuevo usuario
    @PostMapping ("/registrar")
    public ResponseEntity<Usuario> registrar(Usuario usuario){
        Usuario usuarioRegistrado = usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuarioRegistrado);
    }

    //FUnción para mostrar todos los usuarios registrados
    @GetMapping
    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }
}
