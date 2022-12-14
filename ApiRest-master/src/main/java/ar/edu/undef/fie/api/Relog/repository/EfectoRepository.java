package ar.edu.undef.fie.api.Relog.repository;

import ar.edu.undef.fie.api.Relog.model.entity.Efecto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EfectoRepository extends JpaRepository<Efecto,Long> {
    Efecto findByEfectoId(Long efectoId);

    List<Efecto> findByOrganizacionId(Long organizacion_id);
}
