package cc.syth.sweet.area.dao;

import cc.syth.sweet.area.entity.AreaDO;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:springMVC-servlet.xml"})
@WebAppConfiguration("src/main/resources")
final class AreaDaoTest {

    private static final Logger log = LoggerFactory.getLogger(AreaDaoTest.class);

    @Autowired
    private AreaDao areaDao;

    /**
     * 测试根据行政区编号查询areaDO对象
     * <p>若返回的AreaDO对象中的行政区名符合预期，则测试通过</p>
     *
     * @param id   待查询行政区编号
     * @param name 预期的行政区名
     */
    @ParameterizedTest
    @CsvSource({"2808,'陕西省'", "2907,'安康市'", "2916,'旬阳县'"})
    void getAreaDOById(Short id, String name) {
        AreaDO areaDO = areaDao.getAreaDOById(id);
        assertEquals(name, areaDO.getName());
    }

    /**
     * 测试获取当前行政区全部直属下级行政区
     * <p>若子行政区数目符合预期，则测试通过</p>
     *
     * @param id            当前行政区编号
     * @param childrenCount 预期子行政区数目
     */
    @ParameterizedTest
    @CsvSource({"2907,10", "2916,0"})
    void listChildren(Short id, int childrenCount) {
        List<AreaDO> areaDOList = areaDao.listChildren(id);
        assertEquals(childrenCount, areaDOList.size());
    }

}