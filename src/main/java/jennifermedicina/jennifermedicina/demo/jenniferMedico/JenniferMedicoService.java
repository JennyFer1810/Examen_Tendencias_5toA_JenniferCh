package jennifermedicina.jennifermedicina.demo.jenniferMedico;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JenniferMedicoService {
    @Autowired
    private JenniferMedicoRepository medicoRepository;

    //Metodo create
    public JenniferMedico jennifersave(JenniferMedico entity)
    {
        return medicoRepository.save(entity);
    }
    
    //Metodo select by Id
    public JenniferMedico jenniferfindById(Long id){
        return medicoRepository.findById(id).orElse(null);
    }

    //Metodo delete by Id
    public void jenniferdeleteById(Long id){
        medicoRepository.deleteById(id);
    }

    //Metodo select all
    public List<JenniferMedico> jenniferfindAll(){
        return medicoRepository.findAll();
    }    
}
