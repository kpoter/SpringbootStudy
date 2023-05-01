package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ByeController {

    @GetMapping("bye-spring") // URL : localhost:8080/bye-spring?param=???
    @ResponseBody
    public Bye ByeApi(@RequestParam("string1") String string1) {
        Bye bye = new Bye();
        bye.setString1(string1);
        return bye;
    }

    static class Bye{
        private String string1;

        public String getString1() {
            return string1;
        }

        public void setString1(String string1) {
            this.string1 = string1;
        }
    }
}
