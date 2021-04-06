package lambda;

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

/* lambda expressions acts on stream(parallel stream for huge data) it can have
 * any number of Intermediate operations--- 
 * sorted, distinct,filter, skip, map,flatMap ,anyMatch, findFirst
 * one terminal opertaion (forEach, Collector or reduce)
 * Reduce operations-count, min, max, reduce, summaryStatistics
 * 
 */
public class ArrowFuncions {


			public static void main(String[] args) throws IOException {
				// 1. Integer Stream
			IntStream.
			range(1, 10).
			forEach(System.out::print);
			System.out.println();
			System.out.println("1-----------");
				// 2. Integer Stream with skip
			IntStream.
			range(1, 11).
			skip(5).
			forEach(System.out::println);
			System.out.println("2-----------");
				
				// 3. Integer Stream with sum
			System.out.println(
					IntStream.
					range(1, 5).
					sum()
			);
			System.out.println("3-----------");
					
				// 4. Stream.of, sorted and findFirst
			Stream.of("Apple","Ajay","Ball").
			sorted().
			findFirst().
			ifPresent(System.out::print); 
			System.out.println("4-----------");
			
				// 5. Stream from Array, sort, filter only names starting s and print
				String[] names = {	"Apple","Ajay", "Sally","Ball", "Smitha"};
				Arrays.stream(names).
					filter(x -> x.startsWith("s")).
					sorted().
					forEach(System.out::print);
				System.out.println("5-----------");
				
				
				// 6. average of squares of an int array
				int[] numbers = {1, 2, 4, 5};
				Arrays.stream(numbers)
					.map(x -> x*x)
					.average()
					.ifPresent(System.out::print);
				
				System.out.println("6-----------");
				
						
				// 7. Stream from List, filter names starting a and print
				Stream.of("Apple","Ajay", "Sally","Ball", "Smitha")
				.map(x -> x.toLowerCase())
				.filter(x -> x.startsWith("a"))
				.forEach(System.out::println);
				
				System.out.println("7-----------");
								
								
				
			}
		}
	