package repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Departamento;

public interface DepartamentoRepositorio extends JpaRepository <Departamento, Long>{
    
}
