package hello.core.order;

public interface OrderService {

    Order createOrder(Long memberI, String itemName, int itemPrice);
}
