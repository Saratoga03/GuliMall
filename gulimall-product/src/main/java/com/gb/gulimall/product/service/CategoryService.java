package com.gb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gb.common.utils.PageUtils;
import com.gb.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Sara
 * @email _Yuuko_@outlook.com
 * @date 2022-03-27 19:47:52
 */
public interface CategoryService extends IService<CategoryEntity> {

    /**
     * 查询三级分类信息并组装成树形结构
     * @return
     */
    List<CategoryEntity> getListWithTree();

    /**
     * 保存
     * @param category
     */
    void insertInfo(CategoryEntity category);

    /**
     * 修改
     * @param category
     */
    void updateInfoById(CategoryEntity category);

    /**
     * 删除
     * @param asList
     */
    void logicDeleteInfoByIds(List<Long> asList);
}

