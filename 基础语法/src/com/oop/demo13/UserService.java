package com.oop.demo13;

/**
 * 作者：whl
 * 日期：2023-06-08 19:19
 * 描述：接口,增删改查
 */
public interface UserService {
    void add(String name);
    void delete(String name);
    void update(String name);
    void search(String name);

}
