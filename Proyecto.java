import java.util.Random;
import java.util.Scanner;

public class Proyecto {
    //Función main
    public static void main(String[] args) {
        //Creación de escaner
        Scanner kb = new Scanner(System.in);

        //Función para mostrar mensajes motivadores diferentes en cada ejecución
        mostrarMensajeAleatorio();

        System.out.println("");

        iniciarSesion();

        System.out.println("");

        registrarEstadoDiario();

        System.out.println("");

        System.out.println("Las opciones disponible son: 1. Autodiagnóstico, 2. Diario personal, 3...");
        System.out.println("¿Qué opción eliges?");
        int opcion = kb.nextInt();

        switch (opcion) {
            case 1:
                autodiagnostico();
            break; 

            case 2:
                diarioPersonal();
            break;

            default:
                System.out.println("Opción no válida");
            break;

        }

        // kb.close();
    }

    //Función diario personal
    public static void diarioPersonal() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Bienvenido a tu diario personal, este es un espacio seguro en el que puedas expresar tus pensamientos de manera privada, siéntete libre de escribir lo que desees");
        System.out.println("");
        String diario = kb.nextLine();

        System.out.println("Gracias por expresar tus pensamientos en el día de hoy, recuerda que esto es una gran ayuda para tu salud mental.");
    }

    //Función para registrar estado diario de ánimo
    public static void registrarEstadoDiario() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Califica tu estado de ánimo actual en una escala del 1 al 5, donde 1 es muy malo y 5 es muy bueno:");
        int animo = kb.nextInt();

        switch(animo) {
            case 1:
                System.out.println("Tu estado de ánimo es muy bajo en este momento. Puede ser útil hablar con alguien de confianza sobre lo que estás sintiendo o considerar buscar apoyo profesional si es necesario. Recuerda que siempre hay formas de mejorar tu estado de ánimo.");
            break;

            case 2:
                System.out.println("Tu estado de ánimo no es el mejor en este momento. Trata de identificar las razones detrás de tu bajo estado de ánimo y considera realizar actividades que te hagan sentir mejor, como hablar con amigos o practicar la autocompasión.");
            break;

            case 3:
                System.out.println("Tu estado de ánimo es neutral en este momento. Esto puede ser una señal de que te sientes ni bien ni mal. Si deseas cambiar tu estado de ánimo, puedes explorar actividades que te brinden alegría o relajación.");
            break;

            case 4:
                System.out.println("Tu estado de ánimo es bastante bueno en este momento. Disfruta de este sentimiento positivo y considera compartirlo con otros o hacer algo que te haga sentir aún mejor.");
            break;

            case 5:
                System.out.println("Tu estado de ánimo es excepcionalmente bueno en este momento. ¡Eso es genial! Sigue haciendo lo que estás haciendo para mantener este estado de ánimo positivo y considera compartir tu felicidad con quienes te rodean.");
            break;

            default:
                System.out.println("Has ingresado un valor no válido");
            break;
        }
    }
    
    //Función para iniciar sesión
    public static void iniciarSesion() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de inicio de sesión");

        System.out.println("Ingrese su nombre: ");
        String nombre = kb.nextLine();

        System.out.println("Ingrese su correo electrónico: ");
        String correo = kb.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String contraseña = kb.next();

        System.out.println("Sus datos de inicio se sesión son: ");
        System.out.println(nombre);
        System.out.println(correo);
        System.out.println(contraseña);

        // kb.close();
    }

    //Funcionalidad para hacer un autodiagnóstico
    public static void autodiagnostico() {
        Scanner kb = new Scanner (System.in);
        
        //Variables
        int resultado, opcion;
        resultado = 0;

        System.out.println("A continuacións se le harán 9 nueve preguntas que podrán dar un diagnóstico aproximado de su situación respecto a la depresión, tenga en cuenta que para obtener un diagnóstico 100% acertado debe visitar un profesional en este campo");
        System.out.println("");


        //Pregunta 1
        System.out.println("¿Poco interés o placer por hacer cosas?\r\n" + //
                            "1: No en absoluto\r\n" + //
                            "2: En varios días\r\n" + //
                            "3: Más de la mitad de los días\r\n" + //
                            "4: Casi todos los días)");
        opcion = kb.nextInt();
        if (opcion==1){
            resultado = resultado + 0;
        } if (opcion==2){
            resultado = resultado + 1;
        } if (opcion==3){
            resultado = resultado + 2;
        } if (opcion==4){
            resultado = resultado + 3;
        }

        //Pregunta 2
        System.out.println("¿Se siente mal, deprimido o desesperanzado?\r\n" + //
                            "1: No en absoluto\r\n" + //
                            "2: En varios días\r\n" + //
                            "3: Más de la mitad de los días\r\n" + //
                            "4: Casi todos los días)");
        opcion = kb.nextInt();
        if (opcion==1){
            resultado = resultado + 0;
        } if (opcion==2){
            resultado = resultado + 1;
        } if (opcion==3){
            resultado = resultado + 2;
        } if (opcion==4){
            resultado = resultado + 3;
        }

        //Pregunta 3
        System.out.println("¿Tiene problemas para conciliar o mantener el sueño, o duerme demasiado?\r\n" + //
                            "1: No en absoluto\r\n" + //
                            "2: En varios días\r\n" + //
                            "3: Más de la mitad de los días\r\n" + //
                            "4: Casi todos los días)");
        opcion = kb.nextInt();
        if (opcion==1){
            resultado = resultado + 0;
        } if (opcion==2){
            resultado = resultado + 1;
        } if (opcion==3){
            resultado = resultado + 2;
        } if (opcion==4){
            resultado = resultado + 3;
        }

        //Pregunta 4
        System.out.println("¿Se siente cansado o con poca energía?\r\n" + //
                            "1: No en absoluto\r\n" + //
                            "2: En varios días\r\n" + //
                            "3: Más de la mitad de los días\r\n" + //
                            "4: Casi todos los días)");
        opcion = kb.nextInt();
        if (opcion==1){
            resultado = resultado + 0;
        } if (opcion==2){
            resultado = resultado + 1;
        } if (opcion==3){
            resultado = resultado + 2;
        } if (opcion==4){
            resultado = resultado + 3;
        }

        //Pregunta 5
        System.out.println("¿¿Tiene poco apetito o come en exceso??\r\n" + //
                            "1: No en absoluto\r\n" + //
                            "2: En varios días\r\n" + //
                            "3: Más de la mitad de los días\r\n" + //
                            "4: Casi todos los días)");
        opcion = kb.nextInt();
        if (opcion==1){
            resultado = resultado + 0;
        } if (opcion==2){
            resultado = resultado + 1;
        } if (opcion==3){
            resultado = resultado + 2;
        } if (opcion==4){
            resultado = resultado + 3;
        }

        //Pregunta 6
        System.out.println("¿Se siente mal consigo mismo, o cree que es un fracasado o que se ha defraudado a sí mismo o a su familia?\r\n" + //
                            "1: No en absoluto\r\n" + //
                            "2: En varios días\r\n" + //
                            "3: Más de la mitad de los días\r\n" + //
                            "4: Casi todos los días)");
        opcion = kb.nextInt();
        if (opcion==1){
            resultado = resultado + 0;
        } if (opcion==2){
            resultado = resultado + 1;
        } if (opcion==3){
            resultado = resultado + 2;
        } if (opcion==4){
            resultado = resultado + 3;
        }

        //Pregunta 7
        System.out.println("¿Problemas para concentrarse en cosas, como leer el periódico o ver la televisión?\r\n" + //
                            "1: No en absoluto\r\n" + //
                            "2: En varios días\r\n" + //
                            "3: Más de la mitad de los días\r\n" + //
                            "4: Casi todos los días)");
        opcion = kb.nextInt();
        if (opcion==1){
            resultado = resultado + 0;
        } if (opcion==2){
            resultado = resultado + 1;
        } if (opcion==3){
            resultado = resultado + 2;
        } if (opcion==4){
            resultado = resultado + 3;
        }

        //Pregunta 8
        System.out.println("¿Se mueve o habla tan despacio que los demás podrían haberlo notado? ¿O tan inquieto o inquieta que se ha movido mucho más de lo habitual?\r\n" + //
                            "1: No en absoluto\r\n" + //
                            "2: En varios días\r\n" + //
                            "3: Más de la mitad de los días\r\n" + //
                            "4: Casi todos los días)");
        opcion = kb.nextInt();
        if (opcion==1){
            resultado = resultado + 0;
        } if (opcion==2){
            resultado = resultado + 1;
        } if (opcion==3){
            resultado = resultado + 2;
        } if (opcion==4){
            resultado = resultado + 3;
        }

        //Pregunta 9
        System.out.println("¿Tines pensamientos de que estarías mejor muerto, o pensamientos de hacerte daño de alguna manera?\r\n" + //
                            "1: No en absoluto\r\n" + //
                            "2: En varios días\r\n" + //
                            "3: Más de la mitad de los días\r\n" + //
                            "4: Casi todos los días)");
        opcion = kb.nextInt();
        if (opcion==1){
            resultado = resultado + 0;
        } if (opcion==2){
            resultado = resultado + 1;
        } if (opcion==3){
            resultado = resultado + 2;
        } if (opcion==4){
            resultado = resultado + 3;
        }

        if(resultado>=0 && resultado<=4){
            System.out.println("Depresión mínima o nula; Vigilar, puede no requerir tratamiento.");
        } else if(resultado>=5 && resultado<=9){
            System.out.println("Depresión leve; Utilizar el juicio clínico (duración de los síntomas, deterioro funcional) para determinar la necesidad de tratamiento.");
        } else if (resultado>=10 && resultado<=14) {
            System.out.println("Depresión moderada; Utilizar el juicio clínico (duración de los síntomas, deterioro funcional) para determinar la necesidad de tratamiento.");
        } else if (resultado>=15 && resultado<=19) {
            System.out.println("Depresión moderadamente grave; Garantiza un tratamiento activo con psicoterapia, medicación o una combinación de ambos.");
        } else if(resultado>=20 && resultado<=27) {
            System.out.println("Depresión grave; Garantiza un tratamiento activo con psicoterapia, medicación o una combinación de ambos.");
        }

        kb.close();
    }

    //Funcionalidad de mensajes motivadores
    public static void mostrarMensajeAleatorio() {
        String[] mensajes = {
            "Cree en ti mismo. Eres capaz de lograr grandes cosas.",
            "Cada día es una nueva oportunidad para ser feliz.",
            "La actitud positiva puede cambiar tu vida.",
            "Nunca es demasiado tarde para perseguir tus sueños.",
            "El esfuerzo constante lleva al éxito.",
            "La felicidad se encuentra en las pequeñas cosas de la vida.",
            "Confía en tu intuición; a menudo sabe lo que es mejor para ti.",
            "El fracaso es solo una oportunidad para empezar de nuevo de manera más inteligente.",
            "Sé amable contigo mismo y con los demás.",
            "La vida es un regalo; vívela al máximo.",
            "El éxito es un viaje, no un destino.",
            "Aprende de ayer, vive para hoy, espera para mañana.",
            "La paciencia y la perseverancia son clave para el éxito.",
            "Sé agradecido por lo que tienes.",
            "Las metas son el camino hacia tus sueños.",
            "Nunca dejes de aprender.",
            "La pasión y la determinación son poderosas.",
            "Hoy es el primer día del resto de tu vida.",
            "Sé la mejor versión de ti mismo.",
            "El optimismo es la clave de la felicidad.",
            "Tu actitud determina tu dirección.",
            "Eres más fuerte de lo que piensas.",
            "Las oportunidades están en todas partes si las buscas.",
            "No te rindas; los milagros suceden todos los días.",
            "Cada día es una oportunidad para aprender algo nuevo.",
            "La felicidad es una elección que haces cada día.",
            "Sé valiente y persigue tus sueños.",
            "El éxito no es definitivo; el fracaso no es fatal: lo que cuenta es el coraje para continuar.",
            "La vida es corta; sonríe a menudo.",
            "No puedes tener un mañana positivo con una mente negativa.",
            "El amor y la amabilidad son contagiosos.",
            "Cree en las posibilidades.",
            "Haz hoy lo que otros no quieren, haz mañana lo que otros no pueden.",
            "La felicidad no es tener lo que quieres, es querer lo que tienes.",
            "La confianza en uno mismo es la clave del éxito.",
            "La perseverancia supera el talento.",
            "Sé agradecido por las lecciones que aprendes de los desafíos.",
            "La gratitud transforma lo que tienes en suficiente.",
            "Sigue tus sueños; ellos saben el camino.",
            "La vida es un regalo precioso; no la malgastes.",
            "Cada día es una página en blanco en tu libro de la vida.",
            "Eres capaz de lograr más de lo que imaginas.",
            "Cada logro comienza con la decisión de intentarlo.",
            "La alegría está en las pequeñas cosas.",
            "La felicidad es una elección que haces todos los días.",
            "Sé la razón por la que alguien sonríe hoy.",
            "La vida es un viaje; disfruta del paseo.",
            "Tú eres la autoridad de tu propia vida.",
            "Sé un imán para las energías positivas.",
            "Tus sueños son la brújula que guía tu alma.",
        };

        // Genera un índice aleatorio.
        Random random = new Random();
        int indiceAleatorio = random.nextInt(mensajes.length);

        // Obtiene el mensaje aleatorio.
        String mensaje = mensajes[indiceAleatorio];

        // Muestra el mensaje en la consola.
        System.out.println(mensaje);
    }
}