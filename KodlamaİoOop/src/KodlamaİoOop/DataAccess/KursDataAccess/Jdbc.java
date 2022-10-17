package KodlamaİoOop.DataAccess.KursDataAccess;

import KodlamaİoOop.entities.Concrete.Kurs;

public class Jdbc implements KursDao {

	@Override
	public void Add(Kurs kurs) {
		System.out.println("Jdbc ile eklendi");
		
	}

}
