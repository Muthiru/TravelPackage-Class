public interface Discount {
    double discountAmount();
    default void displayDiscount(){
        System.out.println("Discount"+ discountAmount());;
    }
}
