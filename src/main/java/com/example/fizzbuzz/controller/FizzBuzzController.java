package com.example.fizzbuzz.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.fizzbuzz.form.FizzBuzzForm;
import com.example.fizzbuzz.service.FizzBuzzService;

import lombok.RequiredArgsConstructor;

/**
 * FizzBuzz画面のコントローラーです。
 */
@Controller
@RequestMapping("/fizzbuzz")
@RequiredArgsConstructor
public class FizzBuzzController {
	
	private final FizzBuzzService fizzBuzzService;
	
	/**
	 * FizzBuzz画面を表示します。
	 * 
	 * @param fizzBuzzForm FizzBuzzのフォーム
	 * @return FizzBuzz画面
	 */
	@GetMapping
	public String index(FizzBuzzForm fizzBuzzForm) {
		return "fizzbuzz";
	}
	
	/**
	 * FizzBuzzの結果を取得します。
	 * 
	 * @param fizzBuzzForm FizzBuzzのフォーム
	 * @param br BindingResult
	 * @param model Model
	 * @return FizzBuzz画面
	 */
	@PostMapping("/result")
	public String getResult(@Validated FizzBuzzForm fizzBuzzForm, BindingResult br, Model model) {
		
		// バリデーションチェックエラーがある場合は、エラーメッセージを表示
		if (br.hasErrors()) {
			return "fizzbuzz";
		}
		
		List<String> result = fizzBuzzService.getResult(fizzBuzzForm.getNumber());
		model.addAttribute("result", result);
		return "fizzbuzz";
	}
}
