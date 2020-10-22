package co.edu.konrad.crudusuarios.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import co.edu.konrad.crudusuarios.model.Mascota;
import co.edu.konrad.crudusuarios.repository.MascotaRepository;
import co.edu.konrad.crudusuarios.CrudusuariosApplication;
import co.edu.konrad.crudusuarios.commons.GenericServiceIMP;
import co.edu.konrad.crudusuarios.service.API.MascotaServiceApi;
import co.edu.konrad.crudusuarios.service.Impl.MascotaServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MascotaServiceImpl extends GenericServiceIMP<Mascota, Long> implements MascotaServiceApi{
    @Autowired
    private MascotaRepository MascotaDaoAPI;

    @Override
    public CrudRepository<Mascota, Long> getDao(){
        return MascotaDaoAPI;
    }
}
