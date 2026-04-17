import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Artista coldplay = new Artista("Coldplay");
        Album albumAburrido = new Album("A Rush of Blood to the Head", coldplay, 2002);

        //  "The Scientist" recién se lanza (tiene popularidad normal)
        Cancion theScientist = new Cancion("The Scientist", albumAburrido);
        System.out.println("--===-- Caso 1: Recién lanzada (Normal) --===--");
        System.out.println(theScientist.detalleCompleto());


        //• "The Scientist" está en auge por superar el mínimo de reproducciones esperadas
        System.out.println("\n--===-- Caso 2: En Auge (supera 1000 reproducciones) --===--");
        theScientist.setReproducciones(1000); //cambio rapido para pruebas NO ES HARDCODEAR
        theScientist.reproducir(); // reproduccion 1001 → pasa a EnAuge
        System.out.println(theScientist.detalleCompleto());

        // • "The Scientist" baja del auge por tener muchos dislikes
        System.out.println("\n--===-- Caso 3: Vuelve a Normal (5000 dislikes) --===--");
        theScientist.setDislikes(5000);
        theScientist.reproducir(); // chequea → vuelve a Normal
        System.out.println(theScientist.detalleCompleto());

        //  "The Scientist" es tendencia por récord de reproducciones y cantidad de personas que
        //le gusta el tema
        System.out.println("\n--===-- Caso 4: Tendencia (50000+ reproducciones y 20000+ likes) --===--");
        theScientist.setDislikes(0);
        theScientist.cambiarPopularidad(new EnAuge());
        theScientist.setReproducciones(50000);
        theScientist.setLikes(20001);
        theScientist.reproducir(); // reproduccion 50001 → pasa a Tendencia
        System.out.println(theScientist.detalleCompleto());

        // "The Scientist" era tendencia, per vuelve a ser normal por no ser escuchada en las
        //últimas horas
        System.out.println("\n--===-- Caso 5: Vuelve a Normal (no reproducida en 24hs) --===--");
        theScientist.setUltimaReproduccion(LocalDateTime.now().minusHours(25));
        theScientist.reproducir(); // chequea → vuelve a Normal
        System.out.println(theScientist.detalleCompleto());
    }
}

