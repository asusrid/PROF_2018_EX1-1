package asusrid.examen;

public class MyString {

	MyString palabra1;

	public MyString(MyString palabra1) {
		this.palabra1 = palabra1;
	}

	public MyString getPalabra1() {
		return palabra1;
	}

	public void setPalabra1(MyString palabra1) {
		this.palabra1 = palabra1;
	}

	public int compareTo(MyString p2) {

		String s2 = p2.toString();
		
		for (int i = 0; i < this.toString().length() && i < s2.length(); i++) {
			if ((int) this.toString().charAt(i) == (int) s2.charAt(i)) {
				continue;
			} else {
				return (int) this.toString().charAt(i) - (int) s2.charAt(i);
			}
		}

		if (this.toString().length() < s2.length()) {	
			return (this.toString().length() - s2.length());	
		} else if (this.toString().length() > s2.length()) {
			return (this.toString().length() - s2.length());
		} else {
			return 0;
		}

	}
}
