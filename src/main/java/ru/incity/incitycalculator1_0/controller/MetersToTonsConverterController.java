package ru.incity.incitycalculator1_0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.incity.incitycalculator1_0.model.meterstotons.MetersToTonsConverter;
import ru.incity.incitycalculator1_0.service.meterstotons.MetersToTonsConverterService;

import java.util.List;

@Controller
@RequestMapping("/tons")
public class MetersToTonsConverterController {

private final MetersToTonsConverterService metersToTonsConverterService;

@Autowired
public MetersToTonsConverterController(MetersToTonsConverterService metersToTonsConverterService) {
        this.metersToTonsConverterService = metersToTonsConverterService;
    }

    @GetMapping()
    public String showAllConverters(ModelMap model) {
        List<MetersToTonsConverter> allConverters = metersToTonsConverterService.getAllMetersToTonsConverters();
        model.addAttribute("allConverters", allConverters);
        model.addAttribute("metersToTonsConverter", new MetersToTonsConverter());
        model.addAttribute("sum", metersToTonsConverterService.sumOfAllMetersToTonsConverters());
        model.addAttribute("onlySum", metersToTonsConverterService.getOnlySumOfAllMetersToTonsConverters());
        return "tons";
    }

    @PostMapping()
    public String addMetersToTonsConverter(@ModelAttribute("metersToTonsConverter") MetersToTonsConverter metersToTonsConverter) {
        metersToTonsConverterService.saveMetersToTonsConverter(metersToTonsConverter);
        return "redirect:/tons";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMetersToTonsConverter(@PathVariable("id") int id) {
        metersToTonsConverterService.deleteMetersToTonsConverter(id);
        return "redirect:/tons";
    }
}
