package com.example.sping_portfolio.controllers.balgolab;

import com.example.sping_portfolio.controllers.balgolab.Algorithims.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


public class AlgoController {
    public List<_Arithmetic> arithInit(int nth) {
        List<_Arithmetic> arithList = new ArrayList<>();
        arithList.add(new ArithFor(nth));
        arithList.add(new ArithWhile(nth));
        arithList.add(new ArithRecurse(nth));
        arithList.add(new ArithStream(nth));


        return arithList;
    }

    @GetMapping("/div")
    public String arith(@RequestParam(name="arithseq", required=false,  defaultValue="2") String arithseq, Model model) {
        int nth = Integer.parseInt(arithseq);
        model.addAttribute("arithList", arithInit(nth));
        return "arith";

    }

}
