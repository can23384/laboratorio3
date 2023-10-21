/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #5
Eliazar Canastuj
carnet: 23384
*/

public class fruta extends producto{
    private String type;


    public fruta(int id, String nombre, int cant_disponible, int cant_vendidos, String estado, float precios, String type){
        super(id, nombre, cant_disponible, cant_vendidos, estado, precios);
        this.type = type;
    }

//GETTERS
    public String getType(){
        return this.type;
    }

    public double Comision() {
        double comision = 0.20 * this.precio;
        return comision;
    }


    public String toString() {
        return "Nombre:"+this.nombre +" ID:"+this.id+"      tipo:"+this.type;
    }


}