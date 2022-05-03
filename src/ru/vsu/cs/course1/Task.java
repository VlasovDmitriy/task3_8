package ru.vsu.cs.course1;


public class Task {
    public static SimpleLinkedListQueue2 arrayToQueue(int[] array){
        SimpleLinkedListQueue2 queue = new SimpleLinkedListQueue2();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        return queue;
    }
    public static int size(int[] array) throws Exception{
        SimpleLinkedListQueue2 queue = arrayToQueue(array);
        int size = queue.solutionGetSize();
        return size;
    }
    public static int max(int[] array) throws Exception{
        SimpleLinkedListQueue2 queue = arrayToQueue(array);
        int max = SimpleLinkedListQueue2Integer.solutionMax(queue);
        return max;
    }
    public static int min(int[] array) throws Exception{
        SimpleLinkedListQueue2 queue = arrayToQueue(array);
        int min = SimpleLinkedListQueue2Integer.solutionMin(queue);
        return min;
    }
}
