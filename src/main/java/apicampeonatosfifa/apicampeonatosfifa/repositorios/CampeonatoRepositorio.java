package apicampeonatosfifa.apicampeonatosfifa.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;

@Repository
public interface CampeonatoRepositorio extends JpaRepository<Campeonato, Long> {
    
}
