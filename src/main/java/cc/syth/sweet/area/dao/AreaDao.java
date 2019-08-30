package cc.syth.sweet.area.dao;

import cc.syth.sweet.area.dao.mapper.AreaDOMapper;
import cc.syth.sweet.area.entity.AreaDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 行政区持久化操作类
 * <p>提供行政区操作方法</p>
 *
 * @author 世有桃花
 * @since 2019/08/30
 */
@Repository("areaDao")
public final class AreaDao {

    private static final Logger log = LoggerFactory.getLogger(AreaDao.class);

    private AreaDOMapper areaDOMapper;

    @Autowired
    public AreaDao(AreaDOMapper areaDOMapper) {
        this.areaDOMapper = areaDOMapper;
    }

    /**
     * 根据行政区编号获取AreaDO对象
     * <p>把待查询行政区编号包装成AreaDO对象，调用下层方法，获取包含全部信息的AreaDO对象</p>
     *
     * @param id 待查询行政区编号
     * @return 若数据库存在待查询行政区编号的记录则返回的包含该记录全部信息的AreaDO对象，
     * 否则返回null
     */
    public AreaDO getAreaDOById(Short id) {
        AreaDO areaDO = new AreaDO();
        areaDO.setId(id);
        return areaDOMapper.getAreaDOById(areaDO);
    }

    /**
     * 获取当前行政区全部直属下级行政区
     * <p>把当前行政区编号包装成AreaDO对象，调用下层方法，获取其全部直属下级行政区的List集合</p>
     *
     * @param id 当前行政区编号
     * @return 若存在直属下级行政区则返回下级行政区的List集合，否则返回size为0的List集合
     */
    public List<AreaDO> listChildren(Short id) {
        AreaDO areaDO = new AreaDO();
        areaDO.setId(id);
        return areaDOMapper.listChildren(areaDO);
    }

}