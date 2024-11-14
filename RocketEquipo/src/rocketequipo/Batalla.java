/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocketequipo;

import java.util.Scanner;

public class Batalla {

    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public Batalla(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡La batalla ha comenzado!");
        System.out.println(pokemon1.getNombre() + " vs. " + pokemon2.getNombre());

        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. " + pokemon1.getNombre() + " Atacar");
            System.out.println("2. " + pokemon2.getNombre() + " Atacar");
            System.out.println("3. Finalizar la batalla");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarAtaque(pokemon1, pokemon2);
                    break;
                case 2:
                    realizarAtaque(pokemon2, pokemon1);
                    break;
                case 3:
                    System.out.println("La batalla ha finalizado.");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, elige de nuevo.");
            }

            // Mostrar el estado actual de cada Pokémon
            mostrarEstado();
        }

        // Determinar el ganador
        if (pokemon1.getSalud() <= 0 && pokemon2.getSalud() <= 0) {
            System.out.println("¡La batalla ha terminado en empate!");
        } else if (pokemon1.getSalud() <= 0) {
            System.out.println("¡" + pokemon2.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println("¡" + pokemon1.getNombre() + " ha ganado la batalla!");
        }
    }

    private void realizarAtaque(Pokemon atacante, Pokemon defensor) {
        double multiplicador = atacante.getTipo().obtenerMultiplicadorDeDanio(atacante.getTipo(), defensor.getTipo());
        double danio = atacante.getPuntosDeAtaque() * multiplicador;
        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " con un daño de " + danio);

        // Reducir la salud del defensor
        defensor.setSalud(defensor.getSalud() - danio);

        // Verificar si el defensor ha sido derrotado
        if (defensor.getSalud() <= 0) {
            System.out.println(defensor.getNombre() + " ha sido derrotado.");
        }
    }

    private void mostrarEstado() {
        System.out.println("\nEstado actual:");
        System.out.println(pokemon1.getNombre() + " - Salud: " + Math.max(pokemon1.getSalud(), 0));
        System.out.println(pokemon2.getNombre() + " - Salud: " + Math.max(pokemon2.getSalud(), 0));
    }
}
