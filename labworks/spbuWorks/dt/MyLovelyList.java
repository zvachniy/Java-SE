package spbuWorks.dt;


public class MyLovelyList {
    Element head = null;


    public int getListSize() {
        int i = 0;
        Element g = head;
        while (g != null) {
            g=g.element;
            i++;
        }

        return i;
    }

    public void addToList(Element e) {
        e.element = head;
        head = e;
    }

    public void showList() {
        Element t = head;
        while (t != null) {
            System.out.println(t.value);
            t = t.element;  // двигает по списку  к следующему
        }
    }

    public static void main(String[] args) {
        MyLovelyList myList = new MyLovelyList();
        myList.addToList(new Element(101));
        myList.addToList(new Element(202));
        myList.addToList(new Element(303));
        myList.showList();
        System.out.println(myList.getListSize());
        myList.addToList(new Element(42));
        myList.showList();
        System.out.println(myList.getListSize());
    }
}
