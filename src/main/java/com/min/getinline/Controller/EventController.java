package com.min.getinline.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class EventController {

    @GetMapping("/")
    public String events(){
        return "events/index";
    }

    @GetMapping("/{eventsId}")
    public String eventsDeatil(@PathVariable Integer eventId){
        return "event/detail";
    }
}
