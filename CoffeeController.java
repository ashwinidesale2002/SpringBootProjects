package ProjectController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ProjectCoffee.Coffee;
@RestController     //This  annotation is applied to a class to mark it as a request handler.
public class CoffeeController {
	private List<Coffee> coffee = new ArrayList<>();		//create a List
	
	public CoffeeController() {
		coffee.addAll(List.of(				
				
				new Coffee("Black",200.30),					//enter the elements in the list
				new Coffee("Nescafe",100.00),	
				new Coffee("Nestle",20.00),
				new Coffee("Family",50.00),
				new Coffee("Red",80.00)
				
				));
	}
	@GetMapping("/cofee")					//using @GetMapping mapping HTTP GET requests onto handle method
		Iterable<Coffee> getAllCoffee(){
			return coffee;
		
	    }
	
}