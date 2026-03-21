public class LoggerDemo {
    public static void main(String[] args) {
        UserService userService = new UserService();
        OrderService orderService = new OrderService();

        userService.createUser();
        orderService.createOrder();
    }
}
