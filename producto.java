/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Laboratorio #3
Eliazar Canastuj
carnet: 23384
*/


public class producto{
    protected int id;
    protected String nombre;
    protected int cant_disponible;
    protected int cant_vendidos;
    protected String estado;
    protected float precio;


    public producto(int id, String nombre, int cant_disponible, int cant_vendidos, String estado, float precio){
        this.id = id;
        this.nombre = nombre;
        this.cant_disponible = cant_disponible;
        this.cant_vendidos = cant_vendidos;
        this.estado = estado;
        this.precio = precio;
    }

    //get 
    public String getNombre(){
        return this.nombre;
    }

    public int getID(){
        return this.id;
    }

    public int getDisponible(){
        return this.cant_disponible;
    }

    public int getVendidos(){
        return this.cant_vendidos;
    }

    public String getEstado(){
        return this.estado;
    }

    public float getPrecio(){
        return this.precio;
    }


    public String toString() {
        return "Nombre:"+this.nombre +" ID:"+this.id;
    }
    
}