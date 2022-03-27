package designprinciples.solid.singleresponsability;

public class SingleResponsability {

    /**
     * - a class should have only one reason to change
     * - like the Date class for data related features only
     * - a feeling of "and"
     *
    */
    public static void main(String[] args) {

    }
}

class ProductService {

    private NotificationService notificationService;

    public void addProduct() {
        System.out.println("add product logic...");
    }

    public Product getProduct() {
        return null;
    }

    public Product getProductById(Long id) {
        return null;
    }
}

class NotificationService {

    public void sendSms() {
        System.out.println("sms sent");
    }

    public void sendHtmlEmail() {
        System.out.println("email sent");
    }

    public void sendTextEmail() {
        System.out.println("email sent");
    }
}

class Product {
    private String name;
}