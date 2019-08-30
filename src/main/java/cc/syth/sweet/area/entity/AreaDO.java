package cc.syth.sweet.area.entity;

/**
 * 行政区数据对象
 * <p>对应数据表area</p>
 *
 * @author 世有桃花
 * @since 2019/08/30
 */
public final class AreaDO {

    /**
     * 行政区编号
     */
    private Short id;

    /**
     * 行政区名
     */
    private String name;

    /**
     * 行政区级别
     */
    private Byte level;

    /**
     * 上级行政区编号
     */
    private Short parentId;

    @Override
    public String toString() {
        return "@AreaDo";
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

}