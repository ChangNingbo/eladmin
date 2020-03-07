package com.james.modules.system.service;

import com.james.modules.system.domain.Dict;
import com.james.modules.system.service.dto.DictDto;
import com.james.modules.system.service.dto.DictQueryCriteria;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @version v1.0
 * @Description: TODO
 * @Author: cnb
 * @Date: 2020/3/5 16:58
 */
public interface DictService {

    /**
     * 分页查询
     * @param criteria 条件
     * @param pageable 分页参数
     * @return /
     */
    Map<String,Object> queryAll(DictQueryCriteria criteria, Pageable pageable);

    /**
     * 查询全部数据
     * @param dict /
     * @return /
     */
    List<DictDto> queryAll(DictQueryCriteria dict);

    /**
     * 根据ID查询
     * @param id /
     * @return /
     */
    DictDto findById(Long id);

    /**
     * 创建
     * @param resources /
     * @return /
     */
    DictDto create(Dict resources);

    /**
     * 编辑
     * @param resources /
     */
    void update(Dict resources);

    /**
     * 删除
     * @param id /
     */
    void delete(Long id);

    /**
     * 导出数据
     * @param queryAll 待导出的数据
     * @param response /
     * @throws IOException /
     */
    void download(List<DictDto> queryAll, HttpServletResponse response) throws IOException;
}
