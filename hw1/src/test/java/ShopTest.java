import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ru.gbhw.Product;
import ru.gbhw.Shop;

public class ShopTest {
    
    @Test
    public void testShopSortProductsByPrice(){
        Shop shop = new Shop();
        shop.addProduct(30, "test");
        shop.addProduct(15, "test1");
        shop.addProduct(45, "test2");
        shop.addProduct(33, "test3");

        //Массив для сравнения, уже отсортированный
        Shop sortShop = new Shop();
        sortShop.addProduct(15, "test1");
        sortShop.addProduct(30, "test");
        sortShop.addProduct(33, "test3");
        sortShop.addProduct(45, "test2");

        shop.sortProductsByPrice();
        
        //Проверка всех элементов после выполнения сортировки
        for(int i = 0; i < shop.size(); i++){
            assertThat(shop.getProduct(i).toString()).isEqualTo(sortShop.getProduct(i).toString());
        }
    }

    @Test
    public void testGetMostExpensiveProduct(){
        Shop shop = new Shop();
        shop.addProduct(30, "test");
        shop.addProduct(15, "test1");
        shop.addProduct(45, "test2");
        shop.addProduct(33, "test3");

        //Проверка поиска самого дорогого продукта
        assertThat(shop.getMostExpensiveProduct().toString()).isEqualTo(new Product(45, "test2").toString());
    }
}
