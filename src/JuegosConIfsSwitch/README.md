# Bloque IF - ELSE IF - ELSE // SWITCH

### Reglas:
* Solo se pueden usar tipos vistos en clase (int, float, string...)
    * Esto implica que no se pueden usar arrays por ejemplo
* Como dice el titulo, solo se pueden usar estructuras if o switch

### Explicacion de como funcionan las estructuras a usar:

#### IF / ELSE / ELSE IF

La estructura if funciona de la siguiente manera:

    * Quiero hacer algo si se da una condicion
    * Compruebo esa condicion
    * Si es verdadera, hago cosas
    * Si no es verdadera, hay 3 opciones
        - Hago otra comprobacion (else if)
        - Hago algo por defecto en cualquier otra condicion (else)
        - No hago nada

* Todo, todo, todo, repito ***TODO*** lo que vayamos a evaluar dentro de la condicion del if, tiene que ser verdadero. ***TODO***

        IF ( verdadero ) {
            hago cosas;
        }
* Da igual, lo que evaluemos dentro, pero siempre tiene que dar como resultado un verdadero o un falso, y, en caso de ser verdadero, se ejecutara el codigo dentro del if.
* Si tenemos varias condiciones *EXLCUYENTES* usaremos un else if. Este ELSE IF, tambien tiene que ser verdadero para que ejecute el codigo de dentro, si no, no hara nada.

        IF ( falso ) {
            no entro aqui;
        } ELSE IF (verdadero ) {
            hago cosas aqui;
        }
* Si queremos que se ejecute codigo en caso de que no sea verdadero, usaremos un else. Esto quiere decir que en caso de que la condicion sea falsa, lo que metamos dentro del **ELSE** se va a ejecutar siempre.

        IF ( falso ) {
            no entro aqui;
        } ELSE IF ( falso ) {
            no entro aqui;
        } ELSE IF ( falso ) {
            no entro aqui;
        } ELSE {
            ejecuto lo que hay aqui siempre que todo lo anterior sea falso;
        }
* En caso de que solo queramos hacer algo *SI SE DA UNA CONDICION* **no** hace falta que usemos *ELSE*

        IF ( verdadero ) {
            hago cosas;
        }
        
        el programa sigue;

        IF ( falso ) {
            no entro aqui;
        }

        el programa sigue;

#### SWITCH

Al contrario que el if, en el switch **NO TENEMOS** una condicion que sea verdadero o falso. En su caso, evaluamos una condicion y tenemos un abanico de opciones las cuales *tienen que ser conocidas o delimitadas* y actuamos en consecuencia. Es decir, tenemos algo y queremos realizar acciones para casos especificos y conocidos.

En un switch, se ejecutan todas las lineas de codigo que hay debajo de la opcion en la que entra, por ejemplo si entra en el 4º caso y tenemos 10, ejecutara el codigo del 4, 5, 6, 7, 8, 9 y 10. Para evitar esto, tenemos un comando *"especial"* que se llama **BREAK**
### EJEMPLO:

        numero = 10;
        IF ( numero > 5 ) {
            hago cosas;
        }

        SWITCH ( numero ) { -> cogemos el valor de numero
          case > 5: -> no se puede hacer, nos daria error
        }

        FORMA DE HACERLO (NO VIABLE, hay que saber todas las opciones posibles)
        SWITCH ( numero ) {
          case 6: ejecuto codigo; break;
          case 7: ejecuto codigo; break;
          case 8: ejecuto codigo; break;
          ......
        }
Como se ve, no es viable hacer un switch para esta condicion.

### EJEMPLO DONDE SI NOS SERIA UTIL

        mascota = "perro"; -> opciones perro | gato | conejo | periquito
        IF ( mascota.equals("perro") ) {
            println( "que perro mas bonito tienes" );
        } ELSE IF ( mascota.equals("gato") ) {
            println( "tienes un gato" );
        } ELSE IF ( mascota.equals("conejo") ) {
            println( "tienes un conejo" );
        } ELSE IF ( mascota.equals("periquito") ) {
            println( "tienes un pajarillo" );
        }

        SWITCH ( mascota ) {
          case "perro":
            println( "que perro mas bonito tienes");
            break;
  
          case "gato":
            println( "tienes un gato");
            break;

          case "conejo":
            println( "tienes un conejo");
            break;
  
          case "periquito":
            println( "tienes un pajarillo");
            break;
        }

En los switch, tambien tenemos algo parecido al else, es decir, una opcion de que hacer "por defecto" en caso de que no se cumpla ninguna de las anteriores en caso de que asi lo queramos.

En este caso, haremos uso de ***DEFAULT***

        numero = 4;
        SWITCH ( numero ){
          case 1: println( "El numero es 1" ); break;
          case 2: println( "El numero es 2" ); break;
          default: println( "El numero no es ni 1 ni 2);
        }

Como se puede ver dandole una vuelta, siempre que comprobemos valores especificos, podemos usar indistintamente if o switch. A nivel de estructuracion, legibilidad y facilidad para entender el codigo, en casos en los que tenemos un numero limitado de opciones, es más comodo usar switch.

        numero = 4;
        IF ( numero == 1 ){
          println( "El numero es 1" );
        } ELSE IF ( numero == 2 ){
          println ( "El numero es 2" );
        } ELSE {
          println ( "El numero no es 1 ni 2" );
        }

        SWITCH ( numero ){
          case 1: println( "El numero es 1" ); break;
          case 2: println( "El numero es 2" ); break;
          default: println( "El numero no es ni 1 ni 2);
        }