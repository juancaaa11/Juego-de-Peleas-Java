package juego;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * 
 * @author: juancaaa11
 * @version: 1.0
 * 
 * 
 */


public class main {
	
	
	public static void darBienvenida() {
	    
	    String mensaje = "¡Bienvenido a mi juego!" + " @author: juancaaa11";
	
	    for (int i = 0; i < mensaje.length(); i++) {
	        System.out.print(mensaje.charAt(i));
	        
	        try {
	            TimeUnit.MILLISECONDS.sleep(100); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    System.out.println();
	    System.out.println("Espero que te diviertas jugando.");
	}
	
	
	 public static void ejecutarAccion(jugador atacante, jugador defensor, String accion) {
	        switch (accion.toLowerCase()) {
	            case "atacar":
	                atacante.atacar(defensor);
	                break;
	            case "defenderse":
	                defensor.defenderse(atacante);
	                break;
	            default:
	                System.out.println("Acción no válida. Se realizará un ataque por defecto.");
	                atacante.atacar(defensor);
	                break;
	
	        }
	      }

		
		public static void main(String[] args) {
			
			darBienvenida();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("¡Bienvenido al juego de peleas!");
	        
	        
	        ArrayList<jugador> jugadores = new ArrayList<>();
	        
	       
	        for (int i = 1; i <= 2; i++) {
	            System.out.print("Ingresa el nombre del jugador " + i + ": ");
	            String nombre = scanner.nextLine();
	            jugadores.add(new jugador(nombre, 100)); // Se asume que todos comienzan con 100 de salud 
	        }
	        
	        System.out.println("Comienza la pelea entre " + jugadores.get(0).getNombre() + " y " + jugadores.get(1).getNombre() + "!");
	        
	        // Iniciar la pelea con el comprobador
	        while (jugadores.get(0).getSalud() > 0 && jugadores.get(1).getSalud() > 0) {
	        	
	        	
	            // Turno del jugador 1
	            System.out.println(jugadores.get(0).getNombre() + ", ¿qué deseas hacer? (atacar/defenderse)");
	            String accionJugador1 = scanner.nextLine();
	            ejecutarAccion(jugadores.get(0), jugadores.get(1), accionJugador1);
	            if (jugadores.get(1).getSalud() <= 0) {
	                System.out.println(jugadores.get(0).getNombre() + " ha ganado la pelea!");
	                break;
	            }
	            
	            // Turno del jugador 2
	            System.out.println(jugadores.get(1).getNombre() + ", ¿qué deseas hacer? (atacar/defenderse)");
	            String accionJugador2 = scanner.nextLine();
	            ejecutarAccion(jugadores.get(1), jugadores.get(0), accionJugador2);
	            if (jugadores.get(0).getSalud() <= 0) {
	                System.out.println(jugadores.get(1).getNombre() + " ha ganado la pelea!");
	                break;
	            }
	        }
	        
	        scanner.close();
        
		
		
		

	}

}


