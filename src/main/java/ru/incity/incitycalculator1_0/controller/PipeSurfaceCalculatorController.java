package ru.incity.incitycalculator1_0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.incity.incitycalculator1_0.model.PipeSurfaceCalculator;
import ru.incity.incitycalculator1_0.service.PipeSurfaceCalculatorService;
import java.util.List;

@Controller
@RequestMapping("/table")
public class PipeSurfaceCalculatorController {

    private final PipeSurfaceCalculatorService pipeSurfaceCalculatorService;
    public PipeSurfaceCalculatorController(PipeSurfaceCalculatorService pipeSurfaceCalculatorService) {
        this.pipeSurfaceCalculatorService = pipeSurfaceCalculatorService;
    }

    @GetMapping()
    public String showAllPipes(ModelMap model) {
        List<PipeSurfaceCalculator> allPipes = pipeSurfaceCalculatorService.getAllPipeSurfaceCalculators();
        model.addAttribute("allPipes", allPipes);
        model.addAttribute("pipeSurfaceCalculator", new PipeSurfaceCalculator());
        model.addAttribute("sum", pipeSurfaceCalculatorService.sumOfAllPipeSurfaceCalculators());
        return "table";
    }

    @PostMapping()
    public String addPipeSurfaceCalculator(@ModelAttribute("pipeSurfaceCalculator") PipeSurfaceCalculator pipeSurfaceCalculator) {
        pipeSurfaceCalculatorService.savePipeSurfaceCalculator(pipeSurfaceCalculator);
        return "redirect:/table";
    }

    @DeleteMapping("/delete/{id}")
    public String deletePipeSurfaceCalculator(@PathVariable("id") int id) {
        pipeSurfaceCalculatorService.deletePipeSurfaceCalculator(id);
        return "redirect:/table";
    }

}
