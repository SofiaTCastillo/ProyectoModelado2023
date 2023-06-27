package com.Modelado.DAO;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.Modelado.modelo.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
@Transactional
public class UsuarioDaoimp implements UsuarioDao {
	
@PersistenceContext
private EntityManager entityManager;

    @Override
	public List<Usuario> obtenerUsuarios() {
		// TODO Auto-generated method stub
		String query="from Usuario";
		
		return entityManager.createQuery(query).getResultList();	
		
		
		
	}

}
