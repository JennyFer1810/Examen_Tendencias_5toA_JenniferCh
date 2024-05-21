package jennifermedicina.jennifermedicina.demo.jenniferConsultorio;

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
@RequestMapping("/api/oficina")
public class JenniferConsultorioController {
    @Autowired
    private JenniferConsultorioService consultorioService;

    //Api create
    @PostMapping(value = "consultorio")
    public JenniferConsultorio jennifersave(@RequestBody JenniferConsultorio entity)
    {
        return consultorioService.jennifersave(entity);
    }

    //Api find by Id
    @GetMapping(value = "consultorio/{id}")
    public JenniferConsultorio jenniferfindById(@PathVariable Long id){
    return consultorioService.jennifergetById(id);
    }

    //Api update
    @PutMapping(value = "consultorio")
    public JenniferConsultorio jenniferupdate(@RequestBody JenniferConsultorio entity){
        return consultorioService.jennifersave(entity);
    }

    //Api delete
    @DeleteMapping(value = "consultorio/{id}")
    public void jenniferdelete(@PathVariable Long id){
        consultorioService.jenniferdeleteById(id);
    }

    //Api select All
    @GetMapping(value = "consultorio")
    public List<JenniferConsultorio> jenniferfindAll(){
      return consultorioService.jenniferfindAll();
    }

}
