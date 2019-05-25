package com.QuantaSoftSP.app.Services;

import com.QuantaSoftSP.app.Entity.PerfilesUsuario;

import java.util.List;

public interface IPerfilUsuarioService {
    public List<PerfilesUsuario> findAll();
    public PerfilesUsuario findById(Long id);
    public PerfilesUsuario save(PerfilesUsuario deporte);
    public void delete(Long id);
}
