package trial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Controller
@EnableAutoConfiguration
public class TrialController
{
    @Autowired
    private JdbcTemplate jdbc;

    @RequestMapping("/thymeleaf")
    public ModelAndView thymeleaf() {
        List<Map<String, Object>> list = this.jdbc.queryForList("SELECT * FROM wp_users");
        Map<String, String> model = new HashMap<String, String>();
        model.put("message", list.get(0).get("user_login").toString());
        return new ModelAndView("HelloController/thymeleaf", model);
    }
}
