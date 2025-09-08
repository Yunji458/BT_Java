package com.ohgiraffers.chap02;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MethodMappingTestController {
    
    /* 설명. 핸들러 메소드는 어노테이션으로 요청을 매핑히고 반환하는 문자열로 view를 선택한다. */
//    @RequestMapping(value="/menu/regist")       // GET 요청 뿐 아니라 다른 요청도 받을 수 있음
    @RequestMapping(value="/menu/regist", method= RequestMethod.GET)
    public String registMenu(Model model) {
        System.out.println("/menu/regist 경로의 요청 받아보기");

        model.addAtttribute("message", "신규 메뉴 등록용 핸들러 메소드 호출함...");

        return "mappingResult";   // view 의 이름(view가 될 html의 이름 )
    }

    @RequestMapping(value="/menu/modify", method=RequestMethod.POST)
    public String modifyMenu(Model model) {
        model.addAttribute("message", "POST 방식의 메뉴 수정용 핸들러 메소드 호출함...");

        return "mappingResult";
    }
}
