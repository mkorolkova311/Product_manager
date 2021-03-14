package ru.netology.product.domain;

import org.junit.jupiter.api.Test;
import ru.netology.product.manager.ProductManager;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    public void shouldEmptyManager() {
        ProductManager manager = new ProductManager();
        assertEquals(0, manager.searcyBy("Гарри Поттер").length);


    }

    @Test
    public void shouldAddOneProduct() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Гарри Поттер", 300, "Джоан Роулинг");
        manager.addProduct(book1);
        assertEquals(book1, manager.searcyBy("Гарри Поттер")[0]);



    }

    @Test
    public void shouldSomeProducts() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Гарри Поттер", 300, "Джоан Роулинг");
        Product book2 = new Book(2, "Гордость и предубеждение", 200, "Джейн Остин");
        Product smartphone1 = new Smartphone(1, "S10", 45000, "Samsung");
        Product smartphone2 = new Smartphone(2, "Iphone 12", 70000, "Apple");
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(smartphone1);
        manager.addProduct(smartphone2);
        assertEquals(4, manager.getLengthRepository() );


    }


}