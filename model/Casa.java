protected class Casa{

    Long id;
    List<Comodo> comodos;
    String nomeCasa;

    public Casa(String nomeCasa) {
        this.nomeCasa = nomeCasa;
    }

    public Long getId() {
        return id;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }

    public void addComodo(Comodo comodo) {
        this.comodos.add(comodo);
    }

    public String getNomeCasa() {
        return nomeCasa;
    }

    public void setNomeCasa(String nomeCasa) {
        this.nomeCasa = nomeCasa;
    }
}