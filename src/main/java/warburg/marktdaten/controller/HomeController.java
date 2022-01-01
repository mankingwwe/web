package warburg.marktdaten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView mw = new ModelAndView();
        mw.setViewName("index");
        return mw;
    }

    @GetMapping("/bloomberg")
    public ModelAndView bloomberg(){
        ModelAndView mw = new ModelAndView();
        mw.setViewName("bloomberg");
        return mw;
    }

}
