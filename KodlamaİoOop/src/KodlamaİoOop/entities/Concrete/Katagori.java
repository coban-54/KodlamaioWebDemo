package KodlamaİoOop.entities.Concrete;

public class Katagori {
	private int id;
	private String name;

	public Katagori() {
	}

	public Katagori(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
