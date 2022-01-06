package warburg.marktdaten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView mw = new ModelAndView();
        mw.setViewName("devisen");
        return mw;
    }

    @GetMapping("/Devisen")
    public ModelAndView devisen(){
        ModelAndView mw = new ModelAndView();
        mw.setViewName("devisen");
        return mw;
    }

    @GetMapping("/Devisenvolas")
    public ModelAndView devisenvolas(){
        ModelAndView mw = new ModelAndView();
        mw.setViewName("devisenvolas");
        return mw;
    }

    @GetMapping("/Wertpapiere")
    public ModelAndView wertpapiere(){
        ModelAndView mw = new ModelAndView();
        mw.setViewName("wertpapiere");
        return mw;
    }

    @GetMapping("/Zinsen")
    public ModelAndView zinsen(){
        ModelAndView mw = new ModelAndView();
        mw.setViewName("zinsen");
        return mw;
    }

    @GetMapping("/Geldmarktfuture")
    public ModelAndView geldmarktfuture(){
        ModelAndView mw = new ModelAndView();
        mw.setViewName("geldmarktfuture");
        return mw;
    }

}
