package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StringinFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String data = "D:\\eclipse\\Interview\\Exercise\\src\\lambda\\Bands.txt";
		
		Stream<String> rows = Files.lines(Paths.get(data));
		boolean present = rows
			
			.anyMatch(x -> x.contains("jit"));
		System.out.println("Is it present ?"+present);
		
		
		//another method
		Stream<String> rows1 = Files.lines(Paths.get(data));
		long count = rows1
				.filter(x -> x.contains("jit")).count();
		if(count == 0)System.out.println("Pattern not found");
		else {System.out.println("Pattern  found");}
		rows.close();
		rows1.close();

	}

}
