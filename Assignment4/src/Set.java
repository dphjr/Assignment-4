/*
Name: Dan Hannigan
Course: Programming Fundamentals
Semester: Summer 2020
Assignment: Set ADT
 */
public class Set {
    LinkedNode head = null;

    void add(int num) { //adding to set method
        if (!exists(num)){
            LinkedNode value = new LinkedNode(num);
            value.next = head;
            head = value;
        }
    }

    void del(int num) { //deletion method for set
        LinkedNode temp = head;
        LinkedNode prev = null;

        if (temp != null && temp.x == num) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.x != num) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;

        prev.next = temp.next;
    }
    
    boolean exists(int num) { //checks if integer exists in set method
        LinkedNode temp = head;
        
        while (temp != null) {
            if (temp.x == num) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public String toString() { //string representation of set
        StringBuilder output = new StringBuilder();
        LinkedNode temp = head;

        while (temp!=null) {
            output.append(temp.x).append(" ");
            temp = temp.next;
        }
        return output.toString();
    }
}
