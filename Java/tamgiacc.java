package tamgiac;
public class tamgiacc {
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a>0 ? a : 0;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b>0 ? b:0;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c>0 ? c : 0;
	}
	public tamgiacc(int a, int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}
	public int chuvi() {
		return a+b+c;
	}
	public double dientich() {
		int x = chuvi();
		float p = (float)x/2;
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	@Override
	public String toString() {
		return String.format("thong tin 3 canh: a=%d, b=%d, c=%d\nchu vi: %d\ndien"
				+ " tich: %f", a,b,c,chuvi(),dientich());
	}
	
	
}
