package com.example.sping_portfolio.controllers.aalgolab;

import com.example.sping_portfolio.controllers.aalgolab.AlgorithmModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlgorithmController {
    public List<_Geometric> geometricInit(int nth) {
        List<_Geometric> geometricList = new ArrayList<>();
        geometricList.add(new GeometricFor(nth));
        geometricList.add(new GeometricStream(nth));
        geometricList.add(new GeometricWhile(nth));
        geometricList.add(new GeometricRecurse(nth));

        return geometricList;
    }

    @GetMapping("/geometric")
    public String arith(@RequestParam(name="geometricseq", required=false,  defaultValue="2") String geometricseq, Model model) {
        int nth = Integer.parseInt(geometricseq);
        model.addAttribute("arithList", geometricInit(nth));
        return "arith";

    }

}
