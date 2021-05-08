package src.LeetCode;

import java.util.concurrent.ConcurrentHashMap;

public class CheggIndia {
	
	public static void fun(int x)
	{
		++x;
		x++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap chm = new ConcurrentHashMap();
		chm.put(1, "Welcome");
		chm.put(2, "to");
		chm.put(3, "Java");
		chm.put(4, "World");
		chm.putIfAbsent(3, "World");
		System.out.println("Elements: " + chm);
	}

}
