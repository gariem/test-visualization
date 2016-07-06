package pe.edu.pucp.data.viewer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Emilio on 7/6/2016.
 */
@RestController
public class GraphicsController {

    @RequestMapping("/test")
    public String test(){
        return "OK " + new Date();
    }
}
