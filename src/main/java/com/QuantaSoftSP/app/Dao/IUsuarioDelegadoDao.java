package com.QuantaSoftSP.app.Dao;

import com.QuantaSoftSP.app.Entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.QuantaSoftSP.app.Entity.UsuarioDelegado;

import java.util.List;

public interface IUsuarioDelegadoDao extends CrudRepository<UsuarioDelegado, Long>{
/*    @Query("from Usuario ")
    public List<Usuario> findAllUser();*/
}
