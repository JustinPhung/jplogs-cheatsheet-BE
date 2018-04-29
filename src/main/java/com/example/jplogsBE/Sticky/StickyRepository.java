package com.example.jplogsBE.Sticky;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StickyRepository extends CrudRepository<StickyJpa, Long>{
}
