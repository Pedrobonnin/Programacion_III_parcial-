package app.modelo;


public class TextareaForm extends ElementoForm{

     private int filas;
     private int columnas;


     public TextareaForm(String nombre, int filas, int columnas) {
          super(nombre);
          this.filas = filas;
          this.columnas = columnas;
     }



     @Override
     public String renderizarHtml() {
          return "<textarea name='"
                  + this.nombre + "' cols='"
                  + this.columnas + "' rows='"
                  + this.filas + "'>"
                  + this.valor +
                  "</textarea>";
     }
}
