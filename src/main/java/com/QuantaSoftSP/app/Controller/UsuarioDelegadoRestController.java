package com.QuantaSoftSP.app.Controller;

import java.util.List;

import com.QuantaSoftSP.app.Entity.PerfilesUsuario;
import com.QuantaSoftSP.app.Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.QuantaSoftSP.app.Entity.UsuarioDelegado;
import com.QuantaSoftSP.app.Services.IUsuarioDelegadoService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioDelegadoRestController {
	@Autowired
	private IUsuarioDelegadoService usuarioDelegadoService;
	
	@GetMapping("/usuarioDelegados")
	public List<UsuarioDelegado> index()
	{
		return usuarioDelegadoService.findAll();
	}
	@GetMapping("/usuarioDelegados/{id}")
	public UsuarioDelegado show(@PathVariable Long id)
	{
		return usuarioDelegadoService.findById(id);
	}
	
	@PostMapping("/usuarioDelegados")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioDelegado create(@RequestBody UsuarioDelegado usuarioDelegado)
	{
		return usuarioDelegadoService.save(usuarioDelegado);
	}
	
	@PutMapping("/usuarioDelegados/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioDelegado update(@RequestBody UsuarioDelegado usuarioDelegado, @PathVariable Long id)
	{
		UsuarioDelegado usuarioDelegadoActual = usuarioDelegadoService.findById(id);
		
		usuarioDelegadoActual.setPais(usuarioDelegado.getPais());
		usuarioDelegadoActual.setDeporte(usuarioDelegado.getDeporte());
		usuarioDelegadoActual.setCargo(usuarioDelegado.getCargo());
		usuarioDelegadoActual.setEstActivo(usuarioDelegado.getEstActivo());
		usuarioDelegadoActual.setId(usuarioDelegado.getId());
		return usuarioDelegadoService.save(usuarioDelegadoActual);
	}
	
	@DeleteMapping("/usuarioDelegados/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id)
	{
		usuarioDelegadoService.delete(id);
	}


	/*@GetMapping("/usuarios/perfiles")
	public List<Usuario> listarUsuario()
	{
		return usuarioDelegadoService.findAllUser();
	}*/


}
