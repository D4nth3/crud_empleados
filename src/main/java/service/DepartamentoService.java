package service;

import java.util.List;
import entity.Departamento;

public interface DepartamentoService {

    public List<Departamento> listarTodosLosDepartamentos();
    public Departamento guardarDepartamento(Departamento departamento);
    public Departamento obtenerDepartamentoPorId(Long id);
    public Departamento actualizaDepartamento(Departamento departamento);
    public void eliminarDepartamento(Long id);
    
}
