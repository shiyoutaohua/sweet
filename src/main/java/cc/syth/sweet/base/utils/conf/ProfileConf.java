package cc.syth.sweet.base.utils.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 应用范围配置信息
 * <p>加载profile.properties配置文件</p>
 *
 * @author 世有桃花
 * @since 2019/08/30
 */
@Component("profileProperties")
public final class ProfileConf {

    @Value("#{profile['res.server']}")
    private String resServer;

    @Value("#{profile['img.server']}")
    private String imgServer;

    @Value("#{profile['novel.server']}")
    private String novelServer;

    @Value("#{profile['video.server']}")
    private String videoServer;

    @Override
    public String toString() {
        return super.toString() + "@ProfileConf";
    }


    public String getResServer() {
        return resServer;
    }

    public String getImgServer() {
        return imgServer;
    }

    public String getNovelServer() {
        return novelServer;
    }

    public String getVideoServer() {
        return videoServer;
    }

}