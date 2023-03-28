package repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{ 
    
}
