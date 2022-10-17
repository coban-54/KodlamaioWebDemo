package KodlamaİoOop.DataAccess.KursDataAccess;

import KodlamaİoOop.entities.Concrete.Kurs;

public class Hibernate implements KursDao {

	@Override
	public void Add(Kurs kurs) {
		System.out.println("Hibernate ile eklendi.");
		
	}

}
