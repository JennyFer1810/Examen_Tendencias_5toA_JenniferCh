package jennifermedicina.jennifermedicina.demo.jenniferCita;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jennifermedicina.jennifermedicina.demo.jenniferMedico.JenniferMedico;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class JenniferCita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private LocalDate fecha; 
    private boolean confirmada; 
    private String descripcion; 
    private int telefono;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private JenniferMedico medico;
}
