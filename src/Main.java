import org.smosquera.poo.*;

public class Main {
    public static void main(String[] args) {
        Producto [] productos = new Producto[8];

        productos[0] = new Fruta("Chontaduro", 5000d, 2500d,"Naranja" );
        productos[1] = new Fruta("Manzana", 500.00, 300d,"Roja");

        productos[2] = new Limpieza("Lavaloza", 2290d, "Quix",1.2 );
        productos[3] = new Limpieza("Desinfectante Lavanda", 1330d, "Lysol", 0.9);

        productos[4] = new Lacteo("Leche sabor chocolate", 1000d, 32,1990);
        productos[5] = new Lacteo("Yogurt", 1000d, 48, 185);


        productos[6] = new NoPerecible("Atun Lomitos", 960.00, 178,96);
        productos[7] = new NoPerecible("Portos hallado bolsa", 1000d, 3536, 1990);

        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getName() +
                               "\nPrecio: " + producto.getPrice());


            if (producto instanceof Fruta ) {
                System.out.println("Peso(gr)" + ((Fruta) producto).getWeight());
                System.out.println("Color: " + ((Fruta) producto).getColor());
            } else if (producto instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) producto).getComponents());
                System.out.println("Litos: " + ((Limpieza) producto).getLiters());
            } else if (producto instanceof  Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) producto).getAmount());
                System.out.println("Proteinas: " + ((Lacteo) producto).getProteins());
            } else if (producto instanceof  NoPerecible) {
                System.out.println("Calorias (kaCal): " + ((NoPerecible) producto).getCalories());
                System.out.println("Contenido: " + ((NoPerecible) producto).getContent());
            }
        }
    }
}