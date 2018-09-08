package me.riyazahamed.citutorial.library;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ContinuousIntegrationTutorialTest {

    @Test
    public void getDataTest() {
        ContinuousIntegrationTutorial tutorial = new ContinuousIntegrationTutorial();
        assertEquals(tutorial.getData(), "Value returned from library");
    }

}
