package com.baidu.shop.service;

import com.alibaba.fastjson.JSONObject;
import com.baidu.shop.base.Result;
import com.baidu.shop.dto.SpecGroupDTO;
import com.baidu.shop.entity.SpecGroupEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "规格接口")
public interface SpecificationService {

    @ApiOperation(value = "通过条件查询规格数组")
    @GetMapping(value = "specparams/list")
    Result<List<SpecGroupEntity>> getSpecGroupInfo(SpecGroupDTO specGroupDTO);

    @ApiOperation(value = "新增规格组")
    @PostMapping(value = "/specparams/save")
    Result<JSONObject> saveSpecGroupInfo( @RequestBody SpecGroupDTO specGroupDTO);

    @ApiOperation(value = "修改规格")
    @PutMapping(value = "/specparams/save")
    Result<JSONObject> updateSpecGroupInfo(@RequestBody SpecGroupDTO specGroupDTO);

    @ApiOperation(value = "删除规格组")
    @DeleteMapping(value = "/specparams/delete")
    Result<JSONObject> deleteSpecGroupInfo(Integer id);
}
