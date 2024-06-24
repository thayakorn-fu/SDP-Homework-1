import org.example.ApiController;
import org.example.Main;
import org.example.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest(classes = Main.class)
public class ApiControllerTest {

    @MockBean
    private ApiController apiController;

    @Test
    public void testGetPagedApi() {
        Product product1 = new Product("imageURL1", "productName1", 100.0, 10, true);
        Product product2 = new Product("imageURL2", "productName2", 200.0, 20, false);

        when(apiController.getPagedApi(1, 15)).thenReturn(List.of(product1, product2));

        List<Product> products = apiController.getPagedApi(1, 15);

        assertEquals(2, products.size());
        assertEquals(product1, products.get(0));
        assertEquals(product2, products.get(1));
    }
}