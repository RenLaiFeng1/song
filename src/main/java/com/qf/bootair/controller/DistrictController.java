package com.qf.bootair.controller;

import com.github.pagehelper.PageInfo;
import com.qf.bootair.entity.District;
import com.qf.bootair.entity.R;
import com.qf.bootair.service.DistrictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @Date 2023/5/29 10:47
 * @Author 人来疯
 * Version v1.0
 */
@RestController
@RequestMapping("dis")
@RequiredArgsConstructor
@Api(tags = "区域控制器")
public class DistrictController {
    final DistrictService districtService;

    @RequestMapping(value = "list",method = {RequestMethod.GET,RequestMethod.POST})
    @ApiOperation("分页查询区域信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "当前页"),
            @ApiImplicitParam(name = "size",value = "页大小")
    })
    public R<PageInfo<District>> listByPage(@RequestParam(value = "page",required = false,defaultValue = "1")Integer page,
                                            @RequestParam(value = "size",required = false,defaultValue = "10")Integer size){
        PageInfo<District> pageInfo= districtService.selectByPage(page,size);
        return R.ok(pageInfo);
    }

    @GetMapping("{id}")
    @ApiOperation("根据ID查询区域")
    @ApiImplicitParam(name="id",value = "区域ID",required = true)
    public R<District> findById(@PathVariable Integer id){
        District district = districtService.selectById(id);
        return R.ok(district);
    }

    @PostMapping("add")
    @ApiOperation("新增区域")
    @ApiImplicitParam(name = "district",value = "区域",required = true)
    public R<String> add(@RequestBody District district){
        if (districtService.insert(district)){
            return R.ok("新增成功");
        }
        return R.ok("新增失败");
    }

    @PostMapping("update")
    @ApiOperation("更新区域")
    @ApiImplicitParam(name = "district",value = "区域",required = true)
    public R<String> update(@RequestBody District district){
        if (districtService.insert(district)){
            return R.ok("更新成功");
        }
        return R.ok("更新失败");
    }

    @DeleteMapping("{id}")
    @ApiOperation("根据ID删除区域")
    @ApiImplicitParam(name = "id",value = "区域ID",required = true)
    public R<String> deleteById(@PathVariable Integer id){
        if (districtService.deleteById(id)){
            return R.ok("删除成功");
        }
        return R.ok("删除失败");
    }
}
