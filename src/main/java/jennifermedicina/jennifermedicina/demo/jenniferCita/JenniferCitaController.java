package jennifermedicina.jennifermedicina.demo.jenniferCita;

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
@RequestMapping("/api/consulta")
public class JenniferCitaController {
    @Autowired
    private JenniferCitaService citaService;

    // API create
    @PostMapping("/cita")
    public JenniferCita jennifersave(@RequestBody JenniferCita entity) {
        return citaService.jennifersave(entity);
    }

    // API find by Id
    @GetMapping("/cita/{id}")
    public JenniferCita jenniferfindById(@PathVariable Long id) {
        return citaService.jennifergetById(id);
    }

    // API update
    @PutMapping("/cita")
    public JenniferCita jenniferupdate(@RequestBody JenniferCita entity) {
        return citaService.jennifersave(entity);
    }

    // API delete
    @DeleteMapping("/cita/{id}")
    public void jenniferdelete(@PathVariable("id") Long id) {
        citaService.jenniferdeleteById(id);
    }

    // API select All
    @GetMapping("/cita")
    public List<JenniferCita> jenniferfindAll() {
        return citaService.jenniferfindAll();
    }

    // API find by Descripcion
    @GetMapping("/cita/descripcion/{descripcion}")
    public JenniferCita jenniferfindByDescripcion(@PathVariable String descripcion) {
        return citaService.jennifergetByDescripcion(descripcion);
    }

    // API delete by Descripcion
    @DeleteMapping("/cita/descripcion/{descripcion}")
    public void jenniferdeleteByDescripcion(@PathVariable String descripcion) {
        citaService.jenniferdeleteByDescripcion(descripcion);
    }
}