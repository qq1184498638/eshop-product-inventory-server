package com.springcloud.eshop.product.inventories.server.service.impl;

import com.springcloud.eshop.product.inventories.server.entity.ProductInventory;
import com.springcloud.eshop.product.inventories.server.repository.ProductInventoryRepository;
import com.springcloud.eshop.product.inventories.server.service.ProductInventoryService;
import com.springcloud.eshop.product.inventories.server.support.base.XbootBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductInventoryServiceImpl implements ProductInventoryService {
    @Autowired
    private ProductInventoryRepository productInventoryRepository;

    @Override
    public XbootBaseRepository<ProductInventory, String> getRepository() {
        return productInventoryRepository;
    }

    @Override
    public ProductInventory findProductInventoryByProductId(String productId) {
        return productInventoryRepository.findProductInventoryByProductId(productId);
    }
}
