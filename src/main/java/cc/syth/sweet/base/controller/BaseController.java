package cc.syth.sweet.base.controller;

import cc.syth.sweet.base.entity.index.LogoutIndexVO;
import cc.syth.sweet.base.utils.conf.ProfileConf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 公共模块控制器
 * <p>转发公共请求</p>
 *
 * @author 世有桃花
 * @since 2019/08/30
 */
@Controller("baseController")
public final class BaseController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    private ProfileConf profileConf;

    @Autowired
    public BaseController(ProfileConf profileConf) {
        this.profileConf = profileConf;
    }

    @GetMapping("/")
    public String toIndex(Model model) {
        LogoutIndexVO logoutIndexVO = new LogoutIndexVO();
        logoutIndexVO.setResServer(this.profileConf.getResServer());
        logoutIndexVO.setImgServer(this.profileConf.getImgServer());
        model.addAttribute("logoutIndexVO", logoutIndexVO);
        return "base/index";
    }

}