package model;

public class StackXInterface {
    private StackX stack;

    public StackXInterface( int s ){
        this.stack= new StackX(s);
        for (int i = 0; i < s; i++){
            stack.push((long) (Math.random()) * 100);
        }


    }

    public void clearRewrite(){
        while (!stack.isEmpty()){
            stack.pop();
        }
        for (int i = 0; i < 19; i++) {
            stack.push((long) (Math.random() * 100));

        }
    }
    public  void addItem(int j){

        stack.peek();
        stack.push(j);
    }
    public String display(){
        return stack.display();}
    public  void deleteValue() {
        stack.pop();
    }
    public boolean searchingNumber(int number){return stack.display().contains(String.valueOf(number));}
}

