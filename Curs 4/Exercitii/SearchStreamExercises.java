package Exercitii;

import entity.Customer;
import entity.Order;

import java.util.List;

public class SearchStreamExercises {

    //TODO: return the Order in the list with the given id
    public Order e1_getOrderById(List<Order> orders, long orderId) {
        return null;
    }


    //TODO: return true if customer has at least one order with status ACTIVE
    public boolean e2_hasActiveOrders(Customer customer) {
        return false;
    }


    //TODO: an Order can be returned if it doesn't contain any OrderLine with isSpecialOffer()==true
    public boolean e3_canBeReturned(Order order) {
        return false;
    }


    // TODO: return the Order with maximum getTotalPrice (the most expensive Order, or null if no Orders)
    // TODO Challenge: return an Optional<creationDate>
    public Order e4_getMaxPriceOrder(Customer customer) {
        return null;
    }


    //TODO: return last 3 Orders sorted descending by creationDate
    public List<Order> e5_getLast3Orders(Customer customer) {
        return null;
    }
}
