public class Habitacion {
    public String tipo = "";
    public Boolean ocupada = false;
    
    public Habitacion(String tipo, Boolean ocupada){
        this.tipo = tipo;
        this.ocupada = ocupada;
    }

    public Boolean getOcupada(){
        return ocupada;
    }
}
