package service;

import java.util.List;
import entity.Empleado;

public interface EmpleadoService {

    public List<Empleado> listarTodoslosEmpleados();
    public Empleado guardarEmpleado(Empleado empleado);
    public Empleado obtenerEmpleadoPorId(Long id);
    public Empleado actualizaEmpleado(Empleado empleado);
    public void eliminarEmpleado(Long id);
    
}
