/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.cs;

/**
 *
 * @author josed
 */
public class CatalogoMaquinas {
    String descripción;
    String características; 
     Boolean estado;

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getCaracterísticas() {
        return características;
    }

    public void setCaracterísticas(String características) {
        this.características = características;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public CatalogoMaquinas(String descripción, String características, Boolean estado) {
        this.descripción = descripción;
        this.características = características;
        this.estado = estado;
    }
   
    
}
