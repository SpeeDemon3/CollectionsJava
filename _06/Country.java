package _06;

public class Country {
	
	private String code, name, capital;

	public Country(String code, String name, String capital) {
		super();
		this.code = code;
		this.name = name;
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", capital=" + capital + "]";
	}
	
	

}
