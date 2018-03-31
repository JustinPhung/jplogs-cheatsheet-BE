package com.example.jplogsBE;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/stickies")
public class StickyResource {

    @Autowired
    private StickyService stickyService;

    @RequestMapping(value = "/getStickies", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<StickyDTO> getStickies(){
        return stickyService.getStickies();
    }

    @RequestMapping(value = "/addSticky", method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    String addSticky(StickyDTO stickyDTO ){
        stickyService.addSticky(stickyDTO);
        return "successful";
    }

    @RequestMapping(value = "/editSticky", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    String editSticky(StickyDTO stickyDTO ){
        stickyService.editSticky(stickyDTO);
        return "successful";
    }

}
