package ControllerModelado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;//
import com.Modelado.DAO.UsuarioDao;
import com.Modelado.modelo.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;

	
	/*@RequestMapping(value="mensaje")
	public String mensaje() {
			
		return "mensaje";
					
	}
	@RequestMapping(value="persona")
	public List<String>listarPersonas() {
		
		return List.of("Sofia","Lourdes","Nicolas");
	}
	
	@RequestMapping(value="Usuario")
	public Usuario listarUsuarios() {
		
		Usuario usuario=new Usuario();
		usuario.setNombre("Sofia");
		usuario.setApellido("Castillo");
		usuario.setEmail("sofiatrinidadcastillo@gmail.com");
		usuario.setCelular("2615170...");
		usuario.setPassword("1234");
		
		return usuario;
	}
	
	@RequestMapping(value="usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Sofia");
		usuario.setApellido("Castillo");
		usuario.setEmail("sofiatrinidadcastillo@gmail.com");
		usuario.setCelular("2615170...");
		usuario.setPassword("1234");
		
		return usuario;
	}*/
	
	@RequestMapping(value="usuario/lista_user")
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Sofia");
		usuario1.setApellido("Castillo");
		usuario1.setEmail("sofiatrinidadcastillo@gmail.com");
		usuario1.setCelular("2615170...");
		usuario1.setPassword("1234");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Lourdes");
		usuario2.setApellido("Castillo");
		usuario2.setEmail("lulu1234@gmail.com");
		usuario2.setCelular("261340...");
		usuario2.setPassword("5678");
		
		Usuario usuario3=new Usuario();
		usuario3.setId(5L);
		usuario3.setNombre("Nicolas");
		usuario3.setApellido("Castro");
		usuario3.setEmail("nicolas2023@gmail.com");
		usuario3.setCelular("2618765...");
		usuario3.setPassword("91011");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		return usuarios;
	}
	
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario() {
		
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		
		return user;
	}

	}

