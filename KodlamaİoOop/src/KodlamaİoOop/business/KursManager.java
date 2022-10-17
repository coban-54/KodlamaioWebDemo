package KodlamaİoOop.business;

import java.util.ArrayList;
import java.util.List;

import KodlamaİoOop.Core.loging.Logger;
import KodlamaİoOop.DataAccess.KursDataAccess.KursDao;
import KodlamaİoOop.entities.Concrete.Kurs;

public class KursManager {
	private KursDao _kursDao;
	private Logger[] loggers;
	
	public KursManager(KursDao _kursDao, Logger[] loggers) {
		this._kursDao = _kursDao;
		this.loggers = loggers;
	}
	List<Kurs> kurslar = new ArrayList<>();
	
	public void Add(Kurs kurs)throws Exception {
		for (Kurs k : kurslar) {
			if (k.getName()==kurs.getName()) {
				throw new Exception("Kurs ismi mevcuttur.");
			}
		}
		if (kurs.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		_kursDao.Add(kurs);
		for (Logger l : loggers) {
			l.Log(kurs.getName());
		}
		
	}
	
	
	
	
}
