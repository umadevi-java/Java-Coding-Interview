package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FromFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String bandsFile = "D:\\eclipse\\Interview\\Exercise\\src\\lambda\\Bands.txt";
		String dataCSV = "D:\\eclipse\\Interview\\Exercise\\src\\lambda\\data.csv";
		// 8. Stream rows from text file, sort, filter >10, and print
		Stream<String> bands =Files.lines(Paths.get(bandsFile) );
		bands
			.filter(x -> x.length() >10)
			.sorted()
			.forEach(System.out::println);
		
		bands.close();
		
		System.out.println(" 8 ............");
			
		// 9. Stream rows from text file,filter with name containing jit and save to List
	// The same above functionality but prints the count of rows
		Stream<String> rows = Files.lines(Paths.get(bandsFile));
		int rowCount = (int) rows.filter(x -> x.length() >10).count();
		System.out.println("Count of rows "+rowCount);
		System.out.println(" 9 ............");
				
		// 10. Stream rows from CSV file and exclude a line without data
		Stream<String> rows1 = Files.lines(Paths.get(dataCSV));
		rows1
			.map(x -> x.split(","))
			.filter(x -> x.length ==3)
			.forEach(x -> System.out.println(Arrays.toString(x)));
		rows1.close();				
		System.out.println(" 10 ............");	
				
		// 11. Stream rows from CSV file, filter data when the second column is >15 from rows
		Stream<String> rows2 = Files.lines(Paths.get(dataCSV));
		rows2
			.map(x -> x.split(","))
			.filter(x -> x.length ==3)
			.filter(x -> Integer.parseInt(x[1]) >15)
			.forEach(x -> System.out.println(Arrays.toString(x)));
		
		rows2.close();
				
		System.out.println(" 11 ............");	
		
		// 12. Stream rows from CSV file, store fields in HashMap
		Stream<String> rows3 = Files.lines(Paths.get(dataCSV));
		Map<String, Integer> map = new HashMap<>();
		map = rows3	
				.map(x -> x.split(","))
				.filter(x -> x.length == 3)
				.filter(x -> Integer.parseInt(x[1]) > 15)
				.collect(Collectors.toMap(
						x -> x[0],
						x -> Integer.parseInt(x[1])
						)); // store it in any variable(here it is a map, while using collect
		System.out.println(" 11 ............"+map.size());	
		for(String key: map.keySet() ) {
			System.out.println(key +"  " + map.get(key));
		}
		rows3.close();
					
	}

}
