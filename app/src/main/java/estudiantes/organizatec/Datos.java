package estudiantes.organizatec;

public class Datos {
    private String Detalles;
    private String Fecha;
    private String Hora;
    private Integer Prioridad;

    public Datos(String Detalles, String Fecha, String Hora, Integer Prioridad) {
        this.Detalles= Detalles;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Prioridad= Prioridad;
    }

    public String getHora() {
        return Hora;
    }

    public String getDetalles() {
        return Detalles;
    }
    public String getFecha() {
        return Fecha;
    }

    public Integer getPrioridad(){
        return Prioridad;
    }
}
