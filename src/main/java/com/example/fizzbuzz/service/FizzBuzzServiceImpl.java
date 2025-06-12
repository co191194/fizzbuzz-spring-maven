package com.example.fizzbuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * FizzBuzz画面のサービスの実装クラスです。
 */
@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

	@Override
	public List<String> getResult(int number) {
		
		List<String> result = new ArrayList<>();
		for(int i = 1; i <= number; ++i) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
			} else if (i % 3 == 0) {
				result.add("Fizz");
			} else if (i % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(String.valueOf(i));
			}
		}

		return result;
	}

}
