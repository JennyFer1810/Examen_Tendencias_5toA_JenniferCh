package jennifermedicina.jennifermedicina.demo.jenniferConsultorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface JenniferConsultorioRepository extends CrudRepository <JenniferConsultorio, Long>{
    List<JenniferConsultorio> findAll();
    
} 
