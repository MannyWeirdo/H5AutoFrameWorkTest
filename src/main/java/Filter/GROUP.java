package Filter;

import ToolFactory.ConfigUtil;

public enum GROUP {
    HOME("Home"),
    COMPANY("Company"),
    PAYMENT("Payment"),
    FUNCTION("Function"),
    NEWS("News"),
    COOPERACTIVE("Cooperactive"),
    ABOUT("About");

    public String group;

    GROUP(String group) {
        this.group = group;
    }

    public static String getCurrentGroup() {
        return ConfigUtil.getConfigUtil().getConfigFileContent("Group");
    }

    public String getGroup() {
        return group;
    }
}
