package com.QuantaSoftSP.app.Services;

import java.util.List;

import com.QuantaSoftSP.app.Entity.PerfilesUsuario;
import com.QuantaSoftSP.app.Entity.Usuario;

public interface IUsuarioService {
	public List<Usuario> findAll();
	public Usuario findById(Long id);
	public Usuario save(Usuario usuario);
	public void delete(Long id);
	public List<PerfilesUsuario> findAllPerfilesUsuarios();
}
