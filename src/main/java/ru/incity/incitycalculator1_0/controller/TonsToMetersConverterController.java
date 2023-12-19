package ru.incity.incitycalculator1_0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.incity.incitycalculator1_0.model.tonstometers.TonsToMetersConverter;
import ru.incity.incitycalculator1_0.service.tonstometers.TonsToMetersConverterService;

import java.util.List;

@Controller
@RequestMapping("/meters")
public class TonsToMetersConverterController {

    private final TonsToMetersConverterService tonsToMetersConverterService;

    @Autowired
    public TonsToMetersConverterController(TonsToMetersConverterService tonsToMetersConverterService) {
        this.tonsToMetersConverterService = tonsToMetersConverterService;
    }

    @GetMapping()
    public String showAllConverters(ModelMap model) {
        List<TonsToMetersConverter> allConverters = tonsToMetersConverterService.getAllTonsToMetersConverters();
        model.addAttribute("allConverters", allConverters);
        model.addAttribute("tonsToMetersConverter", new TonsToMetersConverter());
        model.addAttribute("sum", tonsToMetersConverterService.sumOfAllTonsToMetersConverters());
        model.addAttribute("onlySum", tonsToMetersConverterService.getOnlySumOfAllTonsToMetersConverters());
        return "meters";
    }

    @PostMapping()
    public String addTonsToMetersConverter(@ModelAttribute("tonsToMetersConverter") TonsToMetersConverter tonsToMetersConverter) {
        tonsToMetersConverterService.saveTonsToMetersConverter(tonsToMetersConverter);
        return "redirect:/meters";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTonsToMetersConverter(@PathVariable("id") int id) {
        tonsToMetersConverterService.deleteTonsToMetersConverter(id);
        return "redirect:/meters";
    }

}
