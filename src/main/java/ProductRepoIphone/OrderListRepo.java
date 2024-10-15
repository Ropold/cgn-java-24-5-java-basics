package ProductRepoIphone;


import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public Order getOrderById(int id){
        for (Order order : orders){
            if(order.id()==id){ //wieso nicht nur id
                return order;
            }
        }
        System.out.println("Order not found");
        return null;
    }

    public Order addOrder (Order newOrder){
        orders.add(newOrder);
        return newOrder;
    }

    public void removeOrder (int id){
        for(Order order : orders){
            if(order.id()==id){
                orders.remove(order);
            }
        }
        System.out.println("Not found id");
    }
}
