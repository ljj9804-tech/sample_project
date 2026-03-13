package com.busanit501.sample_project.apply.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apply") // 공통 주소: http://localhost:8080/apply
public class ApplyController {

    @GetMapping("/info") // 상세 주소: http://localhost:8080/apply/info
    public String getInfoPage() {
        // 리턴하는 문자열은 templates 폴더 아래의 html 파일 경로와 이름입니다.
        // templates/apply/info.html 파일을 찾아갑니다.
        return "apply/info";
    }
}