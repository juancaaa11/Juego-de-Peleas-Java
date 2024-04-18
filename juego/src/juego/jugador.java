package juego;

class jugador {
	
    private String nombre;
    private int salud;
    
    public jugador(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getSalud() {
        return salud;
    }
    
    
    
    public void atacar(jugador oponente) {
        // Simular un ataque simple restando salud al oponente
        int dano = (int) (Math.random() * 20) + 1; // Daño aleatorio entre 1 y 20
        oponente.salud -= dano;
        System.out.println("¡" + nombre + " ha infligido " + dano + " puntos de daño!");
        System.out.println(oponente.getNombre() + " tiene " + oponente.getSalud() + " puntos de salud restantes.");
    }
    
    public void defenderse(jugador atacante) {
        // Simular una defensa que reduce el daño recibido
        int dano = (int) (Math.random() * 10) + 1; // Daño aleatorio entre 1 y 10
        salud -= dano;
        System.out.println("¡" + nombre + " se ha defendido y ha recibido " + dano + " puntos de daño!");
        System.out.println("Ahora " + nombre + " tiene " + salud + " puntos de salud restantes.");
    }
    
    
    
}
