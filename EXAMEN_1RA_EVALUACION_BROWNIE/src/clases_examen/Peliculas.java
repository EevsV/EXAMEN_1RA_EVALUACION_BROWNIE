/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabian b
 */

/*La clase Pelicula tiene tres atributos privados: título, estudio y rating.
El constructor de la clase recibe como parámetros el título, estudio y rating de la película
y los asigna a los atributos correspondientes.
La clase tiene métodos "get" y "set" para cada uno de los atributos.
El método "imprimirDatos" simplemente imprime en consola todos los datos de la película.
El método "evaluarEdad" recibe como parámetro la edad de la persona que quiere ver la película y compara esa edad
con el rating de la película. Si la edad es mayor o igual al rating, muestra el mensaje "Puedes ver la película",
de lo contrario muestra el mensaje "No puedes ver la película".*/
public class Peliculas {
     private String titulo;
    private String estudio;
    private int rating;

    public Peliculas(String titulo, String estudio, int rating) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.rating = rating;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void imprimirDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Estudio: " + estudio);
        System.out.println("Rating: " + rating);
    }

    public void evaluarEdad(int edad) {
        if (edad >= rating) {
            System.out.println("Puedes ver la película");
        } else {
            System.out.println("No puedes ver la película");
        }
    }
}