package trial;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TrialController
{
    @RequestMapping("/")
    @ResponseBody
    public String getReq() {
        return "Good morning, Spring Boot サンプル";
    }
}
