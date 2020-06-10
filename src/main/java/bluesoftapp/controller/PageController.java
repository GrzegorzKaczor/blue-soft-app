package bluesoftapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@Controller
public class PageController {

    @GetMapping("/")
    public ModelAndView getHomePage() {
        ModelAndView model = new ModelAndView("home");
        return model;
    }

    @GetMapping("/page/all")
    public ModelAndView getAllContractPage() {
        ModelAndView model = new ModelAndView("allContract");
        return model;
    }

    @GetMapping("/page/active")
    public ModelAndView getActiveContractPage() {
        ModelAndView model = new ModelAndView("activeContract");
        return model;
    }

    @GetMapping("/page/system")
    public ModelAndView getSystemPage() {
        ModelAndView model = new ModelAndView("system");
        return model;
    }

    @GetMapping("/page/add")
    public ModelAndView getAddContractPage() {
        ModelAndView model = new ModelAndView("addContract");
        return model;
    }

    @GetMapping("/page/about")
    public ModelAndView getAboutPage() {
        ModelAndView model = new ModelAndView("about");
        return model;
    }
}
