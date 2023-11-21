import java.util.Date;

public class SensorModel {

    Sensor sensor;
    String tipo;
    String valor;
    Date dataLeitura;

    public SensorModel(Sensor sensor, String tipo, String valor, Date dataLeitura) {
        this.sensor = sensor;
        this.tipo = tipo;
        this.valor = valor;
        this.dataLeitura = dataLeitura;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}