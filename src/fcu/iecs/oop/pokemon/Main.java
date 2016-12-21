package fcu.iecs.oop.pokemon;

public class Main {
	public static void main(String[] args)
	{
		Psyduck psyduck = new Psyduck("My First Psyduck", PokemonType.WATER,100);
		psyduck.attack();
		
		Charmander charmander = new Charmander("My First Charmander", PokemonType.FIRE, 456);
		charmander.attack();
		
		Bulbasaur bulbasaur = new Bulbasaur("My First Bulbasaur", PokemonType.GRASS, 589);
		bulbasaur.attack();
	}

}