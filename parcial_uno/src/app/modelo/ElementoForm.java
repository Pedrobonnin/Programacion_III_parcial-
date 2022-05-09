package app.modelo;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    public String valor;
    public String nombre;
    public List validadores;
    public List error;


    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.error = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }



    public List<String> getErrores() {
        return error;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    abstract public String renderizarHtml();
}
