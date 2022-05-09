package app;

import app.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) { //creamos las instancias de las clases a implementar
        InputForm username = new InputForm ("username");
        InputForm password = new InputForm ("clave", "password");
        InputForm email = new InputForm ("email", "email");
        InputForm edad = new  InputForm ("edad", "number");
        TextareaForm experiencia = new TextareaForm ("exp", 5,9);


        SelectForm lenguaje = new SelectForm ("Lenguaje"); //asignamos campos a la Lista
        Opcion java = new Opcion ("1", "Java");
        lenguaje.addOpcion(new Opcion("1", "Java"));
        lenguaje.addOpcion(new Opcion("2", "Python"));
        lenguaje.addOpcion(new Opcion("3", "JavaScript"));
        lenguaje.addOpcion(new Opcion("4", "TypeScript"));
        lenguaje.addOpcion(new Opcion("5", "PHP"));



        username.setValor ("Pedro Bonnin"); //asignamos valores a los campos
        password.setValor("123456.");
        email.setValor("bonninpedro1@gmail.com");
        edad.setValor("20");
        experiencia.setValor("...mas de 2 años");


        java.setSelected (true);

        List<ElementoForm> elementos = new ArrayList<>(); //variable de tipo Lista
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);



        for (ElementoForm e: elementos){//imprimimos por consola
            System.out.println(e.renderizarHtml());
            System.out.println("<hr>");
        }
    }
}
