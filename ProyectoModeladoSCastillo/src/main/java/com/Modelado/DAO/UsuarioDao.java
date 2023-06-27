package com.Modelado.DAO;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.Modelado.modelo.Usuario;

@Transactional
public interface UsuarioDao {
	
List<Usuario> obtenerUsuarios();

}
