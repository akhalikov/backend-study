package akhalikov.jetty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
  private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

  @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
  @ResponseBody
  public String hello(@PathVariable String name) {
    LOGGER.info("GET /hello/{}", name);
    return String.format("Hello, %s", name);
  }
}
