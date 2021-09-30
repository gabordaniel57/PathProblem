import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathProblemServiceTest {

    PathProblemService pathProblemService = new PathProblemService();
    String windowsPath = "D:\\SDA\\Java_Fundamentals_Coding_Exercises.pdf";
    String linuxPath = "D:/SDA/Java_Fundamentals_Coding_Exercises.pdf";

    @Test
    void testGetFileName() {
        String expected = "Java_Fundamentals_Coding_Exercises";
        assertEquals(expected, pathProblemService.getFileName(windowsPath));
        assertEquals(expected, pathProblemService.getFileName(linuxPath));
    }

    @Test
    void testGetFileExtension() {
        String expected = "pdf";
        assertEquals(expected, pathProblemService.getFileExtension(windowsPath));
        assertEquals(expected, pathProblemService.getFileExtension(linuxPath));
    }

    @Test
    void testGetParentFolder() {
        String expected = "SDA";
        assertEquals(expected, pathProblemService.getParentFolder(windowsPath));
        assertEquals(expected, pathProblemService.getParentFolder(linuxPath));
    }

    @Test
    void testReverseString() {
        String windowsPathReversed = "fdp.sesicrexE_gnidoC_slatnemadnuF_avaJ\\ADS\\:D";
        String linuxPathReversed = "fdp.sesicrexE_gnidoC_slatnemadnuF_avaJ/ADS/:D";

        assertEquals(windowsPathReversed, pathProblemService.reverseString(windowsPath));
        assertEquals(linuxPathReversed, pathProblemService.reverseString(linuxPath));
    }
}