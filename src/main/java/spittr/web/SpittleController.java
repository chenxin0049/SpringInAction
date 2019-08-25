package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spittle;
import spittr.data.SpittleRepository;

import java.util.Date;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showSpittle(@RequestParam("spittle_id") int spittleId, Model model){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable int spittleId, Model model){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveSpittle(String message){
        spittleRepository.save(new Spittle(message, new Date(), 0.0, 0.0));
        return "redirect:/spittles";
    }
}
