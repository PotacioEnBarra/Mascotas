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
    private String dueño;

    @Column
    private String tipoAnimal;

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
     * @return String return the dueño
     */
    public String getDueño() {
        return dueño;
    }
   
    /**
     * @return String return the tipoAnimal
     */
    public String getTipoAnimal() {
        return tipoAnimal;
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
     * @param dueño the dueño to set
     */
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    /**
     * @param tipoAnimal the tipoAnimal to set
     */
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
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

}