package com.QuantaSoftSP.app.Dao;

import com.QuantaSoftSP.app.Entity.PerfilesUsuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.QuantaSoftSP.app.Entity.Usuario;

import java.util.List;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
    @Query("from PerfilesUsuario ")
    public List<PerfilesUsuario> findAllPerfilesUsuarios();
}
