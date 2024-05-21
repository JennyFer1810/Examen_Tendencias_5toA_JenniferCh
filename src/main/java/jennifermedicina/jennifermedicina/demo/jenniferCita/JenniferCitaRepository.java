package jennifermedicina.jennifermedicina.demo.jenniferCita;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface JenniferCitaRepository extends CrudRepository <JenniferCita, Long>{
    List<JenniferCita> findAll();

    //metodo borrar por el nombre
    JenniferCita findByDescripcion(String descripcion);  // Añadir este método
    void deleteByDescripcion(String descripcion);    
} 