/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #5
Eliazar Canastuj
carnet: 23384
*/

public class snack extends producto{
    private float gramos;
    private String sabor;
    private String tamano;


    public snack(int id, String nombre, int cant_disponible, int cant_vendidos, String estado, float precios, float gramos, String sabor, String tamano){
        super(id, nombre, cant_disponible, cant_vendidos, estado, precios);
        this.gramos = gramos;
        this.sabor = sabor;
        this.tamano = tamano;
    }

//GETTERS
    public float getGramos(){
        return this.gramos;
    }

    public String getSabor(){
        return this.sabor;
    }

    public String getTamano(){
        return this.tamano;
    }

    public String toString() {
        return "Nombre:"+this.nombre +" ID:"+this.id+"      gr:"+this.gramos+"      sabor:"+this.sabor+"        tamano:"+this.tamano;
    }


}