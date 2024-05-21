package jennifermedicina.jennifermedicina.demo.jenniferCita;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JenniferCitaService {
    @Autowired
    private JenniferCitaRepository citaRepository;

    //Metodo create
    public JenniferCita jennifersave(JenniferCita entity)
    {
        return citaRepository.save(entity);
    }
    
    //Metodo select by Id
    public JenniferCita jennifergetById(Long id){
        return citaRepository.findById(id).orElse(null);
    }

    //Metodo delete by Id
    public void jenniferdeleteById(Long id){
        citaRepository.deleteById(id);
    }

    //Metodo select all
    public List<JenniferCita> jenniferfindAll(){
        return citaRepository.findAll();
    }    

    // Método find by Descripcion
    public JenniferCita jennifergetByDescripcion(String descripcion) {
        return citaRepository.findByDescripcion(descripcion);
    }

    // Método delete by Descripcion
    public void jenniferdeleteByDescripcion(String descripcion) {
        citaRepository.deleteByDescripcion(descripcion);
    }
}
