package jp.co.systena.tigerscave.tatakau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public  class TatakauController {




  @RequestMapping(value = "/makenai", method = RequestMethod.GET) // URLとのマッピング
  public ModelAndView makenai(ModelAndView mav) {

//     Map<Integer, Item> syokugyouList = listService.getItemList();
//
//     mav.addObject("syokugyouList", itemList);
//
       mav.setViewName("tatakau");

     return mav;
  }
 }
