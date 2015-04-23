package SingleLinkList;

public class TestLink { 
	 
    public static void main(String[] args) { 
        Link link1 = new Link(10); 
        Link link2 = new Link(50); 
        Link link3 = new Link(20); 
        Link link4 = new Link(100); 
         
        link1.setNext(link2); 
        link2.setNext(link3); 
        link3.setNext(link4); 
         
        System.out.println(link1.getData()); 
        System.out.println(link1.getNext().getData()); 
        System.out.println(link1.getNext().getNext().getData()); 
        System.out.println(link1.getNext().getNext().getNext().getData()); 
    } 
} 