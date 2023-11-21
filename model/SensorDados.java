import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SensorDados")
public class SensorDados extends Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private String tipo;

    @Column
    private boolean status;

    @Column
    private String valor;

    @Column
    private Date dataLeitura;

    public SensorDados(Sensor sensor, String tipo, boolean status, String valor, Date dataLeitura) {
        super(sensor.getNome(), sensor.getDataCriacao());
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