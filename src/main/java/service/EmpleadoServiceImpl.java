package service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.Empleado;
import repositorie.EmpleadoRepositorio;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepositorio repositorio;
    @Override
    public List<Empleado> listarTodoslosEmpleados(){
        return repositorio.findAll();
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado){
        return repositorio.save(empleado);
    }

    @Override
    public Empleado obtenerEmpleadoPorId(Long id){
        return repositorio.findById(id).get();
    }

    @Override
    public Empleado actualizaEmpleado(Empleado empleado){
        return repositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Long id){
        repositorio.deleteById(id);
    }
    
}
