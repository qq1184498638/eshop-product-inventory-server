package com.springcloud.eshop.product.inventories.server.repository;

import com.springcloud.eshop.product.inventories.server.entity.ProductInventory;
import com.springcloud.eshop.product.inventories.server.support.base.XbootBaseRepository;

public interface ProductInventoryRepository extends XbootBaseRepository<ProductInventory, String> {

    ProductInventory findProductInventoryByProductId(String productId);
}
