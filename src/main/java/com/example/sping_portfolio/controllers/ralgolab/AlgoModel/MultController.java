package com.example.sping_portfolio.controllers.ralgolab.AlgoModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MultController {
    public List<_Arithmetic> multInit(int nth) {
        List<_Arithmetic> multList = new ArrayList<>();
        multList.add(new MultFor(nth));
        multList.add(new MultWhile(nth));
        multList.add(new MultRecurse(nth));
        multList.add(new MultStream(nth));

        return multList;
    }

    @GetMapping("/arith")
    public String arith(@RequestParam(name = "multseq", required = false, defaultValue = "2") String multseq, Model model) {
        int nth = Integer.parseInt(multseq);
        model.addAttribute("multList", multInit(nth));
        return "mult";

    }
}
