package co.edu.konrad.crudusuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.konrad.crudusuarios.model.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    
}

