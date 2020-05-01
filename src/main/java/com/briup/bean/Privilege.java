package com.briup.bean;

public class Privilege {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_privilege.id
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_privilege.name
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_privilege.description
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_privilege.route
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    private String route;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_privilege.type
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_privilege.icon
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_privilege.parent_id
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    private Integer parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_privilege.id
     *
     * @return the value of cms_privilege.id
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_privilege.id
     *
     * @param id the value for cms_privilege.id
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_privilege.name
     *
     * @return the value of cms_privilege.name
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_privilege.name
     *
     * @param name the value for cms_privilege.name
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_privilege.description
     *
     * @return the value of cms_privilege.description
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_privilege.description
     *
     * @param description the value for cms_privilege.description
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_privilege.route
     *
     * @return the value of cms_privilege.route
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public String getRoute() {
        return route;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_privilege.route
     *
     * @param route the value for cms_privilege.route
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_privilege.type
     *
     * @return the value of cms_privilege.type
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_privilege.type
     *
     * @param type the value for cms_privilege.type
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_privilege.icon
     *
     * @return the value of cms_privilege.icon
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_privilege.icon
     *
     * @param icon the value for cms_privilege.icon
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_privilege.parent_id
     *
     * @return the value of cms_privilege.parent_id
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_privilege.parent_id
     *
     * @param parentId the value for cms_privilege.parent_id
     *
     * @mbg.generated Fri Nov 15 17:32:47 CST 2019
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}