
public class CompareVersionTestDrive {

	public static void main(String[] args) {
		
		Assignment4 c = new Assignment4();
		
		String v1 = "1.2.3.0";
		String v2 = "1.2.4";
		
		int result = c.compareVersion(v1, v2);
		System.out.println(result);

	}

}
