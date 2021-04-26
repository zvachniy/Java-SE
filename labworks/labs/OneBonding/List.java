package labs.OneBonding;

public class List {
    Element head = null;
    public int data;   //хранение данных

    public void addElement(Element e) {
        e.element = head;
        head = e;
        //добавление элемента в начало списка
    }

    public int getSize() {
        //возвращает размер списка
        int size = 0;
        Element index = head;
        while (index != null) {
            index = index.element;
            size++;
        }
        return size;
    }

    public int removeFirst() {
        int r = 0;
        int orderElement = 1;
        int firstOrder = getSize();
        Element index = head;
        while (index != null) {
            if (firstOrder == orderElement) {
                r = index.value;
                index.value=0;

                //index = null;
                break;
            }
            index = index.element;
            firstOrder--;
        }
        System.out.print(" FIRST VALUE ---->");
        return r;

    }

    public int remove(int value) {
        int removed ;
        removed = value;
        Element index = head;
        while (index != null) {
            if (index.value == removed) {

                //System.out.println("JYJ=>>>>" + removed);
                removed = index.value;
                index.element = null;
                break;
            } else
                index = index.element;

        }
        return removed;
    }

    public void showList() {
        Element index = head;
        while (index != null) {
            System.out.println(index.value);
            index = index.element;
        }
        System.out.println("- - - - - - - -");
    }
}
