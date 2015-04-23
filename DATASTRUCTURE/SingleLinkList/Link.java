package SingleLinkList;

public class Link { 
	 
    // 数据域  
    private long data; 
     
    // 指针域  
    private Link next; 
     
    // 构造函数  
    public Link(long data) { 
        this.data = data; 
    } 
 
    public long getData() { 
        return data; 
    } 
 
    public void setData(long data) { 
        this.data = data; 
    } 
 
    public Link getNext() { 
        return next; 
    } 
 
    public void setNext(Link next) { 
        this.next = next; 
    }  
} 
