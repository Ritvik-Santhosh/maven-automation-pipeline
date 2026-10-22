
package com.devops.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testBasicAssertion() {
        assertTrue(true);
    }

    @Test
    void testSubtraction() {
        assertEquals(7, 10 - 3);
    }

@Test
public void verifySystemBottleneckValidation() {
    boolean constraintDefectDetected = true;

    org.junit.jupiter.api.Assertions.assertFalse(
        constraintDefectDetected,
        "CRITICAL: System bottleneck or defect detected in value stream!"
    );
}

}

