package com.company.zomato;
import java.util.List;

public class Test {
}
class Restaurant {
    long restaurantId;
    String name;
    Address Address;
    FoodMenu FoodMenu;

}
interface IRestaurantService {
    FoodMenu addMenu(FoodMenu foodMenu);
    FoodMenu updateMenu(long foodMenuId, FoodMenu foodMenu);
    boolean registerRestaurant(Restaurant restaurant);
}
class FoodMenu {
    long id;
    List<Foods> foods;
    long restaurantId;
    FoodMenuType foodMenuType;
}
enum FoodMenuType {
    Meal, Cuisine
}
class Foods {
    long id;
    String foodName;
    FoodType foodType;
    double amount;
    long foodMenuId;
}
enum FoodType {
    Chinese, Soup, Salads
}
class Address {
    String city;
    String state;
    long pinCode;

}
interface  IUserService {
    User createProfile(User user) ;
    User updateProfile(long userId, User user);
    boolean deleteProfile(long userId);

}
interface IOrderService {
    Order placeOrder(Order order);
    void  cancelOrder(int orderId);
    List<Order> getAllOrders() ;

}
interface ISearchFeature {
    Restaurant searchRestaurant(String restaurantName);
    List<Restaurant> searchRestaurantByCity(String cityName);
    FoodMenu seeFoodMenu(FoodMenuType foodMenuType);  //User can see the foodmenu. User can get the food items based on Meal type or Cuisine type.
}
interface ICartService {
    Carts addItemCart(Foods food)  ;
    Carts removeItem(Foods foods) ;
    List<Foods> getAllinCart() ;
}
class User {
    long id;
    String name;
    List<Address> addresses;


}
interface IBillService {
    Bill makePayment(Order order);
}
class Carts {
    long cartId;
    List<Foods>foods;
}
class Order {
    long orderId;
    List<Foods> foods ;
    double amount ;
    Payment payment;
    long userId;
    OrderStatus orderStatus;
}
enum  OrderStatus {
    Success, Delivered
}
class  Payment {
    long paymentId;
    PaymentType paymentType;
    PaymentStatus paymentStatus;
}
enum PaymentType {
    UPI, WALLET
}
enum  PaymentStatus {
    PENDING, COMPLETED
}
class Bill {
    long id;
    Order order;
    Coupon coupon;
    double taxes;
    double prices;
    Payment Payment;
}
class Coupon {
    long couponId;
    String couponCode;
    CouponType couponType;
}
enum CouponType {
    PAYTM_OFFER, AXIS_BANK
}