package jennifermedicina.jennifermedicina.demo.jenniferPaciente;

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
@RequestMapping("/api/task")

public class JenniferPacienteController {
    @Autowired
    private JenniferPacienteService pacienteService;

    //Api create
    @PostMapping(value = "paciente")
    public JenniferPaciente save(@RequestBody JenniferPaciente entity)
    {
        return pacienteService.jennifersave(entity);
    }

    //Api find by Id
    @GetMapping(value = "paciente/{id}")
    public JenniferPaciente jenniferfindById(@PathVariable ("id") Long id){
    return pacienteService.jenniferfindById(id);
    }

    //Api update
    @PutMapping(value = "paciente")
    public JenniferPaciente jenniferupdate(@RequestBody JenniferPaciente entity){
        return pacienteService.jennifersave(entity);
    }

    //Api delete
    @DeleteMapping(value = "paciente/{id}")
    public void jenniferdelete(@PathVariable ("id") Long id){
        pacienteService.jenniferdeleteById(id);
    }

    //Api select All
    @GetMapping(value = "paciente")
    public List<JenniferPaciente> jenniferfindAll(){
      return pacienteService.jenniferfindAll();
    }
}
