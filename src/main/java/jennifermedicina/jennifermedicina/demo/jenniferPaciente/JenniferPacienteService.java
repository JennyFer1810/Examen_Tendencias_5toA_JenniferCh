package jennifermedicina.jennifermedicina.demo.jenniferPaciente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JenniferPacienteService {
    @Autowired
    private JenniferPacienteRepository pacienteRepository;

    //Metodo create
    public JenniferPaciente jennifersave(JenniferPaciente entity)
    {
        return pacienteRepository.save(entity);
    }
    
    //Metodo select by Id
    public JenniferPaciente jenniferfindById(Long id){
        return pacienteRepository.findById(id).orElse(null);
    }

    //Metodo delete by Id
    public void jenniferdeleteById(Long id){
        pacienteRepository.deleteById(id);
    }

    //Metodo select all
    public List<JenniferPaciente> jenniferfindAll(){
        return pacienteRepository.findAll();
    }   
}
