package chp4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AlignList {

	// int 타입 배열을 순서대로 정렬하기  
	//@Test
	public void sortInts() {
		final int[] numbers = {-3, -5, 1, 7, 4, -2};
		final int[] expected = {-5, -3, -2, 1, 4, 7};
		
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	// 객체를 순서대로 정렬하기  
	@Test
	public void sotObjects() {
		final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
		final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};
		
		Arrays.sort(strings);
		assertArrayEquals(expected, strings);
	}
	
	
}
