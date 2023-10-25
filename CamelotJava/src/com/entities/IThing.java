package com.entities;

public interface IThing<T> {
	public enum ThingNames{
		/* Characters*/jojo,guard,king,blacksmith,warlock,bandit,tom, merchant, beggar,
		/* Items*/sword,helmet,Greenpotion, Bluecloth, Coin,
		/*Places*/home,city,camp,castlecrossroad,GreatHall,Spookypath,jail, Port,Ruins
	} 
	public String getName();
	public T getTemplate();
}
