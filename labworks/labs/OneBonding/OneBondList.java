package labs.OneBonding;

public class OneBondList {
    public static void main(String[] args) {
        List list=new List();
        list.addElement(new Element(11));
        list.addElement(new Element(12));
        list.addElement(new Element(13));
        list.addElement(new Element(14));
        list.showList();
        list.addElement(new Element(56));
        list.showList();
        System.out.println(list.removeFirst());
        //list.remove(12);
        //System.out.println(list.remove(13));
        list.showList();
    }
}


