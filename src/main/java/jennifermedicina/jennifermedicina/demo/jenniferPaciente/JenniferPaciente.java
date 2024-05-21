package jennifermedicina.jennifermedicina.demo.jenniferPaciente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jennifermedicina.jennifermedicina.demo.jenniferMedico.JenniferMedico;
import lombok.Data;

@Entity
@Data
public class JenniferPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private int celular;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private JenniferMedico medico;
}
