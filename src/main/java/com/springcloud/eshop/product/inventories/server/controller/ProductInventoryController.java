package com.springcloud.eshop.product.inventories.server.controller;

import com.springcloud.eshop.product.inventories.server.entity.ProductInventory;
import com.springcloud.eshop.product.inventories.server.service.ProductInventoryService;
import com.springcloud.eshop.product.inventories.server.support.base.XbootBaseController;
import com.springcloud.eshop.product.inventories.server.support.base.XbootBaseService;
import com.springcloud.eshop.product.inventories.server.support.utils.ServerResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "商品库存服务相关的接口")
@RequestMapping("/product-inventory")
public class ProductInventoryController extends XbootBaseController<ProductInventory , String> {
    @Autowired
    private ProductInventoryService productInventoryService;


    @Override
    public XbootBaseService<ProductInventory, String> getService() {
        return productInventoryService;
    }

    @GetMapping("findProductInventoryByProductId")
    public ServerResponse findProductInventoryByProductId(@RequestParam("productId") String productId) {
        return ServerResponse.createBySuccess(productInventoryService.findProductInventoryByProductId(productId));
    }
}
