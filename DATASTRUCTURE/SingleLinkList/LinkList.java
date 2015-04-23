package SingleLinkList;

/**
* 链表：核心思想：链表中只包含一个数据项，即对第一个连接点的引用
* @author hadoop
*
*/
public class LinkList {

	private Link first;

	// 插入
	public void insert(long value){
		Link link = new Link(value);
		if(first == null)
			first = link;
		else{
			link.setNext(first);
			first = link;
		}
	}

	// 打印链表
	public void display(){
		Link current = first;
		while(current != null){
			System.out.print(current.getData() + " ");
			current = current.getNext();
		} 
	}

// 查询链表
	public Link find(long key){
		Link current = first;
		while(current.getData() != key){
			if(current.getNext() == null)
				return null;
			current = current.getNext();
		}
	 return current;
	}

	// 插入节点到指定位置
	public void insert(long value, int pos){
		if(pos == 0)
			insert(value);
		else{
			Link current = first;
			for(int i = 0; i < pos - 1; i++)
				current = current.getNext();
			Link link = new Link(value);
			link.setNext(current.getNext());
			current.setNext(link);
		}
	}

// 删除节点
	public void delete(long value){
		Link current = first;
		Link ago = first;
		while(current.getData() != value){
			if(current.getNext() == null)
				return;
			else{
				ago = current;
				current = current.getNext();
			}
		}
		if(current == first)
			first = first.getNext();
		else
			ago.setNext(current.getNext());
	}
}
