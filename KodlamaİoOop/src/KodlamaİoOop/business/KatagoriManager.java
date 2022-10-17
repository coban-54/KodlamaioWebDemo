package KodlamaİoOop.business;

import java.util.ArrayList;
import java.util.List;

import KodlamaİoOop.Core.loging.Logger;
import KodlamaİoOop.DataAccess.KatagoriDataAccess.KatagoriDao;
import KodlamaİoOop.entities.Concrete.Katagori;

public class KatagoriManager {
	private KatagoriDao katagoriDao;
	private Logger[] loggers;
	public KatagoriManager(KatagoriDao katagoriDao, Logger[] loggers) {
		this.katagoriDao = katagoriDao;
		this.loggers = loggers;
	}
	List<Katagori> katagoriler=new ArrayList<>();
	public void Add(Katagori katagori) throws Exception{
		for (Katagori k : katagoriler) {
			if (k.getName()== katagori.getName()) {
				throw new Exception("Kategori adı aynı olamaz");
			}
		}
		katagoriDao.Add(katagori);
		for (Logger logger : loggers) {
			
			logger.Log(katagori.getName());
		}
	}
	
}
