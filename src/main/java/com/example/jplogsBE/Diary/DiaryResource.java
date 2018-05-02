package com.example.jplogsBE.Diary;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/diary")
public class DiaryResource {

    @Autowired
    private DiaryService diaryService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/getDiaryEntries", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<DiaryDTO> getDiaryEntries(){
        return diaryService.getDiaryEntries();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/secure/addDiaryEntry", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addDiaryEntry(@RequestBody DiaryDTO diaryDTO ){
        diaryService.addDiaryEntry(diaryDTO);
        return "successful";
    }

    @RequestMapping(value = "/secure/editDiaryEntry", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String editDiaryEntry(@RequestBody DiaryDTO diaryDTO ){
        diaryService.editDiaryEntry(diaryDTO);
        return "successful";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/secure/deleteDiaryEntry/{uuid}", method = RequestMethod.DELETE)
    public @ResponseBody
    String deleteDiaryEntry(@PathVariable String uuid ){
        diaryService.deleteDiaryEntry(uuid);
        return "successful";
    }

}
