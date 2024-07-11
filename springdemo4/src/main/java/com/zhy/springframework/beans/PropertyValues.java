package com.zhy.springframework.beans;


import com.zhy.springframework.beans.PropertyValue;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO 属性集合
 * @Classname PropertyValues
 * @Date 2024/7/10 22:12
 * @Created by Shinelon
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList=new ArrayList<>();
    public void addPropertyValue(PropertyValue pv){
        this.propertyValueList.add(pv);
    }
    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValues(String propertyName){
        for(PropertyValue pv:propertyValueList){
            if(pv.getName().equals(propertyName)){
                return pv;
            }
        }
        return null;
    }
}
