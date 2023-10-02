package c2tc;
import java.util.*;
public class Constructor {
	public Constructor(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	String name;
	int rollNo;

	public static void main(String[] args)
	{
		Constructor cp1=new Constructor("hgfg",78);
		Constructor cp2=new Constructor("wbbhdhvftdari",79);
		
		System.out.println("Name::"+cp1.name);
		System.out.println("RollNo::"+cp1.rollNo);
		System.out.println("Name::"+cp2.name);
		System.out.println("RollNo::"+cp2.rollNo);

	}

}
