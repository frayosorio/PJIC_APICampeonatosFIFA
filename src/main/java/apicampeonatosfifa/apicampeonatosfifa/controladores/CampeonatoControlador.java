package apicampeonatosfifa.apicampeonatosfifa.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Grupo;
import apicampeonatosfifa.apicampeonatosfifa.interfaces.ICampeonatoServicio;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatoControlador {
    
    private ICampeonatoServicio servicio;

    public CampeonatoControlador(ICampeonatoServicio servicio) {
        this.servicio = servicio;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Campeonato> listar() {
        return servicio.listar();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/grupos/{id}", method = RequestMethod.GET)
    public List<Grupo> listarGrupos(@PathVariable long id) {
        return servicio.listarGrupos(id);
    }

}
