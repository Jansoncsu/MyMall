package com.mymall.service;

import com.mymall.common.ServerResponse;
import com.mymall.pojo.Category;
import java.util.List;

public interface ICategoryService {


    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
