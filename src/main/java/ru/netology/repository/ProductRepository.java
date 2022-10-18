package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    Product[] products = new Product[0];

    public Product[] findAll() {
        return products;
    }

    public void add(Product product) {
        Product[] temp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];

        }
        temp[temp.length - 1] = product;
        products = temp;
    }

    public void removeById(int removeId) {
        Product[] temp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != removeId) {
                temp[index] = product;
                index++;
            }
        }

        products = temp;
    }
}
