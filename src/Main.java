public class Main {
    public static void main(String[] args) {


        PathProblemService pathProblemService = new PathProblemService();

        String windowsPath = "D:\\SDA\\Java_Fundamentals_Coding_Exercises.pdf";

        String linuxPath = "D:/SDA/Java_Fundamentals_Coding_Exercises.pdf";


        System.out.println("WINDOWS PATH");
        System.out.print("File name: ");
        System.out.println(pathProblemService.getFileName(windowsPath));
        System.out.print("File extension: ");
        System.out.println(pathProblemService.getFileExtension(windowsPath));
        System.out.print("File parent folder: ");
        System.out.println(pathProblemService.getParentFolder(windowsPath));

        System.out.println();

        System.out.println("LINUX PATH");
        System.out.print("File name: ");
        System.out.println(pathProblemService.getFileName(linuxPath));
        System.out.print("File extension: ");
        System.out.println(pathProblemService.getFileExtension(linuxPath));
        System.out.print("File parent folder: ");
        System.out.println(pathProblemService.getParentFolder(linuxPath));
    }
}
