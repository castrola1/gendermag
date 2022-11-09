
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class display implements MyQueue {

	public static void main(String[] args) throws IOException {
	
		// values[0]id, values[1]name , values[2]year , values[3]rate 
		String path = "C:/Users/lais/Desktop";
		ArrayList<movie> movies = filemanager.readMovieArray(path);
		List<movie> list = filemanager.readMovieList(path);

		
}

}

