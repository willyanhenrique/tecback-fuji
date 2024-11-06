package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.model.dto.GeneroDTO;
import br.com.fujideia.iesp.tecback.model.dto.UsuarioDTO;
import br.com.fujideia.iesp.tecback.repository.UsuarioRepository;
import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Entity
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {

        return null;
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id)
                .map(this::convertToDTO);
    }

    public List<Usuario> listarTodos() {
        // Implementar lógica de listagem de todos os usuários
        return null;
    }

    public void deletar(Long id) {
        // Implementar lógica de deleção
    }
    private UsuarioDTO convertToDTO(Usuario usuario) {
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }
    private Usuario convertToEntity (UsuarioDTO usuarioDTO) {
                Usuario usuario = new Usuario();
                usuario.setId(usuarioDTO.getId());
                usuario.setNome(usuario.getNome());
                usuario.setEmail(usuario.getEmail());
                return usuario;

        }
}

