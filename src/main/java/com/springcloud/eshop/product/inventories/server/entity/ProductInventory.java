package com.springcloud.eshop.product.inventories.server.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.springcloud.eshop.product.inventories.server.support.base.XbootBaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_product_inventory")
@TableName("t_product_inventory")
public class ProductInventory extends XbootBaseEntity {

    @ApiModelProperty("商品库存的数量")
    private Integer inventoryNum;

    @ApiModelProperty("商品库存对应的商品id")
    private String productId;
}
