package com.example.fizzbuzz.service;

import java.util.List;

/**
 * FizzBuzz画面のサービスのインターフェースです。
 */
public interface FizzBuzzService {

	/**
	 * FizzBuzzの結果を取得します。
	 * 
	 * @param number
	 * @return
	 */
	List<String> getResult(int number);
}
