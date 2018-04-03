package com.example.jplogsBE;

import java.util.List;

public interface StickyService {

    void addSticky(StickyDTO stickyDTO);

    void editSticky(StickyDTO stickyDTO);

    List<StickyDTO> getStickies();

    void deleteSticky(String uuid);
}
