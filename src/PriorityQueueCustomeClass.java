import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomeClass {
    public static void main(String[] args){
        PriorityQueue<CustomerClass> myPQCustomer = new PriorityQueue<>();
        System.out.println("Code intiated for custome comperator -------->");
        myPQCustomer.add(new CustomerClass(7, "Saket", "Dhanbad"));
        myPQCustomer.add(new CustomerClass(9, "Kumar", "Housing"));
        myPQCustomer.add(new CustomerClass(5, "Heera", "Colony"));
        myPQCustomer.add(new CustomerClass(3, "Laal", "Jharkhand"));

        System.out.println(myPQCustomer);
    }
}


class CustomerClass implements Comparable<CustomerClass>{
    int id;
    String name;
    String address;

    

    @Override
    public String toString() {
        return "CustomerClass [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
    public CustomerClass(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public int compareTo(CustomerClass o) {
        return o.id > this.id ? 1 : -1;
    }
    
}
