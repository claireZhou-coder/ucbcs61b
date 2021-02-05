public class TailList extends SList implements TestInterface{
	// The "head" and "size" fields are inherited from SList. 
	private SListNode tail;

	public TailList() {
		// SList() constructor called automatically; sets size = 0, head = null
		tail = null;
		tail = null;
	}

    //for Part IV
	public String toString() {
    int i;
    Object obj;
    String result = "[  ";

    SListNode cur = head;

    while (cur != null) {
      obj = cur.item;
      result = result + obj.toString() + "  ";
      cur = cur.next;
    }
    result = result + "]" + " (from subclass)";
    return result;
  }

  	public String useSuper(){
  		return super.toString();
  	}

	public static void main (String[] args) {

	//Part I problem (b)
	SList x;
	TestInterface ti = new TailList();
	TailList y = new TailList();
	y.insertFront(new Integer(1));
	x = y;
	// y = (TailList)x;
	                   
	//Part I problem (c)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	// SList[] xa = new TailList[5];
	// TailList[] ya;
	// ya = (TailList[])xa;
	// xa = ya;

	//Part II
	System.out.println(y.nth(1));

	//Part III
	System.out.println(y.a);
	System.out.println(x.returnSamea());

	//Part IV
	SList yyy = (SList) (y);
	System.out.println(yyy instanceof SList);
	System.out.println(yyy instanceof TailList);
	System.out.println(((SList)y).toString());
	System.out.println(y.useSuper());
	}
 }

