package hello;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.Test;

public class SimpleTestCase {

/*	@Test
	public void test() {
		
	    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	    Stream<Integer> stream = numbers.stream();
	    stream.filter((x) -> {
	        return x % 2 == 0;
	    }).map((x) -> {
	        return x * x;
	    }).forEach(System.out::println);

	}

	class NaturalSupplier implements Supplier<Long> {

	    long value = 0;

	    public Long get() {
	        this.value = this.value + 1;
	        return this.value;
	    }
	}*/
	
	@Test
	public void test() {
		
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		costBeforeTax.stream().map((cost) -> cost + .113*cost)
		                      .forEach(System.out::println);
	}

}
