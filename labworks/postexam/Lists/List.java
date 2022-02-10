package postexam.Lists;

public class List {
    Element head = null;

    public static void main(String args[]) {
        List myLinkedList = new List();
        myLinkedList.addElement(40);
        myLinkedList.addElement(50);
        myLinkedList.addElement(60);
        myLinkedList.addElement(70);
        myLinkedList.getListSize();
        myLinkedList.removeElement();
        myLinkedList.getListSize();
        myLinkedList.removeElement();
        myLinkedList.getListSize();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getListSize() {
        Element element = head;
        int sum = 0;
        while (element != null) {
            element = element.next;
            sum++;
        }

        System.out.println("Размер списка: "+sum);
        return sum;
    }

    public void addElement(int new_element) {
        Element new_node = new Element(new_element);
        new_node.next = head;
        head = new_node;
        System.out.println("Добавлен элемент: "+new_element);
    }

    Element removeElement() {
        Element temp = head;
        head = temp.next;
        System.out.println("Удален элемент");
        return temp;
    }
}