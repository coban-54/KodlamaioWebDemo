package KodlamaİoOop.DataAccess.KatagoriDataAccess;


import KodlamaİoOop.entities.Concrete.Katagori;

public class Jdbc implements KatagoriDao {

	@Override
	public void Add(Katagori katagori) {
		System.out.println("Jdbc ile güncellendi");
		
	}

}
