package com.kgc.service.impl;

import com.kgc.mapper.AssetsMapper;
import com.kgc.pojo.Assets;
import com.kgc.pojo.AssetsExample;
import com.kgc.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    AssetsMapper assetsMapper;

    @Override
    public List<Assets> selall() {
        return assetsMapper.selectByExample(null);
    }

    @Override
    public List<Assets> selBy(String id) {
        AssetsExample example = new AssetsExample();
        AssetsExample.Criteria criteria = example.createCriteria();
        criteria.andAssetidEqualTo(id);
        return assetsMapper.selectByExample(example);
    }

    @Override
    public int add(Assets assets) {
        return assetsMapper.insert(assets);
    }
}
