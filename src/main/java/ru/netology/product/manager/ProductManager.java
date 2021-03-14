package ru.netology.product.manager;

import ru.netology.product.domain.Book;
import ru.netology.product.domain.Product;
import ru.netology.product.domain.Smartphone;
import ru.netology.product.repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository = new ProductRepository();
    public Product[] searcyBy(String text) {
        Product[] result = new Product[0];
        for (Product product: repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;

    }

    public void addProduct(Product product) {
        repository.save(product);
    }


    public boolean matches(Product product, String search) {
        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getName().equalsIgnoreCase(search)) {
                return true;
            }
            if (book.getAuthor().equalsIgnoreCase(search)) {
                return true;
            }

        }

        if (product instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) product;
            if (smartphone.getName().equalsIgnoreCase(search)) {
                return true;
            }
            if (smartphone.getManufacturer().equalsIgnoreCase(search)) {
                return true;
            }

        }
        return false;

    }

    public int getLengthRepository(){
        return repository.findAll().length;
    }


}
