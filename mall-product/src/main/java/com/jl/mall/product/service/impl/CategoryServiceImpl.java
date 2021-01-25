package com.jl.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jl.common.utils.PageUtils;
import com.jl.common.utils.Query;
import com.jl.mall.product.dao.CategoryDao;
import com.jl.mall.product.entity.CategoryEntity;
import com.jl.mall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
    //查找所有菜单
        List<CategoryEntity> entities = baseMapper.selectList(null);
    //按父子关系排序好所有菜单
        List<CategoryEntity> menu = entities.stream().filter((e) -> e.getParentCid() == 0).map((e)->{
            e.setChildrens(getChildrens(e,entities));
            return e;
        }).sorted((e1,e2)->(e1.getSort() == null ? 0 : e1.getSort()) - (e2.getSort() == null ? 0 : e2.getSort())).collect(Collectors.toList());

        return menu;
    }

    @Override
    public void deleteCategoryByIds(List<Long> catIds) {
        //逻辑删除 使用mybatis plus配置逻辑删除
        baseMapper.deleteBatchIds(catIds);
    }

    /**
     * 递归菜单排序
     * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all){
        List<CategoryEntity> childrens = all.stream().filter((e)->{
            return e.getParentCid() == root.getCatId();
        }).map((e)->{
            e.setChildrens(getChildrens(e,all));
            return e;
        }).sorted((e1,e2)->{
            return (e1.getSort() == null ? 0 : e1.getSort()) - (e2.getSort() == null ? 0 : e2.getSort());
        }).collect(Collectors.toList());
        return childrens;
    }

}