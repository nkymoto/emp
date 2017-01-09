package trial;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class TrialController
{
    @RequestMapping("/thymeleaf")
    public ModelAndView thymeleaf() {
        Map<String, String> model = new HashMap<String, String>();
        model.put("message", "hello world");
        return new ModelAndView("HelloController/thymeleaf", model);
    }
}
