package ie.pt;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;

public class Main {

	public static void main(String[] args) {

		try {
			String ascii = FigletFont.convertOneLine("Hello");
			
			System.out.println(ascii);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
