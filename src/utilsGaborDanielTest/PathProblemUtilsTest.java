package utilsGaborDanielTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PathProblemUtilsTest {

    PathProblemUtils pPWindowsPath = new PathProblemUtils("D:\\SDA\\Dir2\\Dir3\\Dir4\\File_Name_ver.1.32.pdf");
    PathProblemUtils pPLinuxPath = new PathProblemUtils("D:/SDA/Dir2/Dir3/Dir4/.File_Name_ver.1.32.pdf");

    @Test
    void testGetFileName() {
        String expectedOnWindows = "File_Name_ver.1.32";
        String expectedOnLinux = ".File_Name_ver.1.32";

        assertEquals(expectedOnWindows, pPWindowsPath.getFileName());
        assertEquals(expectedOnLinux, pPLinuxPath.getFileName());
    }

    @Test
    void testGetFileExtension() {
        String expected = "pdf";

        assertEquals(expected, pPLinuxPath.getFileExtension());
        assertEquals(expected, pPWindowsPath.getFileExtension());
    }

    @Test
    void testGetParentFolder() {
        String expectedForWindows = "D:\\SDA\\Dir2\\Dir3\\Dir4";
        String expectedForLinux = "D:/SDA/Dir2/Dir3/Dir4";

        assertEquals(expectedForLinux, pPLinuxPath.getParentFolder());
        assertEquals(expectedForWindows, pPWindowsPath.getParentFolder());
    }

    @Test
    public void testHiddenFileWithoutExtension() {
        String path = "/Users/jamessmith/.bash_history";
        PathProblemUtils pPHiddenFileWithoutExtension = new PathProblemUtils(path);

        assertEquals("/Users/jamessmith",pPHiddenFileWithoutExtension .getParentFolder());
        assertEquals(".bash_history", pPHiddenFileWithoutExtension.getFileName());
        assertEquals("", pPHiddenFileWithoutExtension.getFileExtension());
    }
@Test
public void testFileWithoutExtension() {
    String path = "/Users/jamessmith/test";
    PathProblemUtils pPWithoutExtension = new PathProblemUtils(path);

    assertEquals("/Users/jamessmith", pPWithoutExtension.getParentFolder());
    assertEquals("test", pPWithoutExtension.getFileName());
    assertEquals("", pPWithoutExtension.getFileExtension());
}
}