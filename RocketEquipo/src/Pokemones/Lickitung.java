/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemones;

import rocketequipo.EstadoPokemon;
import rocketequipo.Pokemon;
import rocketequipo.TipoPokemon;


/**
 *
 * @author USUARIO
 */
public class Lickitung extends Pokemon {
    
    public Lickitung(String nombre, double salud, double puntosDeAtaque, TipoPokemon tipo, EstadoPokemon estado) {
        super("Lickitung", 90, 55, tipo.NORMAL, estado.NORMAL);
    }
    
}
