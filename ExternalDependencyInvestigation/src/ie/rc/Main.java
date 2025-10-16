package ie.rc;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;

public class Main {

	public static void main(String[] args) {

		//System.out.println("External Dependency Investigation");
		
		String ascii = "";
		try {
			
			ascii = FigletFont.convertOneLine("SQLite Investigation");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ascii);
		

	}

}
