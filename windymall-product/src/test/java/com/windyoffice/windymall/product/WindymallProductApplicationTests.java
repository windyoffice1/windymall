package com.windyoffice.windymall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.windyoffice.windymall.product.entity.BrandEntity;
import com.windyoffice.windymall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class WindymallProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    void testBrandService() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("华为");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
        //System.out.println();
        List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandEntityList.forEach((item ->{
            System.out.println(item);

        }));
    }

}
