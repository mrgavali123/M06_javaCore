package org.tnsif.interfaceexecuter;
//Driver Class
public class InterfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//We cannot create a object of interface class
		//Sony s = new Sony();
		
		SonyTV s = new SonyTV();
		s.display();
		s.show();
		sony.accept();
		
		Isro i = new Isro();
		i.status();
		
		Human h = new Human();
		h.showDrink();

	}

}