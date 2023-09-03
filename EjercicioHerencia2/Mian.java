package EjercicioHerencia2;

public class Mian {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Seiya", 15, "Guerrero");
        Enemigo enemigo1 = new Enemigo("Draco", 14, "Esqueleto");
        Jugador jugador2 = new Jugador("Potter", 18, "Mago");
        Enemigo enemigo2 = new Enemigo("Bad", 19, "Orco");

        jugador1.atacar();
        jugador1.usarHabilidad();

        enemigo1.atacar();
        enemigo1.gritar();

        jugador2.atacar();
        jugador2.usarHabilidad();

        enemigo2.atacar();
        enemigo2.gritar();
    }
}
