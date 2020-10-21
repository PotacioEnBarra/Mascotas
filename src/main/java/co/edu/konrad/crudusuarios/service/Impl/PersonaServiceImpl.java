package co.edu.konrad.crudusuarios.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import co.edu.konrad.crudusuarios.model.Persona;
import co.edu.konrad.crudusuarios.repository.PersonaRepository;
import co.edu.konrad.crudusuarios.CrudusuariosApplication;
import co.edu.konrad.crudusuarios.commons.GenericServiceIMP;
import co.edu.konrad.crudusuarios.service.API.PersonaServiceAPI;
import co.edu.konrad.crudusuarios.service.Impl.PersonaServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceIMP<Persona, Long> implements PersonaServiceAPI{
    @Autowired
    private PersonaRepository personaDaoAPI;

    @Override
    public CrudRepository<Persona, Long> getDao(){
        return personaDaoAPI;
    }
}
