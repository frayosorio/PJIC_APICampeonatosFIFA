package apicampeonatosfifa.apicampeonatosfifa.interfaces;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Grupo;

public interface ICampeonatoServicio {
    
    public List<Campeonato> listar();

    public List<Grupo> listarGrupos(long id);

}
