package jennifermedicina.jennifermedicina.demo.jenniferMedico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class JenniferMedicoController {
    @Autowired
    private JenniferMedicoService medicoService;

    //Api create
    @PostMapping(value = "medico")
    public JenniferMedico jennifersave(@RequestBody JenniferMedico entity)
    {
        return medicoService.jennifersave(entity);
    }

    //Api find by Id
    @GetMapping(value = "medico/{id}")
    public JenniferMedico jenniferfindById(@PathVariable ("id") Long id){
    return medicoService.jenniferfindById(id);
    }

    //Api update
    @PutMapping(value = "medico")
    public JenniferMedico jenniferupdate(@RequestBody JenniferMedico entity){
        return medicoService.jennifersave(entity);
    }

    // Api delete
    @DeleteMapping(value = "medico/{id}")
    public void jenniferdelete(@PathVariable("id") Long id) {
        medicoService.jenniferdeleteById(id);
    }

    //Api select All
    @GetMapping(value = "medico")
    public List<JenniferMedico> jenniferfindAll(){
      return medicoService.jenniferfindAll();
    }
}
