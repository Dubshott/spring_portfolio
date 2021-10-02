package com.example.sping_portfolio.controllers.balgolab;

import com.example.sping_portfolio.controllers.balgolab.DivisionModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DivisionController {
    public List<_Division> divisionInit(int nth) {
        List<_Division> divisionList = new ArrayList<>();
        divisionList.add(new DivisionFor(nth));
        divisionList.add(new DivisionStream(nth));
        divisionList.add(new DivisionWhile(nth));
        divisionList.add(new DivisionRecurse(nth));

        return divisionList;
    }

    @GetMapping("/division")
    public String division(@RequestParam(name="divisionseq", required=false,  defaultValue="2") String divisionseq, Model model) {
        int nth = Integer.parseInt(divisionseq);
        model.addAttribute("divisionList", divisionInit(nth));
        return "division";

    }

}
