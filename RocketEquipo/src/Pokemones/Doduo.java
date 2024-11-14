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
public class Doduo extends Pokemon {
    
    public Doduo(String nombre, double salud, double puntosDeAtaque, TipoPokemon tipo, EstadoPokemon estado) {
        super("Doduo", 35, 85, tipo.NORMAL_VOLADOR, estado.NORMAL);
    }
    
}
