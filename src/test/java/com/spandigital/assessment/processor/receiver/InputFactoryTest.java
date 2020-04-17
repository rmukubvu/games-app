package com.spandigital.assessment.processor.receiver;

import com.spandigital.assessment.contract.Reader;
import com.spandigital.assessment.model.ScoresInput;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class InputFactoryTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void processInput_should_accept_input_stream() throws IOException {
        String[] lines = new String[]{"Lions 3, Snakes 3", "Tarantulas 1, FC Awesome 0", "Lions 1, FC Awesome 1"};
        File file = folder.newFile("scores_file.txt");
        Files.write(Paths.get(file.getPath()), Arrays.asList(lines));
        InputStream in = new FileInputStream(new File(file.getPath()));
        InputFactory factory = new InputFactory(ScoresInput.FILE.value());
        Iterable<String> result = factory.processInput(in);
        assertTrue("file should contain data", result.iterator().hasNext());
    }
}
