
package Modelo;

public class Asistencia {
    private String nombre;
    private String fecha;
    private String estado;
    
    public Asistencia(String nombre, String fecha, String estado){
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }
    public Asistencia(){
        this("", "", "");
    }
    public String getNombre() {
        return nombre;
    }
    public String getFecha() {
        return fecha;
    }
    public String getEstado() {
        return estado;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    } 
    @Override
    public String toString(){
        return this.getNombre() + "," +
               this.getFecha()+ ","+
                this.getEstado();
    }  
}
