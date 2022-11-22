package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DealRepositoryTest {

    @Autowired
    private DealRepository dealRepository;

    @Test
    void save() {
        DealModel deal = dealRepository.save(new DealModel("Test", "test", 1f));

        assertTrue(deal.getId() > 0);
    }

}
