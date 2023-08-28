public class Cliente{
    public String cui = "";
    public String nombreCOmpleto = "";
    public int visitas = 0;

    public void setCui(String cui) {
        this.cui = cui;
    }

    public void setNombreCOmpleto(String nombreCOmpleto) {
        this.nombreCOmpleto = nombreCOmpleto;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public Cliente(String cui, String nombreCompleto, int visitas){
        this.cui = cui;
        this.nombreCOmpleto = nombreCompleto;
        this.visitas = visitas;
    }

    
}