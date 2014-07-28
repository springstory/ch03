package com.springstory.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springstory.service.MemberService;
import com.springstory.vo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/member.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		String name = memberService.getMemberName(1);
		model.addAttribute("name", name);
		return "member";
	}

	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public String registerForm() {
		return "register";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginForm() {
		return "login";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(Member member, Model model) {
		Member memberInfo = memberService.login(member);
		if (memberInfo == null) {
			return "login";
		} else {
			model.addAttribute("username", memberInfo.getName());
			return "index";
		}
	}
}
