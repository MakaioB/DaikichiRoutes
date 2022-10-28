package com.makaio.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String welcome() {
		return "Welocome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/today/{name}")
	public String personalToday(@PathVariable("name") String name) {
		return "You feel very lucky today, " + name + "!";
	}
	
	@RequestMapping("/tomorrow/{name}")
	public String personalTomorrow(@PathVariable("name") String name) {
		return name + ", you should be excited for tomorrow! Good things are coming!";
	}
	
	@RequestMapping("/travel/{city}")
	public String travelToCity(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near fucture, but be weary of tempting offers!";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends!";			
		}
	}
}
