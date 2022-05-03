package ru.vsu.cs.course1;

public class SimpleLinkedListQueue2Integer {
    public static int solutionMax(SimpleLinkedListQueue2<Integer> queue) throws Exception {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < queue.solutionGetSize(); i++) {
            int value = queue.remove();
            queue.add(value);
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public static int solutionMin(SimpleLinkedListQueue2<Integer> queue) throws Exception {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < queue.solutionGetSize(); i++) {
            int value = queue.remove();
            queue.add(value);
            if (min > value) {
                min = value;
            }
        }
        return min;
    }
}
