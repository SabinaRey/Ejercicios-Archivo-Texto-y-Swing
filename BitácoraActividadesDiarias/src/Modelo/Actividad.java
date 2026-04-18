
package Modelo;
public class Actividad {
    private String fecha;
    private String actividad;
    private String descripcion;
    
    public Actividad(String fecha, String actividad, String descripcion){
        this.fecha = fecha;
        this.actividad = actividad;
        this.descripcion = descripcion;
    }
    public Actividad(){
        this("", "", "");
    }

    public String getFecha() {
        return fecha;
    }
    public String getActividad() {
        return actividad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     @Override
    public String toString(){
        return this.getFecha() + "," +
                this.getActividad() + "," +
                this.getDescripcion();
    }
}
