import org.example.ApiController;
import org.example.Main;
import org.example.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Main.class)
public class ApiControllerTest {

    private List<Product> dummyProducts;

    @BeforeEach
    public void setUp() {
        dummyProducts = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            dummyProducts.add(new Product("imageURL" + i, "productName" + i, i * 10.0, i * 10, i % 2 == 0));
        }
    }

    @Test
    public void testGetPagedApi() {
        Product product1 = new Product("imageURL1", "productName1", 100.0, 10, true);
        List<Product> products = ApiController.getPagedApi(1, 15);

        assertEquals(15, products.size());
        assertEquals(product1.getProductName(), products.get(0).getProductName());
    }


    @Test
    public void testPaginationLogic() {
        int page = 1;
        int numberOfProducts = 20;
        int start = (page - 1) * numberOfProducts;
        int end = Math.min(start + numberOfProducts, dummyProducts.size());
        List<Product> expectedProducts = dummyProducts.subList(start, end);
        List<Product> actualProducts = ApiController.getPagedApi(page, numberOfProducts);

        assertEquals(expectedProducts.size(), actualProducts.size());
    }
}
