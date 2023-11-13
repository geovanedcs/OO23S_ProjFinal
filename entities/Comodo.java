import java.util.List;

protected class Comodo {
    
    Long id;
    List<Sensor> sensores;
    String nomeComodo;

    public Comodo(String nome_comodo) {
        this.nomeComodo = nome_comodo;
    }

    public Long getId() {
        return id;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void addSensor(Sensor sensor) {
        this.sensores.add(sensor);
    }

    public String getNomeComodo() {
        return nomeComodo;
    }

    public void setNomeComodo(String nomeComodo) {
        this.nomeComodo = nomeComodo;
    }

}