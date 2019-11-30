package jp.co.systena.tigerscave.tatakau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TatakauController {

	// キャラ作成画面を送る
	@RequestMapping(value = "/create/chara", method = RequestMethod.GET)
	public ModelAndView getMakenai(ModelAndView mav) {



		mav.setViewName("tatakau");
		return mav;
	}

	@RequestMapping(value = "/create/", method = RequestMethod.GET)

	// 送られてきたキャラクター情報と敵の情報保存してから、キャラクター一覧画面を送る



	// キャラクターこうげき画面を送る

	// キャラクターかいふく画面を送る





//  @Autowired
//  HttpSession session; // セッション管理
//
//
//  @RequestMapping(value = "/makenai", method = RequestMethod.GET) // URLとのマッピング
//  public ModelAndView getMakenai(ModelAndView mav) {
//
//    // Map<Integer, Item> syokugyouList = listService.getItemList();
//    //
//    // mav.addObject("syokugyouList", itemList);
//    //
//    mav.setViewName("tatakau");
//
//    return mav;
//  }
//
//  @RequestMapping(value = "/makenai", method = RequestMethod.POST) // URLとのマッピング
//  public ModelAndView postMakenai(ModelAndView mav) {
//
//
//    // ここでリクエストの内容を確認する。
//
//
//    // 問題なければセッションにリクエストパラメーターを入れる。
//
//
//    // 値を返す。
//    // テンプレートを呼び出す。
//
//    //
//
//
//
//    // Map<Integer, Item> syokugyouList = listService.getItemList();
//    //
//    // mav.addObject("syokugyouList", itemList);
//    //
//    mav.setViewName("tatakau");
//
//    return mav;
//  }
}
