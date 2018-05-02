package com.example.jplogsBE.Diary;

import java.util.List;

public interface DiaryService {

    List<DiaryDTO> getDiaryEntries();

    void addDiaryEntry(DiaryDTO diaryDTO);

    void editDiaryEntry(DiaryDTO diaryDTO);

    void deleteDiaryEntry(String uuid);
}