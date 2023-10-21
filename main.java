/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Laboratorio #3
Eliazar Canastuj
carnet: 23384
*/


import java.util.*;
import java.io.*;


public class main{

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        ArrayList<producto> productos = new ArrayList<producto>();
        //CARGAR ARCHIVO .CSV
        try{
            File archivo = new File("inventario.csv");
            Scanner scanner = new Scanner(archivo);

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] campos = linea.split(";");

                int id = Integer.parseInt(campos[0]);
                String nombre = campos[1];
                int disponible = Integer.parseInt(campos[2]);
                int vendidos = Integer.parseInt(campos[3]);
                String estados = campos[4];
                float precio = Float.parseFloat(campos[5]);
                String categoria = campos[6];

                float ml = Float.parseFloat(campos[7]);
                String tipo = campos[8];

                float gr = Float.parseFloat(campos[9]);
                String sabor = campos[10];
                String tamano = campos[11];

                String tipo_fruta = campos[12];

                if (categoria.equals("bebidas")) {
                        productos.add(new bebidas(id, nombre, disponible, vendidos, estados, precio, ml, tipo));
                    }
                else if (categoria.equals("snacks")){
                        productos.add(new snack(id, nombre, disponible, vendidos, estados, precio, gr, sabor, tamano));
                    }
                else if (categoria.equals("fruta")){
                        productos.add(new fruta(id, nombre, disponible, vendidos, estados, precio, tipo_fruta));
                    }else{
                        productos.add(new producto(id, nombre, disponible, vendidos, estados, precio));
                    }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
/////////////////////////////////////////////////
        boolean hola = true;
        while(hola){
            System.out.println("==============================");
            System.out.println("Elija una opcion: ");
            System.out.println("1. Buscar un producto por medio del id");
            System.out.println("2. Listar los productos de una categoría");
            System.out.println("3. Mostrar las ventas actuales de la tienda");
            System.out.println("4. salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            System.out.println("==============================");

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el ID del producto que busca: ");
                    int id_producto = teclado.nextInt();
                    teclado.nextLine();
                    for(producto producto : productos){
                        if(producto.getID() == id_producto){
                            System.out.println(producto);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ingrese la categoria: ");
                    String categoria_producto = teclado.nextLine();
                    System.out.println(categoria_producto);
                    for(producto producto : productos){
                        if(producto instanceof bebidas && categoria_producto.equals("bebidas")){
                            System.out.println("---------------------------------------------------------------");
                            System.out.println(producto);
                        }
                        else if(producto instanceof snack && categoria_producto.equals("snacks")){
                            System.out.println("---------------------------------------------------------------");
                            System.out.println(producto);
                        }
                        else if(producto instanceof fruta && categoria_producto.equals("fruta")){
                            System.out.println("---------------------------------------------------------------");
                            System.out.println(producto);
                        }
                    }
                    break;

                case 7:
                    System.out.println("I always come back");
                    break;
                case 3:
                    float ventas = 0 ;
                    float comision = 0;

                    for(producto producto : productos){
                        if(producto instanceof fruta){
                            fruta fruta = (fruta) producto;
                            comision+=fruta.Comision();
                            ventas+=fruta.getPrecio();
                        }else{
                            ventas+=producto.getPrecio();
                        }
                    }
                    System.out.println("Ventas totales: Q"+ventas);
                    System.out.println("Porcentaje por categoría X : Q"+comision);
                    break;

                case 4:
                    hola = false;
                    break;
                    

            }
        }


    
    }
}