package com.wangming.pattern.structural.composite;

/**
 * @Author: ming.wang
 * @Date: 2019/2/26 11:00
 * @Description:
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponent component) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogComponent component) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print( ) {
        throw new UnsupportedOperationException("不支持打印操作");
    }


}
