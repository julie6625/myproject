package OOO;

public class HelloDemo {
	public static void main(String[] args){
	Hello hello = new Hello("Java"); 
	hello.hello();
	//呼叫hello
	
	hello.setName("Caterpiller");
	hello.hello();
	// 呼叫 setName()改變 name 的參考對象
	
	
	}
}
