package com.example.jplogsBE.Sticky;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;
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
    @RequestMapping(value = "/secure/addSticky", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addSticky(@RequestBody StickyDTO stickyDTO ){
        stickyService.addSticky(stickyDTO);
        return "successful";
    }

    @RequestMapping(value = "/secure/editSticky", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String editSticky(@RequestBody StickyDTO stickyDTO ){
        stickyService.editSticky(stickyDTO);
        return "successful";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/secure/deleteSticky/{uuid}", method = RequestMethod.DELETE)
    public @ResponseBody
    String deleteSticky(@PathVariable String uuid ){
        stickyService.deleteSticky(uuid);
        return "successful";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public String login(@RequestBody String  key) throws ServletException {

        String jwtToken = "";

        if (key == null || key.isEmpty()) {
            throw new ServletException("Please fill in username and password");
        }

        if (!key.equals("9bd7197bb8d9e33df6a19d5b11215146")) {
            throw new ServletException("Invalid login. Please check your name and password.");
        }

        jwtToken = Jwts.builder().setSubject("Admin").claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "9bd7197bb8d9e33df6a19d5b11215146").compact();

        return jwtToken;
    }

}
