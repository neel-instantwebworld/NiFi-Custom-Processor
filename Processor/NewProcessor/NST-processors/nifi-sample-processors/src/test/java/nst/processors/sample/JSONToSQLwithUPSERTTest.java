package nst.processors.sample;

import org.apache.nifi.util.TestRunner;
import org.apache.nifi.util.TestRunners;
import org.junit.Before;
import org.junit.Test;


public class JSONToSQLwithUPSERTTest {

    private TestRunner testRunner;

    @Before
    public void init() {
        testRunner = TestRunners.newTestRunner(JSONToSQLwithUPSERT.class);
    }

    @Test
    public void testProcessor() {

    }

}
