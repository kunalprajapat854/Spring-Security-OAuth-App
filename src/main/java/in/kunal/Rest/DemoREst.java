package in.kunal.Rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoREst {
	
	@GetMapping("/")
	public String getMsg() {
		return "Welcome to Open authetication Security";
	}
	
	

	

}
