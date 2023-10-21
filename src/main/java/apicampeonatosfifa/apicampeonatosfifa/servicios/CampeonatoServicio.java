package apicampeonatosfifa.apicampeonatosfifa.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Grupo;
import apicampeonatosfifa.apicampeonatosfifa.interfaces.ICampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.repositorios.CampeonatoRepositorio;

@Service
public class CampeonatoServicio implements ICampeonatoServicio {
    
   private CampeonatoRepositorio repositorio;

    public CampeonatoServicio(CampeonatoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Campeonato> listar() {
        return repositorio.findAll();
    }

    @Override
    public List<Grupo> listarGrupos(long id) {
        // Buscar campeonato por su ID
        var campeonatoBuscado = repositorio.findById(id);

        if (campeonatoBuscado.isPresent()) {
            var campeonato = campeonatoBuscado.get();

            return campeonato.getGrupos();
        }
        return null;
    }
}
