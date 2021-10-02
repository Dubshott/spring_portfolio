package com.example.sping_portfolio.controllers.kalgolab;

import com.example.sping_portfolio.controllers.kalgolab.AlgoModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlgoController {
    public List<_Arithmetic> arithInit(int nth) {
        List<_Arithmetic> arithList = new ArrayList<>();
        arithList.add(new ArithFor(nth));
        arithList.add(new ArithWhile(nth));
        arithList.add(new ArithRecurse(nth));
        arithList.add(new ArithStream(nth));

        return arithList;
    }

    @GetMapping("/arith")
    public String arith(@RequestParam(name="arithseq", required=false,  defaultValue="2") String arithseq, Model model) {

        int nth = Integer.parseInt(arithseq);

        //MODEL attributes are passed back html
        model.addAttribute("arithList", arithInit(nth));

        return "arith"; //HTML render fibonacci results

    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 20; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long

        List<_Arithmetic> arithList = new AlgoController().arithInit(nth);
        for (_Arithmetic arithmetic : arithList)
            arithmetic.print();  //Console output fibonacci results
    }
}
