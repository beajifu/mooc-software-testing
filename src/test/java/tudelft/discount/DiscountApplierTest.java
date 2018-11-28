package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    void discountForHome() {

        Product p1 = new Product("product1", 100.0, "HOME");
        Product p2 = new Product("product2", 100., "BUSINESS");
        Product p3 = new Product("product3", 100., "OTHER");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(p1,p2,p3);
        Mockito.when(dao.all()).thenReturn(results);

        new DiscountApplier(dao).setNewPrices();
        double resultHome = dao.all().get(0).getPrice();
        double resultBusiness = dao.all().get(1).getPrice();
        double resultOther = dao.all().get(2).getPrice();

        Assertions.assertEquals(90.0, resultHome);
        Assertions.assertEquals(110.0, resultBusiness);
        Assertions.assertEquals(100.0, resultOther);
    }
}
