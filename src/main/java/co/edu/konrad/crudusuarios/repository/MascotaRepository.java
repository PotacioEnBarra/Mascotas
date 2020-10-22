package co.edu.konrad.crudusuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.konrad.crudusuarios.model.Mascota;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota,Long>{

}