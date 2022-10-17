package KodlamaİoOop.Core.loging;

public class DataBaseLoger implements Logger{

	@Override
	public void Log(String data) {
		System.out.println("Veri tabanına koglandı"+data);
		
	}

}
