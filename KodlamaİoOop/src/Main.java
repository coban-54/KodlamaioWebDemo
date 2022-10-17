import KodlamaİoOop.Core.loging.DataBaseLoger;
import KodlamaİoOop.Core.loging.FileLogger;
import KodlamaİoOop.Core.loging.Logger;
import KodlamaİoOop.DataAccess.KursDataAccess.Hibernate;
import KodlamaİoOop.DataAccess.KursDataAccess.KursDao;
import KodlamaİoOop.business.KursManager;
import KodlamaİoOop.entities.Concrete.Kurs;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Kurs kurs1 = new Kurs(1,"JavaPrograming",213213);
		Logger[] loggers = {new DataBaseLoger(),new FileLogger()};
		
		
		KursManager kursManager = new KursManager(new Hibernate(), loggers);
		kursManager.Add(kurs1);
		
	}

}
