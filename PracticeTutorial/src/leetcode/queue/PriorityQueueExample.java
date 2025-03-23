package leetcode.queue;

import abstractclass.IStudent;
import concrete.Students;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
       int [] numbers = {1,2,3,4,5};
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            return b - a;
        });
        for(int num : numbers){
            pq.add(num);
        }
        int counter = pq.size();
       while (counter-- >0){
           System.out.println(pq.remove());
       }
        List<IStudent> listOfStudents = Students.getAll();
        PriorityQueue<IStudent> priorityOfStudent =
                new PriorityQueue<>((a,  b) -> Double.compare(b.getGPA(),a.getGPA()));
        listOfStudents.forEach((student) -> priorityOfStudent.add(student));
        counter = priorityOfStudent.size();
        while (counter-- >0){
            System.out.println(priorityOfStudent.remove());
        }
    }
}
