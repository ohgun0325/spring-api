package site.esgaida.api.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DocsController {

    @GetMapping("/docs")
    public ModelAndView docs() {
        return new ModelAndView("redirect:/swagger-ui/index.html");
    }
}
