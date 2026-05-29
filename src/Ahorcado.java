import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        System.out.println("Juego de Ahorcado");
        String palabra_a_adivinar = "inteligencia";
        char[] letrasAdivinadas = new char[palabra_a_adivinar.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
        Scanner scanner = new Scanner(System.in);

        //debemos empezar el while
        boolean palabraEncontrada = false;
        int intentos = 0;
        int intentosMaximo = 10;

        while (!palabraEncontrada && intentos < intentosMaximo){
            System.out.println("Palabra a adivinar "+String.valueOf(letrasAdivinadas)+ " ("+ palabra_a_adivinar.length()+")");
            System.out.println("Ingresa una letra: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraEncontrada = false;
            for (int i = 0; i < letrasAdivinadas.length; i++) {
                if (palabra_a_adivinar.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraEncontrada = true;
                    
                }
            }
            if (letraEncontrada == false){
                intentos++;
                System.out.println("Incorrecto. Perdiste un intento. Te quedan "+(intentosMaximo - intentos)+" intentos");
            }else{
                System.out.println("Si, la letra "+letra+" es correcta");
                    System.out.println("Sigues con "+(intentosMaximo-intentos)+" intentos\n");
            }
        
            if (String.valueOf(letrasAdivinadas).equals(palabra_a_adivinar)){
                System.out.println("Muy bien!! ");
                System.out.println("Has ganado. Adivinaste la palabra -> "+String.valueOf(letrasAdivinadas));
                palabraEncontrada = true;
            }
            
        }
        if (intentos == intentosMaximo){
            System.out.println("Lo siento. Has perdido");
        }

        scanner.close();
    }
}
