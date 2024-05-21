package jennifermedicina.jennifermedicina.demo.jenniferConsultorio;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JenniferConsultorioService {
    @Autowired
    private JenniferConsultorioRepository consultorioRepository;

    //Metodo create
    public JenniferConsultorio jennifersave(JenniferConsultorio entity)
    {
        return consultorioRepository.save(entity);
    }
    
    //Metodo select by Id
    public JenniferConsultorio jennifergetById(Long id){
        return consultorioRepository.findById(id).orElse(null);
    }

    //Metodo delete by Id
    public void jenniferdeleteById(Long id){
        consultorioRepository.deleteById(id);
    }

    //Metodo select all
    public List<JenniferConsultorio> jenniferfindAll(){
        return consultorioRepository.findAll();
    }    
}
