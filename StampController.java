package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StampController {

	@RequestMapping(value = "/stamp", method = RequestMethod.GET)
	public ModelAndView stamp(ModelAndView mav) {
		mav.addObject("test", "1");
		mav.setViewName("stamp");
		return mav;

	}

	@RequestMapping(value = "/stamp/arcamera", method = RequestMethod.GET)
	public ModelAndView arcamera(ModelAndView mav) {
		mav.addObject("user", "user");
		mav.setViewName("arcamera3");
		return mav;

	}

	@RequestMapping(value = "/stamp/stampget/*/{num}", method = RequestMethod.GET)
	public ModelAndView stampget(@PathVariable String num, ModelAndView mav) {
		mav.addObject("num", num);
		mav.setViewName("stampget");
		return mav;

	}

	@RequestMapping(value = "mypage/comment/{num}", method = RequestMethod.GET)
	public ModelAndView comment(@PathVariable String num, ModelAndView mav) {
		mav.addObject("num", num);
		mav.setViewName("comment");
		return mav;

	}

	@RequestMapping(value = "mypage/comment/thankyou/{num}", method = RequestMethod.POST)
	public ModelAndView commentpost(@PathVariable String num, @RequestParam("eval") int eval,
			@RequestParam("comment") String comment, ModelAndView mav) {
		mav.addObject("eval", eval);
		mav.addObject("comment", comment);
		mav.setViewName("commentget");
		return mav;

	}

}
