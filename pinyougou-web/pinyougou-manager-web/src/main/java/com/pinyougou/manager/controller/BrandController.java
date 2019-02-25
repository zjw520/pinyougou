package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 品牌控制器
 *
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2019-02-25<p>
 */
@RestController // @Controller + @ResponseBody
public class BrandController {

    /**
     * 配置引用服务
     * timeout : 超时毫秒数 1000毫秒
     * */
    @Reference(timeout = 10000)
    private BrandService brandService;

    // @RequestMapping(method = RequestMethod.GET)
    // [{},{}]
    @GetMapping("/brand/findAll")
    public List<Brand> findAll(){
        // com.alibaba.dubbo.common.bytecode.proxy0@162a79c
        System.out.println("brandService: " + brandService);
        return brandService.findAll();
    }
}
