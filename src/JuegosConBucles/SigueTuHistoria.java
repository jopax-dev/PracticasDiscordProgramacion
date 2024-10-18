package JuegosConBucles;

import java.util.Scanner;

public class SigueTuHistoria {
    /*
        Reglas basicas: Empieza la aventura y el usuario va eligiendo en funcion de una serie de opciones para ver a que
                        pagina sera redirigido.

        Limitaciones:
            - Solo se permite el uso de tipos que hemos visto (int, String, double....)
            - Solo se pueden usar ifs y switch

        Ayuda:
            - Seguiremos la aventura hasta que el usuario llega al final.
            - Estamos limitados por tipos de datos vistos hasta ahora y por estructuras vistas hasta ahora.
            - Para generar la historia y las opciones/enlaces a cada pagina, usaremos chatgpt ya que lo importante es
                la lógica del programa, no el texto en si.
     */

    public static void main(String[] args) {

        /*
            Definimos 4 variables
            - En una guardaremos la pagina a la que vamos.
            - En la otra, el numero de decisiones que tomamos hasta llegar al final.
            - Tambien guardaremos la respuesta que elegimos
            - La ultima, la utilizaremos para romper el buccle.
         */
        int pagina = 1, decisiones = 0, respuesta = 0;
        boolean finAventura = false;

        // Creamos el scanner donde leeremos la opcion a elegir del usuario
        Scanner sc = new Scanner(System.in);

        /*
            Mientras que no sea el fin de la aventura ejecutamos en bucle las opciones
            Cuando lleguemos a un final, cambiaremos la variable de valor para que nos saque del bucle.
         */
        while (!finAventura) {
            switch (pagina) {
                case 1:
                    System.out.println("Página 1: Llegada a la Isla");
                    System.out.println("Has llegado a una isla misteriosa, donde la vegetación " +
                            "densa y los sonidos de la fauna te rodean. \nEl aire huele a sal y a" +
                            " tierra húmeda, y el mapa que encontraste parece indicar que el tesoro está " +
                            "\nescondido en el corazón de la isla. A tu alrededor, puedes ver dos" +
                            " senderos: uno que se adentra en \nla selva, cubierto de hojas y " +
                            "flores exóticas, y otro que sigue la costa, donde las olas rompen " +
                            "\nsuavemente  contra las rocas. La emoción y la intriga te empujan a " +
                            "tomar una decisión.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Seguir el sendero hacia la selva. (Página 2)");
                    System.out.println("\t2. Caminar a lo largo de la costa. (Página 3)");
                    System.out.print("\nQue opcion tomas?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 2;
                    } else {
                        pagina = 3;
                    }
                    break;
                case 2:
                    System.out.println("\nPágina 2: En la Selva");
                    System.out.println("Te adentras en la selva, donde la luz del sol apenas " +
                            "llega a tocar el suelo. Los árboles son altos \ny frondosos, y sus " +
                            "hojas susurran al viento, creando una sinfonía natural. El canto de " +
                            "las aves resuena \na tu alrededor, y te sientes observado por ojos invisibles. " +
                            "A medida que avanzas, el camino se vuelve\nmás estrecho, y " +
                            "encuentras una cueva oscura a tu izquierda, de cuya entrada emana un" +
                            " aire frío y húmedo. \nA tu derecha, un claro iluminado por " +
                            "el sol muestra un extraño brillo que capta tu atención.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Entrar en la cueva. (Página 4)");
                    System.out.println("\t2. Investigar el claro brillante. (Página 5)");
                    System.out.print("\nQue vas a hacer?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 4;
                    } else {
                        pagina = 5;
                    }
                    break;
                case 3:
                    System.out.println("\nPágina 3: A lo Largo de la Costa");
                    System.out.println("Sigues la costa, sintiendo la arena entre tus pies y el sonido de las olas " +
                            "rompiendo suavemente\ncontra las rocas. El paisaje es hermoso, pero un aire de misterio lo " +
                            "envuelve. A lo lejos, un \nbarco encallado asoma entre las olas, como un recuerdo de tiempos " +
                            "pasados, mientras que un pequeño \nfaro abandonado se alza majestuosamente en la distancia. " +
                            "Sientes que el mapa menciona un punto \ncercano a la costa, lo que te motiva a decidir tu " +
                            "siguiente movimiento.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Explorar el barco encallado. (Página 6)");
                    System.out.println("\t2. Acercarte al faro. (Página 7)");
                    System.out.print("\nHacia donde te iras?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 6;
                    } else {
                        pagina = 7;
                    }
                    break;
                case 4:
                    System.out.println("\nPágina 4: La Cueva");
                    System.out.println("Dentro de la cueva, la oscuridad te envuelve como una " +
                            "manta pesada y sientes un escalofrío recorrer tu \nespalda. Las " +
                            "paredes son húmedas y están cubiertas de extrañas inscripciones que parecen " +
                            "contar \nhistorias de antiguos navegantes. El aire es denso y tiene " +
                            "un olor a tierra y misterio. Un brillo \ntenue emana de una grieta " +
                            "en la roca, iluminando parte de la cueva, pero un rugido sordo " +
                            "resuena en el fondo, \nlo que te hace dudar si debes continuar.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Acercarte al brillo. (Página 8)");
                    System.out.println("\t2. Salir de la cueva rápidamente. (Página 9)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 8;
                    } else {
                        pagina = 9;
                    }
                    break;
                case 5:
                    System.out.println("\nPágina 5: El Claro Brillante");
                    System.out.println("Te acercas al claro y descubres que el brillo proviene de" +
                            " un objeto dorado enterrado en la tierra. Excavas un \npoco y " +
                            "encuentras una antigua moneda con un emblema que coincide con el de " +
                            "tu mapa. La moneda brilla \nintensamente bajo la luz del sol, como " +
                            "si guardara un secreto. Sin embargo, sientes que no estás solo, \nya que una sombra se mueve entre los árboles cercanos, levantando la inquietud en tu interior.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Tomar la moneda y seguir explorando. (Página 10)");
                    System.out.println("\t2. Esconderte y observar la sombra. (Página 11)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 10;
                    } else {
                        pagina = 11;
                    }
                    break;
                case 6:
                    System.out.println("\nPágina 6: El Barco Encallado");
                    System.out.println("El barco, desgastado por el tiempo y cubierto de algas, " +
                            "parece un antiguo navío pirata que ha encontrado su final en esta isla. La madera cruje al pisarla y el aire huele a mar y aventura. A medida que exploras la cubierta, encuentras un cofre cerrado con un candado oxidado, un verdadero desafío para un aventurero como tú. En la bodega, un destello de luz parece llamar tu atención, prometiendo tesoros ocultos.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Intentar abrir el cofre. (Página 12)");
                    System.out.println("\t2. Investigar la bodega. (Página 13)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 12;
                    } else {
                        pagina = 13;
                    }
                    break;
                case 7:
                    System.out.println("\nPágina 7: El Faro Abandonado");
                    System.out.println("Te acercas al faro, que se alza en la costa como un " +
                            "guardián solitario de los mares. La puerta \ncruje al abrirse y el " +
                            "interior está lleno de polvo y telarañas, como si el tiempo hubiera " +
                            "olvidado \neste lugar. La luz que alguna vez guió a los barcos ya no " +
                            "brilla. En lo alto, ves una escalera que \nlleva al faro, y hay un " +
                            "mapa antiguo colgado en la pared, que puede contener secretos sobre " +
                            "la isla.\n" );
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Subir al faro. (Página 14)");
                    System.out.println("\t2. Examinar el mapa en la pared. (Página 15)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 14;
                    } else {
                        pagina = 15;
                    }
                    break;
                case 8:
                    System.out.println("\nPágina 8: El Brillo de la Cueva");
                    System.out.println("Te acercas al brillo y descubres un cristal brillante, " +
                            "que parece pulsar con energía. Al tocarlo, sientes una \nconexión " +
                            "inmediata, como si el cristal te hablara. Sin embargo, el rugido se " +
                            "intensifica, llenando el aire con \nuna tensión palpable. Debes decidir si arriesgarte y seguir adelante, o retirarte de la misteriosa cueva.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Llevarte el cristal y salir. (Página 16)");
                    System.out.println("\t2. Quedarte a investigar el origen del rugido. (Página 17)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 16;
                    } else {
                        pagina = 17;
                    }
                    break;
                case 9:
                    System.out.println("\nPágina 9: Salida de la Cueva");
                    System.out.println("Sales de la cueva rápidamente, aliviado por volver a la luz del día. Sin embargo, al mirar el mapa, te das cuenta de que se ha mojado y es difícil de leer. El sudor te recorre la frente mientras evalúas tus opciones, preguntándote cuál será el mejor camino a seguir en esta isla llena de secretos");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Volver al sendero de la selva. (Página 2)");
                    System.out.println("\t2. Regresar a la costa. (Página 3)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 2;
                    } else {
                        pagina = 3;
                    }
                    break;
                case 10:
                    System.out.println("\nPágina 10: La Moneda del Claro");
                    System.out.println("Tomas la moneda y decides seguir explorando. De repente, " +
                            "la sombra se revela como un viejo guardián de la isla, \nque te " +
                            "observa con ojos sabios. Te advierte sobre el peligro que acecha en " +
                            "los rincones de la isla y te ofrece \nsu ayuda, pero primero debe " +
                            "saber si eres digno de su confianza.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Preguntarle sobre el tesoro. (Página 18)");
                    System.out.println("\t2. Intentar escapar. (Página 19)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 18;
                    } else {
                        pagina = 19;
                    }
                    break;
                case 11:
                    System.out.println("\nPágina 11: Escondido en el Claro");
                    System.out.println("Te escondes y observas a la sombra. Resulta ser un anciano que parece estar buscando algo con desesperación. Su apariencia es misteriosa, con ropas raídas y un aire de sabiduría. Decides acercarte y ofrecerle tu ayuda, sintiendo que podría ser la clave para descubrir más sobre la isla y su tesoro.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Preguntarle qué busca. (Página 20)");
                    System.out.println("\t2. Ofrecerle la moneda. (Página 21)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 20;
                    } else {
                        pagina = 21;
                    }
                    break;
                case 12:
                    System.out.println("\nPágina 12: Abrir el Cofre");
                    System.out.println("Intentas abrir el cofre, pero está atascado. Con un esfuerzo, logras abrirlo y dentro encuentras un mapa más detallado de la isla, que resplandece con nuevas oportunidades. Este nuevo mapa marca lugares desconocidos, donde podrían estar escondidos los mayores secretos de la isla. Sin embargo, la emoción también trae consigo el temor de lo que podrías encontrar.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Seguir el nuevo mapa. (Página 22)");
                    System.out.println("\t2. Buscar algo más en el barco. (Página 23)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 22;
                    } else {
                        pagina = 23;
                    }
                    break;
                case 13:
                    System.out.println("\nPágina 13: La Bodega");
                    System.out.println("Bajas a la bodega y encuentras un viejo barril lleno de oro y joyas. La luz que se filtra por las rendijas del barco hace que el oro brille intensamente, prometiendo riqueza. Pero al tocarlo, el barco comienza a moverse, como si estuviera despertando de un largo sueño. Debes decidir rápidamente cómo actuar.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Sacar el oro rápidamente. (Página 24)");
                    System.out.println("\t2. Escapar del barco. (Página 25)");
                    System.out.println("\t3. Quedarte a investigar más. (Página 26)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 24;
                    } else if (respuesta == 2){
                        pagina = 25;
                    } else {
                        pagina = 26;
                    }
                    break;
                case 14:
                    System.out.println("\nPágina 14: Subiendo al Faro");
                    System.out.println("Subes al faro y, al llegar a la cima, encuentras un " +
                            "catalejo antiguo. Desde allí, puedes ver varios \npuntos de interés " +
                            "en la isla, cada uno con su propia historia. La brisa marina " +
                            "acaricia tu rostro mientras observas la vasta extensión del paisaje," +
                            " y sientes que esta podría ser una buena oportunidad para planear tu" +
                            " próximo movimiento.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Ir al norte hacia las montañas. (Página 27)");
                    System.out.println("\t2. Dirigirte al este hacia una cascada. (Página 28)");
                    System.out.println("\t3. Regresar al suelo y salir del faro. (Página 29)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 27;
                    } else if (respuesta == 2){
                        pagina = 28;
                    } else {
                        pagina = 29;
                    }
                    break;
                case 15:
                    System.out.println("\nPágina 15: Examinar el Mapa");
                    System.out.println("Examinas el mapa y descubres que señala tres lugares diferentes: un templo antiguo, una cueva profunda y un lago sereno. Cada lugar parece prometer una aventura única y posiblemente el tesoro que buscas. La emoción burbujea en tu interior mientras decides cuál de estos lugares explorar primero.\n" +
                            "\n");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Ir al templo. (Página 30)");
                    System.out.println("\t2. Buscar la cueva. (Página 31)");
                    System.out.println("\t3. Dirigirte al lago. (Página 28)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 30;
                    } else if (respuesta == 2){
                        pagina = 31;
                    } else {
                        pagina = 28;
                    }
                    break;
                case 16:
                    System.out.println("\nPágina 16: Llevar el Cristal");
                    System.out.println("Decides llevarte el cristal. Al salir de la cueva, " +
                            "sientes  que el mapa comienza a brillar intensamente, como \nsi te " +
                            "guiara hacia un  destino especial. El aire a tu alrededor cambia,  " +
                            "volviéndose más pesado y cargado de energía. \nEstás a punto de descubrir algo increíble.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Seguir el mapa hacia el corazón de la isla.");
                    System.out.println("\t2. Regresar al claro. (Página 5)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        finAventura = true;
                    }else {
                        pagina = 5;
                    }
                    break;
                case 17:
                    System.out.println("\nPágina 17: Investigar el Rugido");
                    System.out.println("Decides quedarte y descubrir el origen del rugido. Al " +
                            "final de la cueva, encuentras un antiguo dragón que \ncustodia el " +
                            "tesoro. Sus escamas brillan en la oscuridad y sus ojos resplandecen " +
                            "con sabiduría y poder. El dragón observa tus movimientos con " +
                            "curiosidad, como si esperara que tomaras una decisión.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Tratar de hablar con el dragón.");
                    System.out.println("\t2. Atacar al dragón.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 18:
                    System.out.println("\nPágina 18: Preguntar al Guardián");
                    System.out.println("Le preguntas al guardián sobre el tesoro, que te dice que" +
                            " solo los dignos pueden encontrarlo. Te relata \nhistorias de " +
                            "aquellos que lo intentaron y fracasaron, advirtiéndote que la " +
                            "aventura no será fácil. A medida que \nhabla, sientes que la verdad de" +
                            " su sabiduría se asienta en tu corazón.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Demostrar tu valía.");
                    System.out.println("\t2. Preguntar cómo hacerlo.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 19:
                    System.out.println("\nPágina 19: Intentar Escapar");
                    System.out.println("Intenta escapar, pero el guardián te detiene. Te advierte" +
                            " que el verdadero tesoro es el conocimiento y que cada \npaso que " +
                            "tomas en la isla es una lección. Mientras tratas de huir, te das " +
                            "cuenta de que quizás deberías escuchar sus palabras antes de seguir.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Escuchar su consejo.");
                    System.out.println("\t2. Continuar huyendo.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 20:
                    System.out.println("\nPágina 20: Preguntar al Anciano");
                    System.out.println("Le preguntas al anciano qué busca y te cuenta sobre un antiguo tesoro perdido que pertenece a su familia. Sus ojos brillan con nostalgia mientras narra las historias de sus antepasados, y sientes que su búsqueda está entrelazada con la tuya.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Ayudarlo a buscar.");
                    System.out.println("\t2. Ignorarlo y seguir tu camino.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 21:
                    System.out.println("\nPágina 21: Ofrecerle la Moneda");
                    System.out.println("Le ofreces la moneda y el anciano, sorprendido, te revela un secreto sobre el tesoro: solo se puede encontrar con la combinación de valentía y sabiduría. Sus palabras resuenan en ti, llenándote de determinación para continuar tu búsqueda.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Seguir su consejo.");
                    System.out.println("\t2. Buscar el tesoro por tu cuenta.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 22:
                    System.out.println("\nPágina 22: Seguir el Nuevo Mapa");
                    System.out.println("Decides seguir el nuevo mapa que encontraste en el cofre. Te lleva a un lugar sagrado en la isla, donde las flores florecen en colores vibrantes y el aire está impregnado de un perfume dulce. La atmósfera es mágica y sientes que este lugar podría ser clave para encontrar el tesoro.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Explorar el lugar sagrado.");
                    System.out.println("\t2. Volver al barco.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 23:
                    System.out.println("\nPágina 23: Buscar Más en el Barco");
                    System.out.println("Decides buscar más en el barco, pero el tiempo se acaba y el barco comienza a hundirse. Las olas rompen con fuerza contra los costados del barco, y debes actuar rápidamente antes de que sea demasiado tarde.\n" +
                            "\n");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Escapar nadando.");
                    System.out.println("\t2. Tratar de salvar el oro.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 24:
                    System.out.println("\nPágina 24: Sacar el Oro");
                    System.out.println("Sacas el oro rápidamente, pero el barco se hunde y debes nadar hacia la costa. El agua fría te envuelve, pero la emoción de tener el oro en tus manos te impulsa a seguir adelante. Luchas contra las corrientes mientras te acercas a la playa.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Buscar refugio en la playa.");
                    System.out.println("\t2. Intentar encontrar ayuda.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 25:
                    System.out.println("\nPágina 25: Escapar del Barco");
                    System.out.println("Decides escapar del barco, pero te arrastra la corriente. Terminas en una playa desconocida, donde las olas susurran secretos que apenas entiendes. Mientras te recuperas, miras a tu alrededor en busca de pistas sobre cómo regresar a tu misión.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Explorar la nueva playa.");
                    System.out.println("\t2. Intentar volver al barco.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 26:
                    System.out.println("\nPágina 26: Quedarte a Investigar");
                    System.out.println("Decides quedarte a investigar, pero el tiempo se acaba y no encuentras la salida. La cueva se convierte en un laberinto, y el eco de tus pasos resuena en la oscuridad. Comienzas a dudar si alguna vez encontrarás el tesoro.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Buscar una salida.");
                    System.out.println("\t2. Llamar por ayuda.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 27:
                    System.out.println("\nPágina 27: Ir al Norte");
                    System.out.println("Decides ir al norte hacia las montañas y descubres un antiguo templo. La arquitectura es impresionante, con tallados que narran historias de dioses y héroes. Sientes que este lugar es sagrado y que podría guardar secretos valiosos.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Entrar al templo.");
                    System.out.println("\t2. Ignorar el templo.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 28:
                    System.out.println("\nPágina 28: Dirigirte al Este");
                    System.out.println("Decides ir al este hacia la cascada, donde encuentras un lago escondido rodeado de árboles frondosos. La luz del sol se refleja en el agua, creando un espectáculo mágico. Este lugar parece un refugio perfecto para descansar y meditar.\n" +
                            "\n");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Nadar en el lago.");
                    System.out.println("\t2. Buscar un escondite.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 29:
                    System.out.println("\nPágina 29: Regresar al Suelo");
                    System.out.println("Decides regresar al suelo y salir del faro. Te das cuenta de que has perdido tiempo valioso, pero el mar brilla ante ti, recordándote la aventura que te espera. La isla sigue siendo un misterio, y debes decidir dónde ir a continuación.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Regresar a la selva. (Página 2)");
                    System.out.println("\t2. Volver a la costa. (Página 3)");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    if (respuesta == 1) {
                        pagina = 2;
                    } else {
                        pagina = 3;
                    }
                    break;
                case 30:
                    System.out.println("\nPágina 30: Ir al Templo");
                    System.out.println("Te diriges al templo y descubres un altar con un antiguo objeto que emite un brillo misterioso. Al acercarte, sientes una energía poderosa que parece llamarte. Este podría ser el tesoro que has estado buscando.\n" +
                            "\n");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Examinar el objeto.");
                    System.out.println("\t2. Ignorarlo y continuar.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
                case 31:
                    System.out.println("\nPágina 31: Buscar la Cueva");
                    System.out.println("Vuelves a buscar la cueva, pero te pierdes en la selva. El denso follaje parece cerrarse a tu alrededor y necesitas encontrar el camino de regreso antes de que caiga la noche.");
                    System.out.println("\nOpciones:");
                    System.out.println("\t1. Seguir el sonido del agua.");
                    System.out.println("\t2. Escuchar a los animales.");
                    System.out.print("\nQue haces?: ");
                    respuesta = sc.nextInt();
                    finAventura = true;
                    break;
            }
        }
        switch (pagina){
            case 16:
                System.out.println("Al tocar el cristal brillante, una luz resplandece y revela " +
                        "un antiguo mensaje sobre la isla. Te das cuenta de \nque el verdadero " +
                        "tesoro no es solo el oro, sino el conocimiento y la historia que ahora " +
                        "llevas contigo. Has sido \nelegido para proteger este legado y " +
                        "compartirlo con el mundo. Regresas a casa con el objeto y una historia " +
                        "que \ncontar, sabiendo que la aventura ha cambiado tu vida para siempre.");
                break;
            case 17:
                if(respuesta == 1 ){
                    System.out.println("Al acercarte al dragón, te sorprende su mirada sabia. Le explicas tu búsqueda y él, en lugar de atacar, se convierte en tu aliado. Te cuenta sobre un tesoro escondido que está vinculado a la historia de la isla. Juntos, desentrañan secretos antiguos y, al final, encuentras el tesoro, convirtiéndote en el nuevo protector de la isla y su legado.");
                } else {
                    System.out.println("Decides no acercarte al dragón. Temiendo su furia, te alejas. Sin embargo, sientes que has dejado escapar una oportunidad única. Al regresar, la isla se siente más vacía, y te das cuenta de que no solo perdiste el tesoro, sino también una posible amistad con una criatura legendaria.");
                }
                break;
            case 18:
                if(respuesta == 1){
                    System.out.println("El guardián te dice que solo los dignos pueden encontrar " +
                            "el tesoro. Al demostrar tu valentía, te revela la \nubicación de un " +
                            "escondite lleno de riquezas y conocimiento. Regresas a casa con un " +
                            "tesoro que no solo es material, \nsino también un símbolo de tu " +
                            "crecimiento personal y de la amistad que cultivaste en la isla.");
                } else {
                    System.out.println("Decides preguntar al guardián cómo acceder al tesoro. Sin" +
                            " embargo, al hacerlo, revelas tus intenciones. Este se niega a " +
                            "ayudarte y te advierte sobre las consecuencias de la codicia. Sin su guía, te sientes perdido y desorientado. Al final, regresas al barco con las manos vacías, sintiendo que podrías haber aprendido valiosas lecciones si hubieras abordado la situación de otra manera.");
                }
                break;
            case 19:
                if (respuesta == 1) {
                    System.out.println("Al acercarte al guardián, le preguntas cómo puedes encontrar el tesoro. Él sonríe, impresionado por tu sinceridad y determinación. Te comparte una historia antigua sobre la isla y te revela pistas sobre la ubicación del tesoro escondido. Siguiendo su guía, encuentras un camino oculto que te lleva a una cueva llena de riquezas y artefactos antiguos. No solo regresas a casa con tesoros materiales, sino también con un profundo entendimiento de la historia y la sabiduría que ahora llevas contigo.");
                } else {
                    System.out.println(" Intentas huir, pero el anciano te advierte que el verdadero tesoro es el conocimiento. Al ignorar su sabiduría, te pierdes en la isla y te das cuenta de que la aventura no solo se trataba de riquezas. Regresas a casa con las manos vacías, pero con un aprendizaje que nunca olvidarás.");
                }
                break;
            case 20:
                if (respuesta == 1){
                    System.out.println("Decides ayudar al guardián en su búsqueda. Juntos, recorren la isla, explorando cada rincón y desentrañando antiguos secretos. A medida que avanzan, el anciano comparte historias sobre los tesoros perdidos y las leyendas de la isla. Finalmente, tras un arduo esfuerzo, encuentran un antiguo relicario escondido en una cueva. Al abrirlo, descubren un tesoro de maravillas: gemas brillantes, oro y artefactos que cuentan la historia de la isla. Regresas a casa no solo con riquezas materiales, sino con una amistad valiosa y una nueva perspectiva sobre el verdadero significado de la aventura.");
                } else {
                    System.out.println("Decides ignorar al guardián y seguir tu camino, pensando que no necesitas su ayuda. Sin embargo, pronto te das cuenta de que la isla es más compleja de lo que imaginabas. Al no escuchar sus consejos, te pierdes en la densa vegetación y te enfrentas a desafíos inesperados. Finalmente, te sientes frustrado y agotado, sin haber encontrado pistas sobre el tesoro. Regresas al barco sintiéndote decepcionado, consciente de que podrías haber aprendido valiosas lecciones si hubieras optado por colaborar.");
                }
                break;
            case 21:
                if ( respuesta == 1) {
                    System.out.println("Le ofreces la moneda al anciano, quien, sorprendido por tu generosidad, sonríe y te revela un secreto antiguo sobre el tesoro. Te explica que solo se puede encontrar con la combinación de valentía y sabiduría. Sus palabras resuenan en ti, llenándote de determinación para continuar tu búsqueda. Con un nuevo sentido de propósito, te diriges a la siguiente etapa de tu aventura, decidido a aplicar lo que has aprendido y a buscar el tesoro con inteligencia y coraje.");
                } else {
                    System.out.println("Decides ignorar el consejo del anciano y buscar el tesoro por tu cuenta. Confiado en tu habilidad, te adentras en la isla sin un plan claro. Sin embargo, pronto te das cuenta de que la arrogancia te ha llevado a perderte en un laberinto de árboles y sombras. Sin dirección ni guía, te enfrentas a numerosos obstáculos y, finalmente, la búsqueda se convierte en una lucha frustrante. Regresas al barco, sintiéndote desalentado y arrepentido por no haber escuchado la sabiduría del anciano.");
                }
                break;
            case 22:
                if(respuesta == 1){
                    System.out.println("Al abrir el cofre, encuentras un mapa más detallado de la isla, que brilla con nuevas oportunidades. Con este nuevo mapa, te embarcas en una serie de aventuras, descubriendo lugares ocultos y secretos que pocos conocen. Tu valentía y curiosidad te han llevado a tesoros inimaginables. Regresas a casa no solo con oro, sino con la experiencia de un verdadero explorador.");
                } else {
                    System.out.println("ecides no seguir el nuevo mapa y, en cambio, regresar a la costa. Te das cuenta de que has dejado escapar la oportunidad de descubrir algo increíble. Al volver, sientes que te has perdido en la inmensidad de la isla y que la búsqueda del tesoro se ha desvanecido. Regresas al barco, sintiendo una mezcla de decepción y curiosidad por lo que podría haber sido, consciente de que te falta algo importante en tu búsqueda.");
                }
                break;
            case 23:
                if (respuesta == 1){
                    System.out.println("Decides escapar nadando, dejando atrás la búsqueda del tesoro. Al lanzarte al agua, sientes la fuerza de las olas golpeando tu cuerpo. A medida que nadas, la corriente te arrastra y la desesperación te invade. Aunque logras llegar a la orilla, el barco se hunde en el horizonte, llevándose consigo la oportunidad de encontrar el tesoro. Te sientes frustrado y abatido, consciente de que no solo perdiste riquezas, sino también la posibilidad de una gran aventura.\n" +
                            "\n");
                } else {
                    System.out.println("Decides intentar salvar el oro del barco. Con valentía, te sumerges en el agua turbia, luchando contra las olas para alcanzar el cofre. Sin embargo, el tiempo se acaba y el barco comienza a hundirse más rápido de lo que esperabas. Justo cuando logras recuperar algunas monedas, sientes que el barco se desploma bajo ti. En tu esfuerzo por salvar el tesoro, te quedas atrapado en el remolino y te ves obligado a abandonar el oro. Regresas a la playa, sintiendo la amarga derrota de haber perdido tanto el tesoro como la oportunidad de una verdadera aventura.");
                }
                break;
            case 26:
                if (respuesta == 1){
                    System.out.println("Decides buscar una salida, pero a medida que te adentras más en la cueva, la oscuridad te envuelve. Cada pasillo que exploras parece llevarte más lejos de la salida. El eco de tus pasos se convierte en un recordatorio inquietante de tu soledad y confusión. El tiempo se agota, y la desesperación comienza a apoderarse de ti. Finalmente, te das cuenta de que has perdido completamente el sentido de la dirección. Sin más opciones, te sientas en la oscuridad, sintiendo que la cueva ha ganado. El tesoro, una vez tan cerca, ahora parece inalcanzable, y te enfrentas a la amarga realidad de tu fracaso.");
                } else {
                    System.out.println("Decides llamar por ayuda, esperando que alguien te escuche en la oscuridad de la cueva. Tu voz resuena, pero el silencio que sigue es ensordecedor. A medida que el eco se desvanece, sientes que la soledad se intensifica. La cueva parece un laberinto interminable, y tus gritos solo parecen amplificar tu desesperación. Sin respuesta, la ansiedad se apodera de ti, y la duda se convierte en desesperación. Al final, te das cuenta de que nadie vendrá, y el tiempo se acaba. La promesa del tesoro se desvaneció, dejando solo la fría realidad de un laberinto del que no puedes escapar.");
                }
                break;
            case 25:
                System.out.println("Al intentar escapar del barco, te arrastra la corriente. Terminas en una playa desconocida, donde la sensación de fracaso te persigue. La búsqueda del tesoro se convierte en un recuerdo doloroso, y te preguntas si alguna vez volverás a encontrar lo que buscabas.");
                break;
            case 24:
                if (respuesta == 1){
                    System.out.println("Decides buscar refugio en la playa, dejando atrás la posibilidad de encontrar ayuda. Te arrastras sobre la arena, agotado y temblando de frío. A pesar de tener el oro en tus manos, te das cuenta de que estás solo y vulnerable. Las olas siguen rompiendo con fuerza, y sin protección, el viento frío te hace sentir más desamparado. Pronto, la sensación de triunfo se convierte en desesperación, y te das cuenta de que el oro no significa nada sin alguien con quien compartirlo o un lugar seguro para descansar. Regresas a la orilla sintiéndote perdido y desalentado.");
                } else {
                    System.out.println("Decides intentar encontrar ayuda, dejando el oro a un lado mientras te sumerges en el agua. Luchas contra las corrientes y te alejas de la playa en busca de alguien que pueda asistirte. Sin embargo, a medida que te alejas, la fatiga comienza a hacer mella en ti. La emoción de tener el oro se desvanece rápidamente al darte cuenta de que te has perdido. Las olas te empujan de regreso a la playa, donde te sientes más vulnerable que nunca, sin ningún tesoro y sin ayuda a la vista. La soledad y el miedo te abruman mientras te das cuenta de que tu búsqueda ha fracasado.");
                }
                break;
            case 27:
                if (respuesta == 1){
                    System.out.println("Decides entrar al templo, sintiendo una mezcla de reverencia y emoción. A medida que cruzas el umbral, la luz tenue ilumina los intrincados tallados en las paredes, que cuentan historias de dioses y héroes antiguos. En el centro del templo, encuentras un altar cubierto de polvo, pero en su cima descansa un cofre resplandeciente. Al abrirlo, descubres no solo oro y joyas, sino también antiguos manuscritos que revelan los secretos de la isla y su historia. Con el corazón lleno de alegría, te das cuenta de que has encontrado un tesoro que trasciende lo material, un legado que podrás compartir con el mundo.\n" +
                            "\n");
                } else {
                    System.out.println("Decides ignorar el templo y seguir tu camino. Sin embargo, pronto te das cuenta de que has perdido una gran oportunidad de aprender sobre la historia de la isla. La aventura se convierte en una búsqueda sin rumbo, y sientes que algo importante se ha desvanecido.\n" +
                            "\n");
                }
                break;
            case 28:
                if (respuesta == 1){
                    System.out.println("Mientras nadas, sientes que el agua te purifica y renueva tu espíritu. Al salir, encuentras un pequeño cofre escondido en la orilla, lleno de gemas y artefactos antiguos. Comprendes que este tesoro simboliza los desafíos que superaste y las lecciones aprendidas.");
                } else {
                    System.out.println("Decides buscar un escondite en lugar de disfrutar del mágico lago. A pesar de la belleza que te rodea, la inquietud te impulsa a encontrar un lugar seguro. Te adentras en la densa vegetación, tratando de ocultarte de cualquier posible amenaza. Sin embargo, al alejarte del lago, te das cuenta de que te has perdido entre los árboles. La calma del lugar se convierte en un silencio inquietante, y la sensación de refugio se transforma en ansiedad. Pasas horas buscando un escondite que no aparece, y el lago, que podría haberte ofrecido paz y claridad, queda fuera de alcance. Finalmente, regresas al lago, exhausto y desilusionado, sintiendo que perdiste una oportunidad valiosa de conexión con la naturaleza.");
                }
                break;
            case 30:
                if (respuesta == 1){
                    System.out.println("Al entrar al templo, te encuentras con un altar que contiene un objeto antiguo. Al tocarlo, sientes una energía poderosa que te llena de propósito. Comprendes que has descubierto no solo riquezas, sino también la historia y el legado de quienes vivieron antes que tú. Te conviertes en el guardián de este tesoro, listo para compartir su significado con el mundo.");
                } else {
                    System.out.println("Decides ignorar el antiguo objeto en el altar y continuar tu camino. A pesar de la poderosa energía que emite, sientes que lo mejor es no arriesgarte. Te alejas, sintiendo una mezcla de alivio y duda. Sin embargo, a medida que te alejas, la sensación de pérdida se apodera de ti. El brillo del objeto se desvanece en la distancia, y con él, la promesa de un tesoro que podría haber cambiado tu destino. Al salir del templo, te das cuenta de que has dejado atrás una oportunidad única, y el eco de tu decisión resuena en tu mente mientras te preguntas qué secretos habrías podido descubrir. Regresas a la isla sintiendo que has perdido una parte de ti mismo en la búsqueda del tesoro.");
                }
                break;
            case 31:
                if (respuesta == 1){
                    System.out.println("Decides seguir el sonido del agua, convencido de que te llevará de regreso a la cueva. A medida que avanzas, el murmullo se intensifica, pero el denso follaje hace que cada paso sea más difícil. Te adentras en la espesura, pero el sonido se convierte en un eco confuso, llevándote más lejos de tu objetivo. Cuando finalmente llegas a un pequeño arroyo, te das cuenta de que no estás en el camino correcto. La noche comienza a caer y la oscuridad te envuelve, dejándote atrapado en la selva. Sin rumbo y con una creciente sensación de pánico, te das cuenta de que has perdido no solo la dirección, sino también la esperanza de encontrar el camino de regreso.");
                } else {
                    System.out.println("Decides escuchar a los animales, pensando que podrían guiarte hacia un camino conocido. Sin embargo, el canto y los llamados de las criaturas son confusos en la densa selva. Te concentras en los sonidos, pero la falta de familiaridad te lleva a dar vueltas sin sentido. A medida que la noche se aproxima, te sientes cada vez más desorientado. La oscuridad comienza a acecharte y la ansiedad se apodera de ti. Finalmente, te das cuenta de que has estado siguiendo un rastro erróneo, y la selva, en lugar de ser un refugio, se convierte en una prisión. Te quedas atrapado en la noche, sintiendo que has perdido no solo el camino, sino también la oportunidad de encontrar el tesoro que tanto anhelabas.");
                }
                break;
        }
    }
}
