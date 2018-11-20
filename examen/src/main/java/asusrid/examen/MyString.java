package asusrid.examen;

public class MyString {

	String palabra1;

	public MyString(String palabra1) {
		this.palabra1 = palabra1;
	}
	
	public String getPalabra() {
		return palabra1;
	}

	public void setPalabra(String palabra1) {
		this.palabra1 = palabra1;
	}

	public int compareTo(MyString p2) {

		String s2 = p2.getPalabra();
		String s1 = this.getPalabra();
		
		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			if ((int) s1.charAt(i) == (int) s2.charAt(i)) {
				continue;
			} else {
				return (int) s1.charAt(i) - (int) s2.charAt(i);
			}
		}

		if (s1.length() < s2.length()) {	
			return (s1.length() - s2.length());	
		} else if (s1.length() > s2.length()) {
			return (s1.length() - s2.length());
		} else {
			return 0;
		}

	}
}
