package com.spandigital.assessment.processor.receiver;
import com.spandigital.assessment.contract.Reader;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertTrue;

public class StandardInputTest {

    @Test
    public void gatherData_should_accept_stdin_and_quit_with_no_data() {
        ByteArrayInputStream in = new ByteArrayInputStream("q".getBytes());
        System.setIn(in);
        Reader r = new StandardInput();
        assertTrue("file should not contain data", !r.read(in).iterator().hasNext());
    }

}
