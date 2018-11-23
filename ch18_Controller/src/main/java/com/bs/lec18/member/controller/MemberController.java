package com.bs.lec18.member.controller;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.lec18.member.Member;
import com.bs.lec18.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	// MemberService service = new MemberService();
	// @Autowired
	@Resource(name = "memService")
	MemberService service;

	@RequestMapping(value = "/memJoin", method = RequestMethod.POST)
	public String memJoin(@ModelAttribute("mem") Member member) {

		service.memberRegister(member.getMemId(), member.getMemPw(), member.getMemMail(), member.getMemPhone1(),
				member.getMemPhone2(), member.getMemPhone3());

		return "memJoinOk";
	}

	@RequestMapping(value = "/memLogin", method = RequestMethod.POST)
	public String memLogin(Model model, @RequestParam("memId") String memId, @RequestParam("memPw") String memPw) {

		// String memId = request.getParameter("memId");
		// String memPw = request.getParameter("memPw");

		Member member = service.memberSearch(memId, memPw);

		try {
			model.addAttribute("memId", member.getMemId());
			model.addAttribute("memPw", member.getMemPw());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "memLoginOk";
	}

}