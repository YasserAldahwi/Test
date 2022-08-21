import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class AnagramCheckerTest {

    @Test
    public void isAnagram() {
        DetectingAnagram checker = new DetectingAnagram();
        assertThat(checker.isAnagramSort("peek", "keep"), equalTo(true));
        assertThat(checker.isAnagramSort("mary", "army"), equalTo(true));

        assertThat(checker.isAnagramSort("dart", "mart"), equalTo(false));
    }
}