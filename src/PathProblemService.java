public class PathProblemService {


    public String getFileName(String path) {

        int extensionIndex = 0;
        String reversedPath = this.reverseString(path);

        if (path.contains("/")) {
            for (int i = 0; i < reversedPath.length(); i++) {
                if (reversedPath.charAt(i) == '.') {
                    extensionIndex = i + 1;
                }
                if (reversedPath.charAt(i) == '/') {
                    return this
                            .reverseString(reversedPath
                                    .substring(extensionIndex, i));
                }
            }
        } else if (path.contains("\\")) {
            for (int i = 0; i < reversedPath.length(); i++) {
                if (reversedPath.charAt(i) == '.') {
                    extensionIndex = i + 1;
                }
                if (reversedPath.charAt(i) == '\\') {
                    return this
                            .reverseString(reversedPath
                                    .substring(extensionIndex, i));
                }
            }
        }
        return "1";
    }

    public String getFileExtension(String path) {
        String reversedPath = this.reverseString(path);

        for (int i = 0; i < reversedPath.length(); i++) {
            if (reversedPath.charAt(i) == '.') {
                return this
                        .reverseString(reversedPath
                                .substring(0, i));
            }
        }
        return "1";
    }

    public String getParentFolder(String path) {

        int firstSlashIndex = 0;
        String reversedPath = this.reverseString(path);
        Boolean firstSlashFlag = false;

        if (path.contains("/")) {
            for (int i = 0; i < reversedPath.length(); i++) {
                if (reversedPath.charAt(i) == '/' && !firstSlashFlag) {
                    firstSlashIndex = i;
                    firstSlashFlag = true;
                }
                if (reversedPath.charAt(i) == '/' && i != firstSlashIndex) {
                    firstSlashIndex += 1;
                    return this
                            .reverseString(reversedPath
                                    .substring(firstSlashIndex, i));
                }
            }
        }
        if (path.contains("\\")) {
            for (int i = 0; i < reversedPath.length(); i++) {
                if (reversedPath.charAt(i) == '\\' && !firstSlashFlag) {
                    firstSlashIndex = i;
                    firstSlashFlag = true;
                }
                if (reversedPath.charAt(i) == '\\' && i != firstSlashIndex) {
                    firstSlashIndex += 1;
                    return this
                            .reverseString(reversedPath
                                    .substring(firstSlashIndex, i));
                }
            }
        }
        return "1";
    }

    public String reverseString(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }
}

