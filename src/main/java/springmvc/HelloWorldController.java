package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by DELL on 06/16/17.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/Hello")
    public String phuongThuc1(@RequestParam("name") String name,
                              @RequestParam("diachi") String diachi,
                              Model model){
        model.addAttribute("nameATB",name);
        model.addAttribute("diachiATB",diachi);
        return "springmvc/form";
    }
}
