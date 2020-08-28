package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */

//first test
//하늘에 계신 우리 아버지여
//이름이 거룩히 여김을 받으시오며
//나라에 임하옵시며
//뜻이 하늘에서 임한것 같이 땅에서도 이루어지이다.
//오늘날 우리에게 일용할 양식을 주시고
//우리가 우리에게 죄 지은 자를 용서한 것 같이
//우리의 죄를 사하여 주옵시고
//우리를 시험에 들게 하지 마옵시고
//다만 악에서 구하옵소서.
//대개 나라와 권세와 영광이 영원히 있사옵나이다.
//부디 굽어 살피시어 우리의 프로젝트가 대박이 나게 해주시옵소서.
//아멘.


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
