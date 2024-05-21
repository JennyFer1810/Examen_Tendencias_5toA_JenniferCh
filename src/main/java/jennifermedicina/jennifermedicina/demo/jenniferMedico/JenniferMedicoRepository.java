package jennifermedicina.jennifermedicina.demo.jenniferMedico;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface JenniferMedicoRepository extends CrudRepository <JenniferMedico, Long>{

    List<JenniferMedico> findAll();
}
