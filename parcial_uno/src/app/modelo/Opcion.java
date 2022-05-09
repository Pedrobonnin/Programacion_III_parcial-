package app.modelo;

public class Opcion {

    private String valor;
    private String nombre;
    private boolean selected;



    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }


    public String getNombre() {
        return nombre;
    }


    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Opcion setSelected() {
        this.selected = true;
        return this;
    }
}

