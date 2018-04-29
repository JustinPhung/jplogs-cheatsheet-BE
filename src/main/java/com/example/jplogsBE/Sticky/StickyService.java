package com.example.jplogsBE.Sticky;

import java.util.List;

public interface StickyService {

    void addSticky(StickyDTO stickyDTO);

    void editSticky(StickyDTO stickyDTO);

    List<StickyDTO> getStickies();

    void deleteSticky(String uuid);
}
