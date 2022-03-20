package com.lunacollient.www.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lunacollient.www.entity.User;

/**
* ユーザー情報 Controller
*/
@Controller
public class EchichiController {

	  /**
	   * ユーザー情報一覧画面を表示
	   * @param model Model
	   * @return ユーザー情報一覧画面
	   */
//	  @GetMapping(value = "/user/list")
//	  public String displayList(Model model) {
//	    List<User> userlist = userService.searchAll();
//	    model.addAttribute("userlist", userlist);
//	    return "user/list";
//	  }
}
