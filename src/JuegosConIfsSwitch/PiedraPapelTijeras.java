package JuegosConIfsSwitch;

import java.util.Scanner;

public class PiedraPapelTijeras {

    /*
        Reglas basicas: Piedra < Papel
                        Papel < Tijeras
                        Tijeras < Piedra

        Limitaciones:
            - Solo se permite el uso de tipos que hemos visto (int, String, double....)
            - Solo se pueden usar ifs y switch

        Condiciones:
            - Gana el mejor de 5
            - El usuario tiene que elegir que quiere sacar de una lista de opciones
            - Si elige alguna opcion no valida, pierde esa ronda ( por ahora no comprobamos valores fuera de rango)
            - Se calcula si alguien gana o si hay empate
            - Se dice el resultado de la ronda
            - Cuando la maquina o el jugador han ganado 2 rondas o las rondas llegan a 3,
                se muestra un mensaje con el ganador.

        Ayuda:
            - El usuario elige que quiere sacar, pero la maquina es aleatoria.
            - Estamos limitados por tipos de datos vistos hasta ahora y por estructuras vistas hasta ahora,
                por tanto, la forma mas facil de hacer lo de la maquina es generando un numero aleatorio
                y de ahi, elegir la mano de la maquina.
            - Se va a refactorizar (rehacer) mas adelante, para simplificar un poco las cosas, pero en un
                primer momento, se puede hacer con texto para entender mejor el funcionamiento
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ronda = 1, victoriaJugador = 0, victoriaMaquina = 0;
        int jugadaJugador, jugadaMaquina;
        String manoJugador = "", manoMaquina = "";
        boolean descalificado = false;

        /*
         ****************************************************
         ** Mostramos resultado, ronda, y menu del jugador **
         ****************************************************
         */

        System.out.println(" ");
        System.out.println("Vamos a jugar ");
        System.out.println("Ronda nº: " + ronda);
        System.out.println("--------------------------");
        System.out.println("Jugador: " + victoriaJugador + " - Ordenador: " + victoriaMaquina);

        System.out.println("Elige de entre los siguientes:");
        System.out.println("\t En caso de no elegir una opcion de la lista, perderas la ronda automaticamente \uD83D\uDE43");
        System.out.println("\t1.- Piedra");
        System.out.println("\t2.- Papel");
        System.out.println("\t3.- Tijeras");

        jugadaJugador = sc.nextInt();

        /*
         *************************************************
         ** Comprobamos la mano elegida por el jugador  **
         ** si elige un valor incorrecto, golpe de remo **
         *************************************************
         */
        switch (jugadaJugador){
            case 1: manoJugador = "Piedra";
                break;
            case 2: manoJugador = "Papel";
                break;
            case 3: manoJugador = "Tijeras";
                break;
            default:
                System.out.println("Opcion no valida, pierdes la ronda");
                descalificado = true;
                victoriaMaquina++;
        }

        /*
         *************************************************
         ** Si no está descalificado, empezamos a jugar **
         **         si no, pasamos de ronda             **
         *************************************************
         */

        if (!descalificado && victoriaJugador < 2 && victoriaMaquina < 2 ) {

            /*
             **************************************************
             ** Sacamos un random entre 1 y 3, de ahi, se    **
             ** repite lo mismo que con el usuario y se saca **
             **     la mano que va a tener la maquina        **
             **************************************************
             */

            jugadaMaquina = (int) (Math.random() * 3 + 1);

            switch (jugadaMaquina) {
                case 1:
                    manoMaquina = "Piedra";
                    break;
                case 2:
                    manoMaquina = "Papel";
                    break;
                case 3:
                    manoMaquina = "Tijeras";
                    break;
            }

            /*
                 EMPIEZA EL JUEGO:
                    - Comprobamos 1 por 1 las manos de la maquina y del jugador, las comparamos
                        y decidimos quien ha ganado

                    - Si la maquina y el jugador sacan la misma mano, es empate, se pasa de ronda
                    - Si el jugador gana, se pasa de ronda y suma 1
                    - Si no, se hace lo mismo con la maquina.
                    - Importante restablecer que el jugador no esta descalificado
             */

            System.out.println(" Jugador elige: " + manoJugador + " y la maquina elige: " + manoMaquina);

            switch (jugadaJugador){
                case 1:
                    if ( jugadaMaquina == 1 ){
                        System.out.println("Empate");
                    }
                    else if ( jugadaMaquina == 2 ){
                        System.out.println("Gana maquina");
                        victoriaMaquina++;
                    }
                    else {
                        System.out.println("Gana jugador");
                        victoriaJugador++;
                    }
                    break;
                case 2:
                    if ( jugadaMaquina == 1 ){
                        System.out.println("Gana jugador");
                        victoriaJugador++;
                    }
                    else if ( jugadaMaquina == 2 ){
                        System.out.println("empate");
                    }
                    else {
                        System.out.println("Gana maquina");
                        victoriaMaquina++;
                    }
                    break;
                case 3:
                    if ( jugadaMaquina == 1 ){
                        System.out.println("Gana maquina");
                        victoriaMaquina++;
                    }
                    else if ( jugadaMaquina == 2 ){
                        System.out.println("gana jugador");
                        victoriaJugador++;
                    }
                    else {
                        System.out.println("empate");
                    }
                    break;
            }

        }

