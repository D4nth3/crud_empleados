package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departamentos")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;
    @Column(name = "presupuesto",nullable = false,length = 50)
    private double presupuesto;
    @Column(name = "gastos",nullable = false,length = 50)
    private double gastos;
    
    public Departamento() {
    }

    public Departamento(Long id, String nombre, double presupuesto, double gastos) {
        this.id = id;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.gastos = gastos;
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
    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    public double getGastos() {
        return gastos;
    }
    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

}
