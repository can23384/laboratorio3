/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #5
Eliazar Canastuj
carnet: 23384
*/

public class bebidas extends producto{
    private float mililitros;
    private String tipo;


    public bebidas(int id, String nombre, int cant_disponible, int cant_vendidos, String estado, float precios, float mililitros, String tipo){
        super(id, nombre, cant_disponible, cant_vendidos, estado, precios);
        this.mililitros = mililitros;
        this.tipo = tipo;
    }

//GETTERS
    public float getMililitros(){
        return this.mililitros;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String toString() {
        return "Nombre:"+this.nombre +" ID:"+this.id+"      ml:"+this.mililitros+"      tipo:"+this.tipo;
    }


}