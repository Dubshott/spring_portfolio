package com.example.sping_portfolio.controllers.balgolab;

import com.example.sping_portfolio.controllers.balgolab.Algorithims.*;
import com.example.sping_portfolio.controllers.kalgolab.AlgoModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


public class controllers {
    public List<_division> divInit(int nth) {

        List<_division> divList = new ArrayList<>();

        divList.add(new div2(nth));
        divList.add(new div3(nth));
        divList.add(new div4(nth));
        divList.add(new div5(nth));

        return divList;
    }

    @GetMapping("/div")
    public String arith(@RequestParam(name="divseq", required=false,  defaultValue="2") String divseq, Model model) {
        int nth = Integer.parseInt(divseq);
        model.addAttribute("divList", divInit(nth));
        return "div";

    }

}
