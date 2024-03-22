public class CandyRoll {
    private Node front;
    private Node back;
    private int numCandy;

    public CandyRoll(){
        this.front = null;
        this.back = null;
        this.numCandy = 0;
    }

    public boolean hasMoreCandy(){
        if (front != null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean canFitMoreCandy(){
        return true;
    }

    public void removeCandy(){
        if (hasMoreCandy()){
            front = front.next;
            numCandy--;
        }
        else{
            System.out.println("Candy roll is empty!");
        }
    }

    public Candy lookAtFrontCandy(){
        if(hasMoreCandy()){
            return front.candy;
        }
        else{
            return null;
        }
    }
    public Candy lookAtBackCandy(){
        if(hasMoreCandy()){
            return back.candy;
        }
        else{
            return null;
        }
    }
    public void addCandy(Candy newCandy){
        if(numCandy == 0) {
            Node n = new Node();
            n.candy = newCandy;
            back = n;
            front = n;
            numCandy++;
        }
        else{
            Node n = new Node();
            n.candy = newCandy;
            back.next = n;
            back = n;
            numCandy++;
        }
    }

    public boolean isEmpty(){
        if (front.candy == null){
            return true;
        }
        else {return false;}
    }
}

class Node{
    Candy candy;
    Node next;
}
