// 71. Simplify Path

class Solution {
    public String simplifyPath(String path) {
        String[] pathName = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String directory : pathName) {
            if(directory.equals("") || directory.equals(".")){
                continue;
            } else if (directory.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(directory);
            }
        }

        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }
        
        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";

    }
}