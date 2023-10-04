public class Ciudadano {
    String nombre;
    int cedula;
    Ciudad origen;
    

    public Ciudadano(String nombre,int cedula,Ciudad origen){
        this.nombre = nombre;
        this.cedula = cedula;
        this.origen = origen;
        

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public Ciudad getOrigen() {
        return origen;
    }
    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

}
