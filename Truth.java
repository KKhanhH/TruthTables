public class Truth {
  public static void main (String[] args) {
	truthTables(true,true,true);
	truthTables(true,true,false);
	truthTables(true,false,true);
	truthTables(true,false,false);
	truthTables(false,true,true);
	truthTables(false,true,false);
	truthTables(false,false,true);
	truthTables(false,false,false);
	}
	public static void truthTables(boolean A,boolean B, boolean C){
	//replace value of x with expression
	boolean x=A&&!C||!A&&!B&&C;
	System.out.println(A+" "+B+" "+C+"="+x);
	}
}