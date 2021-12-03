package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals("Hello", Challenge.message);
    }
}
