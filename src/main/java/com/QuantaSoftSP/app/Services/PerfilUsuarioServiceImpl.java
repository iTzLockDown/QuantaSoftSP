package com.QuantaSoftSP.app.Services;

import com.QuantaSoftSP.app.Dao.IPerfilUsuarioDao;
import com.QuantaSoftSP.app.Entity.PerfilesUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PerfilUsuarioServiceImpl implements IPerfilUsuarioService {
    @Autowired
    private IPerfilUsuarioDao perfilUsuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<PerfilesUsuario> findAll() {
        return (List<PerfilesUsuario>) perfilUsuarioDao.findAll();
    }
    @Override
    public PerfilesUsuario findById(Long id) {
        return perfilUsuarioDao.findById(id).orElse(null);
    }
    @Override
    public PerfilesUsuario save(PerfilesUsuario deporte) {
        return perfilUsuarioDao.save(deporte);
    }
    @Override
    public void delete(Long id) {
        perfilUsuarioDao.deleteById(id);
    }
}
