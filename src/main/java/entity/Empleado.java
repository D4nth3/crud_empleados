package entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
@Table(name = "empelados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;
    @Column(name = "apellido",nullable = false,length = 50)
    private String apellido;
    @Column(name = "codigo departamento",nullable = false,length = 50)
    private String codigoDepartamento;
    
    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, String codigoDepartamento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDepartamento = codigoDepartamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }  
    
}
