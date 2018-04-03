package com.example.jplogsBE;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/stickies")
public class StickyResource {

    @Autowired
    private StickyService stickyService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/getStickies", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<StickyDTO> getStickies(){
        return stickyService.getStickies();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/getStickiesTest", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    void getStickiesTest(){
        System.out.println("Hello World");
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/addSticky", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addSticky(@RequestBody StickyDTO stickyDTO ){
        stickyService.addSticky(stickyDTO);
        return "successful";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/editSticky", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String editSticky(@RequestBody StickyDTO stickyDTO ){
        stickyService.editSticky(stickyDTO);
        return "successful";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/deleteSticky/{uuid}", method = RequestMethod.DELETE)
    public @ResponseBody
    String deleteSticky(@PathVariable String uuid ){
        stickyService.deleteSticky(uuid);
        return "successful";
    }

}
