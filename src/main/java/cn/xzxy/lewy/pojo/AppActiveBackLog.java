package cn.xzxy.lewy.pojo;

/**
 * 用户后台活跃日志
 */
public class AppActiveBackLog {

    private String active_source;//1=upgrade,2=download(下载),3=plugin_upgrade

    public String getActive_source() {
        return active_source;
    }

    public void setActive_source(String active_source) {
        this.active_source = active_source;
    }
}
