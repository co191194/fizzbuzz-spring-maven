package com.example.fizzbuzz.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FizzBuzzForm {

	@Max(100)
	@Min(1)
	@NotNull
	private Integer number;
}
