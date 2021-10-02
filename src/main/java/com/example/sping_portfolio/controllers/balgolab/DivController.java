package com.example.sping_portfolio.controllers.balgolab;

import com.example.sping_portfolio.controllers.balgolab.Algorithims.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


public class DivController {
    public List<_Div> DivInit(int nth) {
        List<_Div> DivList = new ArrayList<>();
        DivList.add(new DivFor(nth));
        DivList.add(new DivWhile(nth));
        DivList.add(new DivRecurse(nth));
        DivList.add(new DivStream(nth));


        return DivList;
    }

    @GetMapping("/Div")
    public String Div(@RequestParam(name="Divseq", required=false,  defaultValue="2") String Divseq, Model model) {
        int nth = Integer.parseInt(Divseq);
        model.addAttribute("DivList", DivInit(nth));
        return "Div";

    }

}
