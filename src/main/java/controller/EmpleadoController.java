package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import entity.Empleado;
import service.EmpleadoService;

@Controller
public class EmpleadoController {
  
    @Autowired
    private EmpleadoService servicio;

    @GetMapping({"/empleados", "/" })
    public String listarEmpleados(Model modelo){
        modelo.addAttribute("empleado", servicio.listarTodoslosEmpleados());
        return "empleados";
    }

    @GetMapping({"/empleados/nuevo"})
    public String mostrarFormularioRegistrarEmpleado(Model modelo){
        Empleado empleado = new Empleado();
        modelo.addAttribute("empleado", empleado);
        return "crear_empleado";
    }

    @PostMapping("/empleados")
    public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado){
        servicio.guardarEmpleado(empleado);
        return "redirect:/empleados";
    }

    @GetMapping("/empleados/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo){
        modelo.addAttribute("empleado", servicio.obtenerEmpleadoPorId(id));
        return "editar_empleado";
    }

    @PostMapping({"/empleados/{id}"})
    public String actualizarEmpleado(@PathVariable Long id, @ModelAttribute("empleado") Empleado empleado, Model modelo){
        Empleado empleadoExistente = servicio.obtenerEmpleadoPorId(id);
        empleadoExistente.setId(id);
        empleadoExistente.setNombre(empleado.getNombre());
        empleadoExistente.setApellido(empleado.getApellido());
        empleadoExistente.setCodigoDepartamento(empleado.getCodigoDepartamento());
        
        servicio.actualizaEmpleado(empleadoExistente);
        return "redirect:/empleados";
    }

    @GetMapping("/empleados/{id}")
    public String eliminarEmpleado(@PathVariable Long id){
        servicio.eliminarEmpleado(id);
        return "redirect:/empleados";
    }





    
}
