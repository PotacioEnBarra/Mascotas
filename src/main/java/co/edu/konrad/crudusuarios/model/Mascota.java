package co.edu.konrad.crudusuarios.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Mascota{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private long id;

    @Column
    private String nombre;

    @Column
    private String propietario;

    @Column
    private String tipo_animal;

    @Column
    private String raza;

    @Column
    private int edad;

    @Column
    private String direccion;

    @Column
    private String telefono;


    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }
    
    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }
   
   
    /**
     * @return String return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @return int return the edad
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * @return String return the direccion
     */
    public String getDireccion() {
        return direccion;
    }
    
    /**
     * @return String return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    /**
     * @return String return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * @return String return the tipo_animal
     */
    public String getTipo_animal() {
        return tipo_animal;
    }

    /**
     * @param tipo_animal the tipo_animal to set
     */
    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

}