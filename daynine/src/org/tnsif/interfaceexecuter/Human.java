package org.tnsif.interfaceexecuter;

public class Human implements ColdDrinks, AlcoholDrinker {

	@Override
	public void showDrink() {
		// TODO Auto-generated method stub
		System.out.println(ColdDrinkName+" "+AlcoholType+" "+brand);
	}

}
