package com.liuli.design.demo.filter;

import java.util.List;

/**
 * 过滤器接口
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
