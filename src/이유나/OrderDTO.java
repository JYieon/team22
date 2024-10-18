package 이유나;

import java.util.ArrayList;

public class OrderDTO {
    private ArrayList<String> orderList;

    public OrderDTO() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(String item) {
        orderList.add(item);
    }

    public ArrayList<String> getOrderList() {
        return orderList;
    }

    public boolean isEmpty() {
        return orderList.isEmpty();
    }
}