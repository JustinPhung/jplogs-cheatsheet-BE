package com.example.jplogsBE.Diary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    DiaryRepository diaryRepository;


    @Override
    public void addDiaryEntry(DiaryDTO diaryDTO) {
        diaryRepository.save(new DiaryJpa(diaryDTO.getUuid(),
                diaryDTO.getDiaryEntry(),
                diaryDTO.getTime(),
                diaryDTO.getExternalUrl()
        ));
    }

    @Override
    public void editDiaryEntry(DiaryDTO diaryDTO) {
        diaryRepository.findAll().forEach(diaryJpa -> {
            if (diaryDTO.getUuid().equals(diaryJpa.getUuid())) {
                diaryJpa.setDiaryEntry(diaryDTO.getDiaryEntry());
                diaryJpa.setTime(diaryDTO.getTime());
                diaryJpa.setExternalUrl(diaryDTO.getExternalUrl());
                diaryRepository.save(diaryJpa);
            }
        });
    }

    @Override
    public List<DiaryDTO> getDiaryEntries() {
        List<DiaryDTO> diaryDTOS = new ArrayList<>();
        diaryRepository.findAll().forEach(diaryJpa -> diaryDTOS.add(
                new DiaryDTO(
                        diaryJpa.getUuid(),
                        diaryJpa.getDiaryEntry(),
                        diaryJpa.getTime(),
                        diaryJpa.getExternalUrl()
                )));
        return diaryDTOS;
    }

    @Override
    public void deleteDiaryEntry(String uuid) {
        diaryRepository.findAll().forEach(diaryJpa -> {
            if (diaryJpa.getUuid().equals(uuid)) {
                diaryRepository.delete(diaryJpa);
            }
        });
    }
}
