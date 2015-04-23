package SingleLinkList;

public class TestLinkList { 
	 
    public static void main(String[] args) { 
        LinkList linkList = new LinkList(); 
         
        linkList.insert(20); 
        linkList.insert(80); 
        linkList.insert(40); 
        linkList.insert(60); 
        linkList.display(); 
        System.out.println(); 
 
        System.out.println("找到节点，数据为：" + linkList.find(80).getData()); 
         
        linkList.insert(100, 0); 
        linkList.display(); 
         
        System.out.println(); 
         
        linkList.delete(80); 
        linkList.display(); 
    } 
} 