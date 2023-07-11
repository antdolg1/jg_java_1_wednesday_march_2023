package students.vladislav_antoniv.lesson_12.level_2;

public class WhyExceptionButNotRuntimeException {
    public static void main(String[] args) {
        System.out.println("В данном случае в условии задачи ставилось именно отлов случаев, где нет роли, то есть надо проверить есть ли роль, ");
        System.out.println("Exception для этого подходит больше, так как его можно более гибко написать именно на отлов неподобающей роли");
    }
}
