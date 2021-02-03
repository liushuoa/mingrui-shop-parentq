package com.baidu.shop.service;

import com.baidu.shop.base.Result;
import com.baidu.shop.entity.CategoryEntity;
import com.google.gson.JsonObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
public interface CategoryService {

    @ApiOperation(value = "通过查询商品分类")
    @GetMapping(value = "category/list")
    Result<List<CategoryEntity>> getCategoryByPid(Integer pid);

    @ApiOperation(value = "删除商品分类")
    @DeleteMapping(value = "category/delete")
    Result<JsonObject> deleteCategoryByPid(Integer id);

    @ApiOperation(value = "通过id修改")
    @PutMapping(value = "category/edit")
    Result<JsonObject> editCategoryByPid(@RequestBody CategoryEntity categoryEntity);

    @ApiOperation(value = "新增")
    @PostMapping(value = "category/save")
    Result<JsonObject> saveCategory(@RequestBody CategoryEntity categoryEntity);

    @ApiOperation(value = "通过品牌id查询分类信息")
    @GetMapping(value = "category/brand")
    Result<List<CategoryEntity>> getCategoryByBrandId(Integer brandId);
}
