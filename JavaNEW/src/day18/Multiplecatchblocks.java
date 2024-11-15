package day18;

public class Multiplecatchblocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=null;
        try {
        	System.out.println(s.length());
        }
        catch(Exception e) {
        	System.out.println("This is null");
        	System.out.println(e.getMessage());
        }
	}

}
