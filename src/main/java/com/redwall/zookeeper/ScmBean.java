package com.redwall.zookeeper;

import org.apache.commons.lang3.StringUtils;

public class ScmBean {

    /**
     * 名称: PROPERTY
     */
    private String property;

    /**
     * propertyDesc
     */
    private String propertyDesc;

    /**
     * 键值: VALUE
     */
    private String value;

    /**
     * 描述: DESC
     */
    private String valueDesc;

    /**
     * 描述: SCM文件对应行的内容
     */
    private String configLine;

    /**
     * @return the property
     */
    public String getProperty() {
        return property;
    }

    /**
     * @param property the property to set
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * @return the propertyDesc
     */
    public String getPropertyDesc() {
        return propertyDesc;
    }

    /**
     * @param propertyDesc the propertyDesc to set
     */
    public void setPropertyDesc(String propertyDesc) {
        this.propertyDesc = propertyDesc;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the valueDesc
     */
    public String getValueDesc() {
        return valueDesc;
    }

    /**
     * @param valueDesc the valueDesc to set
     */
    public void setValueDesc(String valueDesc) {
        this.valueDesc = valueDesc;
    }

    /**
     * @return SCM文件配置项该行的内容
     */
    public String getConfigLine() {
        return configLine;
    }

    /**
     * @param configLine SCM文件配置项该行的内容
     */
    public void setConfigLine(String configLine) {
        if (StringUtils.isBlank(configLine)){
            this.configLine = "";
        }
        else{
            this.configLine = configLine.trim();
        }
    }

    /**
     * @return 根据操作方式和属性、取值生成的新的行
     */
    public String getBulidLine(Boolean flag) {
        if (flag) {
            return property + "=" + value;
        }
        return property;
    }

}
