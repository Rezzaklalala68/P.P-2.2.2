package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }
@GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {

        model.addAttribute("cars", carService.getSomeCars(count));
        return "cars";
    }

}
