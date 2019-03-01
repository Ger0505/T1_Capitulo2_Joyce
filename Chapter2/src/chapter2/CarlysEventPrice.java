package chapter2;

/**
 *
 * @author Gerardo A A
 */
public class CarlysEventPrice {
    
    final static int PRECIO_X_INVITADO = 35;
    
    public CarlysEventPrice(Integer invitados ) {
        System.out.println("Lo nuestro es la Pary Loca!");
        System.out.println("No. de invitados: "+invitados);
        System.out.println("Costo por invitado:   $"+PRECIO_X_INVITADO);
        System.out.println("Precio Total: $"+(invitados*PRECIO_X_INVITADO));
        System.out.println("Evento Grande: "+(invitados>=50 ? true:false));
    }
    
}
