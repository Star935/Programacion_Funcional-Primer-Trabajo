package BiConsumer;

import java.util.function.BiConsumer;

public class MainDeportes {
    public static void main(String[] args) {
        Deportes deportes=new Deportes("Baloncesto","x",10);

        Categoria categoria=new Categoria("Normal");

        BiConsumer<Deportes,Categoria> biConsumer=(depo, cate)->depo.setCategoría(cate.getCategoría_deporte());
        biConsumer.accept(deportes,categoria);

        System.out.println("Nombre: "+deportes.getNombre());
        System.out.println("Cantidad de Jugadores: "+ deportes.getCantidad_jugadores());
        System.out.println("Categoría: " + deportes.getCategoría());
    }
}
