package cc.syth.sweet.area.dao.mapper;

import cc.syth.sweet.area.entity.AreaDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据表area操作接口
 *
 * @author 世有桃花
 * @since 2019/08/30
 */
@Repository("areaDOMapper")
public interface AreaDOMapper {

    /**
     * 根据行政区编号获取AreaDO对象
     * <p>传入包含待查询行政区编号的AreaDO对象，返回包含全部信息的AreaDO对象</p>
     *
     * @param areaDO 包装待查询行政区编号,仅需要有效的AreaDO.id属性
     * @return 若数据库存在待查询行政区编号的记录则返回的包含记录全部信息的AreaDO对象，
     * 否则返回null
     */
    AreaDO getAreaDOById(AreaDO areaDO);

    /**
     * 获取当前行政区全部直属下级行政区
     * <p>传入包含当前行政区编号的AreaDO对象，返回其全部直属下级行政区的List集合</p>
     *
     * @param areaDO 包装当前行政区编号,仅需要有效的AreaDO.id属性
     * @return 若存在直属下级行政区则返回下级行政区的List集合，否则返回size为0的List集合
     */
    List<AreaDO> listChildren(AreaDO areaDO);

}