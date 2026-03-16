package com.busanit501.sample_project.apply.controller;

import com.busanit501.sample_project.apply.dto.ApplyDTO; // ApplyDTO 위치에 맞게 import 하세요!
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Model 임포트 필수
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping; // 추가
import org.springframework.web.servlet.mvc.support.RedirectAttributes; // 추가

@Controller
@RequestMapping("/apply")
public class ApplyController {

    @GetMapping("/info")
    public String getInfoPage(Model model) {
        model.addAttribute("applyDTO", new ApplyDTO());
        return "apply/info";
    }

    // [추가할 코드] 신청서 전송을 처리하는 부분
    @PostMapping("/register")
    public String registerPost(ApplyDTO applyDTO, RedirectAttributes redirectAttributes) {
        // 1. 여기서 원래 DB 저장을 해야 하지만, 지금은 로그만 찍어볼게요.
        System.out.println("신청서 데이터 도착!: " + applyDTO);

        // 2. 화면에 띄워줄 메시지 저장
        redirectAttributes.addFlashAttribute("message", "신청서가 정상적으로 제출되었습니다!\n신청현황은 내서재에서 확인 가능합니다.");

        // 3. 다시 안내 페이지로 돌아가기 (리다이렉트)
        return "redirect:/apply/info";
    }
}