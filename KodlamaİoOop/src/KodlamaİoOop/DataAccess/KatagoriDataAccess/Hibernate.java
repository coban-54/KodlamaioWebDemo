package KodlamaİoOop.DataAccess.KatagoriDataAccess;

import KodlamaİoOop.entities.Concrete.Katagori;

public class Hibernate implements KatagoriDao{

	public void Add(Katagori katagori) {
		System.out.println("Hibernate ile güncellendi");
	}
	
}
