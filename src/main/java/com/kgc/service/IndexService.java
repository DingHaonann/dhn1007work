package com.kgc.service;

import com.kgc.pojo.Assets;

import java.util.List;

/**
 * @author shkstart
 */
public interface IndexService {
    List<Assets> selall();

    List<Assets> selBy(String id);

    int add(Assets assets);
}
