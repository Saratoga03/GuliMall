package com.gb.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gb.gulimall.product.entity.CategoryEntity;
import com.gb.gulimall.product.service.CategoryService;
import com.gb.common.utils.PageUtils;
import com.gb.common.utils.R;



/**
 * 商品三级分类
 *
 * @author Sara
 * @email _Yuuko_@outlook.com
 * @date 2022-03-27 19:47:52
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查询三级分类信息并组装成树形结构
     */
    @RequestMapping("/list/tree")
    public R list(@RequestParam Map<String, Object> params){
        List<CategoryEntity> entities = categoryService.getListWithTree();

        return R.ok().put("page", entities);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    // @RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.insertInfo(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateInfoById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R logicDelete(@RequestBody Long[] catIds){
		categoryService.logicDeleteInfoByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
