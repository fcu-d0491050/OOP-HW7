package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon
{
	public Charmander(String name, PokemonType type, int cp)
	{
		super(name,type,cp);
	}
	public void attack()
	{
		System.out.println("Ember...");
	}
}
