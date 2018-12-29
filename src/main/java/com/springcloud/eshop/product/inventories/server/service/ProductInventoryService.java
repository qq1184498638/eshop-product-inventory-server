package com.springcloud.eshop.product.inventories.server.service;

import com.springcloud.eshop.product.inventories.server.entity.ProductInventory;
import com.springcloud.eshop.product.inventories.server.support.base.XbootBaseService;

public interface ProductInventoryService extends XbootBaseService<ProductInventory, String> {

    ProductInventory findProductInventoryByProductId(String productId);
}
