package ru.netology.product.domain;

import org.junit.jupiter.api.Test;
import ru.netology.product.manager.ProductManager;
import ru.netology.product.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    public void shouldEmptyManager() {
        ProductManager manager = new ProductManager();
        Product[] actual = new Product[]{};
        Product[] expected = manager.searchBy("Гарри Поттер");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneProduct() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Гарри Поттер", 300, "Джоан Роулинг");
        manager.addProduct(book1);
        Book book2 = new Book(1, "Гарри Поттер", 300,"Джоан Роулинг");
        Product[] actual = new Product[]{book2};
        Product[] expected = manager.searchBy("Гарри Поттер");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSomeProducts() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Гарри Поттер", 300, "Джоан Роулинг");
        Product book2 = new Book(2, "Гордость и предубеждение", 200, "Джейн Остин");
        Product smartphone1 = new Smartphone(3, "S10", 45000, "Samsung");
        Product smartphone2 = new Smartphone(4, "Iphone 12", 70000, "Apple");
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(smartphone1);
        manager.addProduct(smartphone2);
        Product[] expected = new Product[]{book1,book2,smartphone1,smartphone2};
        Product[] actual = manager.getAll();
        assertArrayEquals(expected, actual );
    }
}