        ronda++;


        System.out.println(" ");
        System.out.println("Ronda nº: " + ronda);
        System.out.println("--------------------------");
        System.out.println("Jugador: " + victoriaJugador + " - Ordenador: " + victoriaMaquina);

        System.out.println("Elige de entre los siguientes:");
        System.out.println("\t En caso de no elegir una opcion de la lista, perderas la ronda automaticamente \uD83D\uDE43");
        System.out.println("\t1.- Piedra");
        System.out.println("\t2.- Papel");
        System.out.println("\t3.- Tijeras");

        jugadaJugador = sc.nextInt();

        /*
         *************************************************
         ** Comprobamos la mano elegida por el jugador  **
         ** si elige un valor incorrecto, golpe de remo **
         *************************************************
         */
        switch (jugadaJugador){
            case 1: manoJugador = "Piedra";
                break;
            case 2: manoJugador = "Papel";
                break;
            case 3: manoJugador = "Tijeras";
                break;
            default:
                System.out.println("Opcion no valida, pierdes la ronda");
                descalificado = true;
                victoriaMaquina++;
        }

        /*
         *************************************************
         ** Si no está descalificado, empezamos a jugar **
         **         si no, pasamos de ronda             **
         *************************************************
         */

        if (!descalificado && victoriaJugador < 2 && victoriaMaquina < 2){

            /*
             **************************************************
             ** Sacamos un random entre 1 y 3, de ahi, se    **
             ** repite lo mismo que con el usuario y se saca **
             **     la mano que va a tener la maquina        **
             **************************************************
             */

            jugadaMaquina = (int) (Math.random() * 3 + 1);

            switch (jugadaMaquina) {
                case 1:
                    manoMaquina = "Piedra";
                    break;
                case 2:
                    manoMaquina = "Papel";
                    break;
                case 3:
                    manoMaquina = "Tijeras";
                    break;
            }

            /*
                 EMPIEZA EL JUEGO:
                    - Comprobamos 1 por 1 las manos de la maquina y del jugador, las comparamos
                        y decidimos quien ha ganado

                    - Si la maquina y el jugador sacan la misma mano, es empate, se pasa de ronda
                    - Si el jugador gana, se pasa de ronda y suma 1
                    - Si no, se hace lo mismo con la maquina.
                    - Importante restablecer que el jugador no esta descalificado
             */

            System.out.println(" Jugador elige: " + manoJugador + " y la maquina elige: " + manoMaquina);

            switch (jugadaJugador){
                case 1:
                    if ( jugadaMaquina == 1 ){
                        System.out.println("Empate");
                    }
                    else if ( jugadaMaquina == 2 ){
                        System.out.println("Gana maquina");
                        victoriaMaquina++;
                    }
                    else {
                        System.out.println("Gana jugador");
                        victoriaJugador++;
                    }
                    break;
                case 2:
                    if ( jugadaMaquina == 1 ){
                        System.out.println("Gana jugador");
                        victoriaJugador++;
                    }
                    else if ( jugadaMaquina == 2 ){
                        System.out.println("empate");
                    }
                    else {
                        System.out.println("Gana maquina");
                        victoriaMaquina++;
                    }
                    break;
                case 3:
                    if ( jugadaMaquina == 1 ){
                        System.out.println("Gana maquina");
                        victoriaMaquina++;
                    }
                    else if ( jugadaMaquina == 2 ){
                        System.out.println("gana jugador");
                        victoriaJugador++;
                    }
                    else {
                        System.out.println("empate");
                    }
                    break;
            }

        }

