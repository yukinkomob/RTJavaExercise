package com.example.demo.trySpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 基本的なコントローラクラス
 *
 */
@Controller
public class HelloController {

	/**
	 * 文字列を返す
	 * @return
	 */
	@GetMapping("/hello")
	public String getHello() {
		// hello.htmlに画面遷移
		return "hello";
	}
}
