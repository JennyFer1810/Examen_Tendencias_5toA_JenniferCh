package jennifermedicina.jennifermedicina.demo.jenniferPaciente;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface JenniferPacienteRepository extends CrudRepository <JenniferPaciente, Long>{
    List<JenniferPaciente> findAll();
    
} 