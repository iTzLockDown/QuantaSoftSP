package com.QuantaSoftSP.app.Services;

import java.util.List;

import com.QuantaSoftSP.app.Entity.UsuarioDeportista;



public interface IUsuarioDeportistaService {
	public List<UsuarioDeportista> findAll();
	public UsuarioDeportista findById(Long id);
	public UsuarioDeportista save(UsuarioDeportista usuarioDeportista);
	public void delete(Long id);
}
