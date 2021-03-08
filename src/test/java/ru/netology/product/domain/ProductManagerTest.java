package ru.netology.product.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    public void shouldProductManagerSearchBy() {
        ProductManager manager = new ProductManager();
        Product book1 = new Book(1, "Гарри Поттер", 300, "Джоан Роулинг");
        Product book2 = new Book(2, "Гордость и предубеждение", 200, "Джейн Остин");
        Product smartphone1 = new Smartphone(1, "S10", 45000, "Samsung");
        Product smartphone2 = new Smartphone(2, "Iphone 12", 70000, "Apple");
        //ProductRepository repo = new ProductRepository();
        manager.addProduct(book1);
        manager.addProduct(book2);
        manager.addProduct(smartphone1);
        manager.addProduct(smartphone2);
        assertEquals(book1, manager.searcyBy("Гарри Поттер")[0]);
        assertEquals(smartphone1, manager.searcyBy("S10")[0]);
        assertEquals(book2, manager.searcyBy("Джейн Остин")[0]);
        assertEquals(smartphone2, manager.searcyBy("Apple")[0]);



    }

}