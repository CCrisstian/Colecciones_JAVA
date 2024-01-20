package org.CCristian.Ejemplos.Modelos;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

/*---------ATRIBUTOS---------*/
    private String nombre;
    private Integer nota;
/*---------ATRIBUTOS---------*/

/*---------GETTER-SETTER---------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
/*---------GETTER-SETTER---------*/

/*---------CONSTRUCTOR---------*/
    public Alumno() {
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
/*---------CONSTRUCTOR---------*/

/*---------MÉTODOS---------*/
    @Override
    public String toString() {
        return "Nombre: '"+nombre+"'\t"+
                "Nota: "+nota+"\n";
    }

    @Override
    public int compareTo(Alumno a) {
//        if (this.nombre == null){
//            return 0;
//        }
//        return this.nombre.compareTo(a.nombre);

//        if (this.nota.equals(a.nota)){
//            return 0;
//        }
//        if (this.nota > a.nota){
//            return 1;
//        } else {
//            return -1;
//        }

        if (this.nota == null){
            return 0;
        }
        return this.nota.compareTo(a.nota);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; /*Compara por INSTANCIA*/
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o; /*Compara por ATRIBUTOS*/
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
/*---------MÉTODOS---------*/

}
