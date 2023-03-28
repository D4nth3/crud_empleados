package service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.Departamento;
import repositorie.DepartamentoRepositorio;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoRepositorio repositorio;
    @Override
    public List<Departamento> listarTodosLosDepartamentos(){
        return repositorio.findAll();
    }

    @Override
    public Departamento guardarDepartamento(Departamento departamento){
        return repositorio.save(departamento);
    }

    @Override
    public Departamento obtenerDepartamentoPorId(Long id){
        return repositorio.findById(id).get();
    }

    @Override
    public Departamento actualizaDepartamento(Departamento departamento){
        return repositorio.save(departamento);
    }

    @Override
    public void eliminarDepartamento(Long id){
        repositorio.deleteById(id);
    }

    
}
