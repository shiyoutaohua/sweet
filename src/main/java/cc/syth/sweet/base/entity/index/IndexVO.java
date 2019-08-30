package cc.syth.sweet.base.entity.index;

/**
 * 主页数据对象
 * <p>封装控制器向主页传递的数据，主页分为登录状态和登出状态，所以此类可继承。</p>
 *
 * @author 世有桃花
 * @since 2019/08/30
 */
public class IndexVO {

    /**
     * 站点静态资源服务器，其值应该来自类ProfileConf
     */
    private String resServer;

    /**
     * 图片服务器，其值应该来自类ProfileConf
     */
    private String imgServer;

    /**
     * 写作服务器，其值应该来自类ProfileConf
     */
    private String novelServer;

    /**
     * 视频服务器，其值应该来自类ProfileConf
     */
    private String videoServer;

    @Override
    public String toString() {
        return "@IndexVO";
    }

    public String getResServer() {
        return resServer;
    }

    public void setResServer(String resServer) {
        this.resServer = resServer;
    }

    public String getImgServer() {
        return imgServer;
    }

    public void setImgServer(String imgServer) {
        this.imgServer = imgServer;
    }

    public String getNovelServer() {
        return novelServer;
    }

    public void setNovelServer(String novelServer) {
        this.novelServer = novelServer;
    }

    public String getVideoServer() {
        return videoServer;
    }

    public void setVideoServer(String videoServer) {
        this.videoServer = videoServer;
    }

}