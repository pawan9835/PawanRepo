package com.jio.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jio.model.Address;
import com.jio.model.RelienceJio;
import com.jio.service.RelienceJioService;
import com.jio.utill.RelienceJioChart;

@Controller
public class JioController {
	@Autowired
	private RelienceJioService relienceService;
	@Autowired
	private RelienceJioChart rChart;
	@Autowired
	private ServletContext context;

	@RequestMapping("/jio")
	public String greeting() {

		return "register";
	}

	@RequestMapping("/sub")
	public String test(@ModelAttribute("relianceJio") RelienceJio r) {
		System.out.println("Workinnnnnnnnnnnnnnnnnngggggggggg" + r);

		return "welcome";
	}

	@RequestMapping(value = "/sub111", method = RequestMethod.POST)
	public String saveInformation(@ModelAttribute("relienceJio") RelienceJio rjio,
			@ModelAttribute("address") Address adr, ModelMap map) {
		System.out.println("here");

		System.out.println("data =============================>>>>  " + rjio);
		rjio.setUser_address(adr);

		System.out.println(adr);
		System.out.println(rjio);

		int saveed = relienceService.saveJioSimInfo(rjio);
		System.out.println("*****************Saved**************  " + saveed);
		return "newRegistrationPage";
	}
	
	/*
	 * @RequestMapping(value = "/add") public String
	 * saveInformation(@ModelAttribute("relienceJio") RelienceJio rjio,
	 * 
	 * @ModelAttribute("address") Address adr, ModelMap map) {
	 * System.out.println("here"); rjio.setUser_address(adr);
	 * 
	 * System.out.println(adr); System.out.println(rjio);
	 * 
	 * int saveed = relienceService.saveJioSimInfo(rjio);
	 * System.out.println("*****************Saved**************  " + saveed);
	 * 
	 * return "newRegistrationPage"; }
	 */
	/*
	 * @RequestMapping("/register") public String
	 * saveInformation(@ModelAttribute("relienceJio") RelienceJio rjio, ModelMap
	 * map) { System.out.println(rjio); int saveed =
	 * relienceService.saveJioSimInfo(rjio);
	 * System.out.println("*****************Saved**************  " + saveed);
	 * 
	 * return "newRegistrationPage"; }
	 */

	@RequestMapping("/view")
	public String loadAllData(ModelMap map) {

		List<RelienceJio> usersList = relienceService.loadAllData();
		map.addAttribute("users_data", usersList);

		System.out.println("hellow wwwwww ******************  " + usersList);
		return "welcome";
	}

	@RequestMapping("/report")
	public String relianceJioReport() {
		List<Object[]> ob = relienceService.loadDatabyStateArea();
		String path = context.getRealPath("/");
		// EmployeeUtill emUtill=new EmployeeUtill();

		System.out.println("inside of Controller )))))))))))))");
		rChart.chartGenerator(path, ob);
		return "welcome";

	}

}
