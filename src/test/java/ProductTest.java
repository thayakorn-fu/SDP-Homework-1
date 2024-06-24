import org.example.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testProduct() {
        Product product = new Product("imageURL", "productName", 100.0, 10, true);

        assertEquals("imageURL", product.getImageURL());
        assertEquals("productName", product.getProductName());
        assertEquals(100.0, product.getPrice());
        assertEquals(10, product.getStock());
        assertEquals(true, product.isAvailability());
    }
}