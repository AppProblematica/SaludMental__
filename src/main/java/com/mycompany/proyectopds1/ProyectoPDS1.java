/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopds1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Gómez
 */
public class ProyectoPDS1 {
    

    public static void main(String[] args) {
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
        JOptionPane.showMessageDialog(null, mensaje, "Título del mensaje", JOptionPane.INFORMATION_MESSAGE);
        
        InicioSesion x = new InicioSesion();
        x.setVisible(true);
    }
}
