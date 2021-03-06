package com.gb.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gb.gulimall.product.dao.BrandDao;
import com.gb.gulimall.product.entity.BrandEntity;
import com.gb.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UTFDataFormatException;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        /*brandEntity.setDescript("华为");
        brandService.save(brandEntity);
        System.out.println("----------保存成功！----------");*/

        /*brandEntity.setBrandId(1L);
        brandEntity.setLogo("华为Logo");
        brandService.updateById(brandEntity);
        System.out.println("----------修改成功！----------");*/

        List<BrandEntity> brand = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand.forEach(item -> {
            System.out.println(item);
        });
    }

}
