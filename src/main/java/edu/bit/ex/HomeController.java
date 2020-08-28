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
//�ϴÿ� ��� �츮 �ƹ�����
//�̸��� �ŷ��� ������ �����ÿ���
//���� ���Ͽɽø�
//���� �ϴÿ��� ���Ѱ� ���� �������� �̷�����̴�.
//���ó� �츮���� �Ͽ��� ����� �ֽð�
//�츮�� �츮���� �� ���� �ڸ� �뼭�� �� ����
//�츮�� �˸� ���Ͽ� �ֿɽð�
//�츮�� ���迡 ��� ���� ���ɽð�
//�ٸ� �ǿ��� ���ϿɼҼ�.
//�밳 ����� �Ǽ��� ������ ������ �ֻ�ɳ��̴�.
//�ε� ���� ���ǽþ� �츮�� ������Ʈ�� ����� ���� ���ֽÿɼҼ�.
//�Ƹ�.


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
