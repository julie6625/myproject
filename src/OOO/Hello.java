package OOO;

public class Hello {
    private String name;
    
    public Hello(){
        name = "nobody";
    }
 
    public Hello(String one){
        name = one;
    }
 
    public void hello(){
        System.out.print("Hello ");
        System.out.println(this.name);
    }
 
    public void setName(String one){
        name = one;
    }

}
