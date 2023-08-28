import java.util.HashMap;
import java.util.Map;

public class Asignacion {
    private final String PASSWORD = "H073L2023";
    public Habitacion[] estandar = new Habitacion[3];
    public Habitacion[] delux = new Habitacion[3];
    public Habitacion[] suit = new Habitacion[3];
    Map<String, Cliente> clientes = new HashMap<String, Cliente>();

    public void asignarHabitacion(String cui) {
        
    }

    public void asignarCliente(String cui, String nombreCompleto, int visitas) {
        Cliente cliente = new Cliente(cui, nombreCompleto, visitas);
        clientes.put(cui, cliente);
    }
}
