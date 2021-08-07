package com.neuyer.designpatterns.streeng;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class StreengStudiesTests {

    @Spy
    private StreengStudies streengStudies;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void handleNameTest() {
        streengStudies.handleName("Ariel Santos Neumeyer");
    }
}
