
import java.io.*;
import java.util.*;

public interface MyQueue {
	Collection<String> list = new LinkedList<String>();
	Stack<movie> stack = new Stack<movie>();

	public static void movieAdd(movie o) {
		stack.add(o);
	}
	public static movie peekMovie(){
		return stack.peek();
	}
	public static void clearAll() {
	stack.clear();
	}
	 static void removeMovie(String element)
	    {
		 for (int x=0;x<stack.size(); x++)
			 if (stack.equals(element))
					 stack.pop();
}
	 public static boolean isEmpty() {
		 return stack.isEmpty();
	 }
	 public static void pushMovie(movie o) {
		 stack.push(o);
	 }
	 public static int size() {
		 return stack.size();
	 }
}


