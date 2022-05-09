package app.modelo;
import java.util.ArrayList;
import java.util.List;



public class SelectForm extends ElementoForm{
    private List<Opcion> opciones;
    public SelectForm(String nombre){
        super(nombre);
        this.opciones = new ArrayList<Opcion>(); // se inicializa con array List
    }


    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }
    @Override
    public String renderizarHtml(){
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");
        for(Opcion opcion: this.opciones){
            sb.append("\n<option value = '")
                    .append (opcion.getValor())
                    .append ("'");
            if(opcion.isSelected()){
                sb.append("selected");
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}