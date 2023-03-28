package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import entity.Departamento;
import service.DepartamentoService;

@Controller
public class DepartamentoController {

    @Autowired
    private DepartamentoService servicio;

    @GetMapping({"/departamentos", "/"})
    public String listarDepartamentos(Model modelo){
        modelo.addAttribute("departamento", servicio.listarTodosLosDepartamentos());
        return "departamentos";
    }
    
    @GetMapping({"/departamentos/nuevo"})
    public String mostrarFormularioRegistrarDepartamento(Model modelo){
        Departamento departamento = new Departamento();
        modelo.addAttribute("departamento", departamento);
        return "crear_departamento";
    }

    @PostMapping("/departamentos")
    public String guardarDepartamento(@ModelAttribute("departamento") Departamento departamento){
        servicio.guardarDepartamento(departamento);
        return "redirect:/departamentos";
    }

    @GetMapping("/departamentos/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo){
        modelo.addAttribute("empleado", servicio.obtenerDepartamentoPorId(id));
        return "editar_departamento";
    }

    @PostMapping
    public String actualizarDepartamento(@PathVariable Long id, @ModelAttribute("departamento") Departamento departamento, Model modelo){
        Departamento departamentoExistente = servicio.obtenerDepartamentoPorId(id);
        departamentoExistente.setId(id);
        departamentoExistente.setNombre(departamento.getNombre());
        departamentoExistente.setGastos(departamento.getGastos());
        departamentoExistente.setPresupuesto(departamento.getPresupuesto());
        
        servicio.actualizaDepartamento(departamentoExistente);
        return "redirect:/departamentos";
    }
    
    @GetMapping("/departamentos/{id}")
    public String elimninarEmpleado(@PathVariable Long id){
        servicio.eliminarDepartamento(id);
        return "redirect:/departamentos";
    }



}
