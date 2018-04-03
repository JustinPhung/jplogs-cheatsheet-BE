package com.example.jplogsBE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StickyServiceImpl implements StickyService {

    @Autowired
    StickyRepository stickyRepository;


    @Override
    public void addSticky(StickyDTO stickyDTO) {
        stickyRepository.save(new StickyJpa(stickyDTO.getUuid(),
                stickyDTO.getName(),
                stickyDTO.getCopyText(),
                stickyDTO.getCategory(),
                stickyDTO.getUsed()
        ));
    }

    @Override
    public void editSticky(StickyDTO stickyDTO) {
        stickyRepository.findAll().forEach(stickyJpa -> {
            if (stickyDTO.getUuid().equals(stickyJpa.getUuid())) {
                stickyJpa.setName(stickyDTO.getName());
                stickyJpa.setCategory(stickyDTO.getCategory());
                stickyJpa.setCopyText(stickyDTO.getCopyText());
                stickyRepository.save(stickyJpa);
            }
        });
    }

    @Override
    public List<StickyDTO> getStickies() {
        List<StickyDTO> stickies = new ArrayList<>();
        stickyRepository.findAll().forEach(stickyJpa -> stickies.add(new StickyDTO(stickyJpa.getUuid(),
                stickyJpa.getName(),
                stickyJpa.getCopyText(),
                stickyJpa.getCategory(),
                stickyJpa.getUsed())
        ));
        return stickies;
    }

    @Override
    public void deleteSticky(String uuid) {
        stickyRepository.findAll().forEach(stickyJpa ->{
            if(stickyJpa.getUuid().equals(uuid)){
                stickyRepository.delete(stickyJpa);
            }
        });
    }
}
