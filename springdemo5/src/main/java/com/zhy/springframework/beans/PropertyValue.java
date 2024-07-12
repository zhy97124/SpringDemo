package com.zhy.springframework.beans;

/**
 * @Description TODO 属性值
 * @Classname PropertyValue
 * @Date 2024/7/10 22:12
 * @Created by Shinelon
 */
public class PropertyValue {
    private String name;
    private Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
