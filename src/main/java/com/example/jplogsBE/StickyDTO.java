package com.example.jplogsBE;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StickyDTO {
    private String uuid;
    private String name;
    private String copyText;
    private String category;
    private int used;
}
