package EjercicioHerencia2;

public class Personaje {
    protected String nombrePersonaje;
    protected int nivel;

    public Personaje(String nombrePersonaje, int nivel) {
        this.nombrePersonaje = nombrePersonaje;
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(nombrePersonaje + " !atacando¡");
    }
}

    class Jugador extends Personaje {
        private String clase;

        public Jugador(String nombrePersonaje, int nivel, String clase) {
            super(nombrePersonaje, nivel);
            this.clase = clase;
        }

        public  void usarHabilidad(){
            System.out.println(nombrePersonaje + " esta usando su hablidad especial como " + clase +", nivel "+ nivel);
        }
    }

    class Enemigo extends Personaje {
        private String tipo;

        public Enemigo(String nombrePersonaje, int nivel, String tipo) {
            super(nombrePersonaje, nivel);
            this.tipo = tipo;
        }
        public void gritar(){
            System.out.println(nombrePersonaje + ", tipo "+ tipo  + ", esta gritando " + ", nivel " + nivel);
        }
    }
