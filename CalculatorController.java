package edu.learningController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.learningController.SimpleCalculator;

public class CalculatorController {
	private static final String Calculator = null;

	@GetMapping("/calculator/add")		//using @GetMapping mapping HTTP GET requests onto handle method
	public String calculate1(@RequestParam(value = "a",required = true,defaultValue = "1") int a,
		@RequestParam(value = "b",required = true,defaultValue = "2" )int b
		)							//using @RequestParam exact data pass from custom data
	{
		return "<h1>The addition is"+SimpleCalculator.addition(a, b)+"</h1>";
	}
								// return SimpleCalculator
	
	@GetMapping("/calculator/sub")	//using @GetMapping mapping HTTP GET requests onto handle method
	public String calculate2(@RequestParam(value = "a",required = true,defaultValue = "1") int a,
		@RequestParam(value = "b",required = true,defaultValue = "2" )int b
		)
	{
		return "<h1>The substraction is "+ SimpleCalculator.substraction(a, b)+"</h1>";
	}
	
	@GetMapping("/calculator/mul")	//using @GetMapping mapping HTTP GET requests onto handle method
	public String calculate3(@RequestParam(value = "a",required = true,defaultValue = "1") int a,
		@RequestParam(value = "b",required = true,defaultValue = "2" )int b
		)
	{
		return "<h1>The multiplication is "+ SimpleCalculator.multiplication(a, b)+"</h1>";
	}
	
	
	@GetMapping("/calculator/div")	//using @GetMapping mapping HTTP GET requests onto handle method
	public String calculate4(@RequestParam(value = "a",required = true,defaultValue = "1") int a,
			@RequestParam(value = "b",required = true,defaultValue = "2" )int b
			)
	{
	return "<h1>The division is "+ SimpleCalculator.division(a, b)+"</h1>";
	}


}
