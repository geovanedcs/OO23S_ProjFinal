public class SensorDados extends Sensor {

    private String tipo;
    private boolean status;
    private String valor;
    private Date dataLeitura;

    public SensorDados(Sensor sensor, String tipo, boolean status, String valor, Date dataLeitura) {
        super(sensor.getNome());
        this.tipo = tipo;
        this.status = status;
        this.valor = valor;
        this.dataLeitura = dataLeitura;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getStatus() {
        return status;
    }

    public String getValor() {
        return valor;
    }

    public Date getDataLeitura() {
        return dataLeitura;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }
}