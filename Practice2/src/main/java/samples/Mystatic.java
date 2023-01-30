package samples;

public class Mystatic {
	private static int data;
	private static int mydata;
	public static int getData() {
		return data;
	}
	public static void setData(int data) {
		Mystatic.data = data;
	}
	public static int getMydata() {
		return mydata;
	}
	public static void setMydata(int mydata) {
		Mystatic.mydata = mydata;
	}
	
}
