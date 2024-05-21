package jennifermedicina.jennifermedicina.demo.jenniferMedico;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jennifermedicina.jennifermedicina.demo.jenniferConsultorio.JenniferConsultorio;
import lombok.Data;
import jakarta.persistence.Entity;

@Entity
@Data
public class JenniferMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "consultorio_id")
    private JenniferConsultorio consultorio;
}