        ronda++;

        System.out.println(" ");
        System.out.println("Ronda nº: " + ronda);
        System.out.println("--------------------------");
        System.out.println("Jugador: " + victoriaJugador + " - Ordenador: " + victoriaMaquina);

        System.out.println("Elige de entre los siguientes:");
        System.out.println("\t En caso de no elegir una opcion de la lista, perderas la ronda automaticamente \uD83D\uDE43");
        System.out.println("\t1.- Piedra");
        System.out.println("\t2.- Papel");
        System.out.println("\t3.- Tijeras");

        jugadaJugador = sc.nextInt();

        /*
         *************************************************
         ** Comprobamos la mano elegida por el jugador  **
         ** si elige un valor incorrecto, golpe de remo **
         *************************************************
         */
        switch (jugadaJugador){
            case 1: manoJugador = "Piedra";
                break;
            case 2: manoJugador = "Papel";
                break;
            case 3: manoJugador = "Tijeras";
                break;
            default:
                System.out.println("Opcion no valida, pierdes la ronda");
                descalificado = true;
                victoriaMaquina++;
        }

        /*
         *************************************************
         ** Si no está descalificado, empezamos a jugar **
         **         si no, pasamos de ronda             **
         *************************************************
         */

        if (!descalificado && victoriaJugador < 2 && victoriaMaquina < 2){

            /*
             **************************************************
             ** Sacamos un random entre 1 y 3, de ahi, se    **
             ** repite lo mismo que con el usuario y se saca **
             **     la mano que va a tener la maquina        **
             **************************************************
             */

            jugadaMaquina = (int) (Math.random() * 3 + 1);

            switch (jugadaMaquina) {
                case 1:
                    manoMaquina = "Piedra";
                    break;
                case 2:
                    manoMaquina = "Papel";
                    break;
                case 3:
                    manoMaquina = "Tijeras";
                    break;
            }

            /*
                 EMPIEZA EL JUEGO:
                    - Comprobamos 1 por 1 las manos de la maquina y del jugador, las comparamos
                        y decidimos quien ha ganado

                    - Si la maquina y el jugador sacan la misma mano, es empate, se pasa de ronda
                    - Si el jugador gana, se pasa de ronda y suma 1
                    - Si no, se hace lo mismo con la maquina.
                    - Importante restablecer que el jugador no esta descalificado
             */

            System.out.println(" Jugador elige: " + manoJugador + " y la maquina elige: " + manoMaquina);

            switch (jugadaJugador){
                case 1:
                    if ( jugadaMaquina == 1 ){
                        System.out.println("Empate");
                    }
                    else if ( jugadaMaquina == 2 ){
                        System.out.println("Gana maquina");
                        victoriaMaquina++;
                    }
                    else {
                        System.out.println("Gana jugador");
                        victoriaJugador++;
                    }
                    break;
                case 2:
                    if ( jugadaMaquina == 1 ){
                        System.out.println("Gana jugador");
                        victoriaJugador++;
                    }
                    else if ( jugadaMaquina == 2 ){
                        System.out.println("empate");
                    }
                    else {
                        System.out.println("Gana maquina");
                        victoriaMaquina++;
                    }
                    break;
                case 3:
                    if ( jugadaMaquina == 1 ){
                        System.out.println("Gana maquina");
                        victoriaMaquina++;
                    }
                    else if ( jugadaMaquina == 2 ){
                        System.out.println("gana jugador");
                        victoriaJugador++;
                    }
                    else {
                        System.out.println("empate");
                    }
                    break;
            }

        }
        System.out.println(" ");
        System.out.println("Resultado final:");
        System.out.println("Jugador: " + victoriaJugador + " - Ordenador: " + victoriaMaquina);
        if(victoriaMaquina > victoriaJugador){
            System.out.println("Gana la maquina");
        } else if (victoriaMaquina == victoriaJugador) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana jugador");
        }

    }
}
