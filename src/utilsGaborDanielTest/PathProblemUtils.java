package utilsGaborDanielTest;

public class PathProblemUtils {

    String path;
    char slash;
    int lastSlashIndex;
    int extensionDotIndex;

    public PathProblemUtils(String path) {
        this.path = path;
        this.slash = this.getSlashType();
        this.lastSlashIndex = path.lastIndexOf(slash);
        this.extensionDotIndex = getExtensionDotIndex();
    }

    public String getParentFolder() {
        return path.substring(0, lastSlashIndex);
    }

    public String getFileName() {
        if (extensionDotIndex == -1) {
            return path.substring(lastSlashIndex + 1, path.length());
        } else if (lastSlashIndex + 1 == extensionDotIndex) {
            return path.substring(lastSlashIndex + 1, path.length());
        }
        return path.substring(lastSlashIndex + 1, extensionDotIndex);
    }

    public String getFileExtension() {
        if (extensionDotIndex == -1) {
            return "";
        } else if (lastSlashIndex + 1 == extensionDotIndex) {
            return "";
        }
        return path.substring(extensionDotIndex + 1, path.length());
    }

    int getExtensionDotIndex() {
        return path.lastIndexOf(".");
    }

    char getSlashType() {
        char slash = '\\';
        if (path.contains("/")) {
            slash = '/';
        }
        return slash;
    }
}

