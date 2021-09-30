import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathProblemServiceTest {

    PathProblemService pathProblemService = new PathProblemService();


    @Test
    void testGetFileName() {
        String windowsPath = "D:\\SDA\\Dir2\\Dir3\\Dir4\\File_Name_ver.1.32.pdf";
        String linuxPath = "D:/SDA/Dir2/Dir3/Dir4/File_Name_ver.1.32.pdf";

        String expected = "File_Name_ver.1.32";
        assertEquals(expected, pathProblemService.getFileName(windowsPath));
        assertEquals(expected, pathProblemService.getFileName(linuxPath));
    }

    @Test
    void testGetFileExtension() {
        String windowsPath = "D:\\SDA\\FileName.e1.e2.png";
        String linuxPath = "D:/SDA/FileName.e1.e2.png";

        String expected = "png";
        assertEquals(expected, pathProblemService.getFileExtension(windowsPath));
        assertEquals(expected, pathProblemService.getFileExtension(linuxPath));
    }

    @Test
    void testGetParentFolder() {
        String windowsPath = "D:\\Dir1\\SDA\\Java_Fundamentals_Coding_Exercises.pdf";
        String linuxPath = "D:/Dir1/SDA/Java_Fundamentals_Coding_Exercises.pdf";

        String expected = "SDA";
        assertEquals(expected, pathProblemService.getParentFolder(windowsPath));
        assertEquals(expected, pathProblemService.getParentFolder(linuxPath));
    }

    @Test
    void testReverseString() {
        String windowsPath = "D:\\SDA\\Java_Fundamentals_Coding_Exercises.pdf";
        String linuxPath = "D:/SDA/Java_Fundamentals_Coding_Exercises.pdf";

        String windowsPathReversed = "fdp.sesicrexE_gnidoC_slatnemadnuF_avaJ\\ADS\\:D";
        String linuxPathReversed = "fdp.sesicrexE_gnidoC_slatnemadnuF_avaJ/ADS/:D";

        assertEquals(windowsPathReversed, pathProblemService.reverseString(windowsPath));
        assertEquals(linuxPathReversed, pathProblemService.reverseString(linuxPath));
    }
}