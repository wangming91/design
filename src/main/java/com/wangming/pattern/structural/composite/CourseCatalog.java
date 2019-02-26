package com.wangming.pattern.structural.composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ming.wang
 * @Date: 2019/2/26 11:06
 * @Description:
 */
@Getter
@Setter
@ToString
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent component) {
        items.add(component);
    }

    @Override
    public void remove(CatalogComponent component) {
        items.remove(component);
    }

    @Override
    public String getName(CatalogComponent component) {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (CatalogComponent component : items) {
            if (this.level != null) {
                for (int i = 0; i < level; i++) {
                    System.out.print("  ");
                }
            }
            component.print();
        }
    }
}
