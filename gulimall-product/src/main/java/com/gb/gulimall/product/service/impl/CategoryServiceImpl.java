package com.gb.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gb.common.utils.PageUtils;
import com.gb.common.utils.Query;

import com.gb.gulimall.product.dao.CategoryDao;
import com.gb.gulimall.product.entity.CategoryEntity;
import com.gb.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    /**
     * 查询三级分类信息并组装成树形结构
     * @return
     */
    @Override
    public List<CategoryEntity> getListWithTree() {
        // 1 查询三级分类信息
        // baseMapper就是ServiceImpl的第一个参数，即CategoryDao
        List<CategoryEntity> categoryList = baseMapper.selectList(null);

        // 2 组装成树形结构
        // 将list转换为stream流操作
        List<CategoryEntity> Menus = categoryList.stream()
                // filter过滤器：选取查询结果中层级为1的分类信息
                .filter(list -> list.getCatLevel() == 1)
                // 设置该分类的子分类
                .map(menu -> {
                    menu.setChildren(getChildren(menu,categoryList));
                    return menu;
                })
                // 排序
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                // 将stream流转换回list
                .collect(Collectors.toList());

        return categoryList;
    }

    /**
     * 保存
     * @param category
     */
    @Override
    public void insertInfo(CategoryEntity category) {
        // TODO check

        baseMapper.insert(category);
    }

    /**
     * 修改
     * @param category
     */
    @Override
    public void updateInfoById(CategoryEntity category) {
        // TODO check

        baseMapper.updateById(category);
    }

    /**
     * 删除
     * @param asList
     */
    @Override
    public void logicDeleteInfoByIds(List<Long> asList) {
        // TODO check

        baseMapper.deleteBatchIds(asList);
    }

    /**
     * 递归获取子分类
     * @param root 当前层级的分类数据
     * @param all 全部分类数据
     * @return
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> Menus = all.stream()
                // 寻找当前层级的子分类
                .filter(list -> list.getParentCid() == root.getCatId())
                // 递归设置该分类的子分类
                .map(menu -> {
                    menu.setChildren(getChildren(menu, all));
                    return menu;
                })
                // 排序
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                // 将stream流转换回list
                .collect(Collectors.toList());

        return Menus;
    }
}