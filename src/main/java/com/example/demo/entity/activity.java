package com.example.demo.entity;

public class activity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_id
     *
     * @mbggenerated
     */
    private Integer activityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_name
     *
     * @mbggenerated
     */
    private String activityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_content
     *
     * @mbggenerated
     */
    private String activityContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_number
     *
     * @mbggenerated
     */
    private Integer activityNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_id
     *
     * @return the value of activity.activity_id
     *
     * @mbggenerated
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_id
     *
     * @param activityId the value for activity.activity_id
     *
     * @mbggenerated
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_name
     *
     * @return the value of activity.activity_name
     *
     * @mbggenerated
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_name
     *
     * @param activityName the value for activity.activity_name
     *
     * @mbggenerated
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_content
     *
     * @return the value of activity.activity_content
     *
     * @mbggenerated
     */
    public String getActivityContent() {
        return activityContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_content
     *
     * @param activityContent the value for activity.activity_content
     *
     * @mbggenerated
     */
    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_number
     *
     * @return the value of activity.activity_number
     *
     * @mbggenerated
     */
    public Integer getActivityNumber() {
        return activityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_number
     *
     * @param activityNumber the value for activity.activity_number
     *
     * @mbggenerated
     */
    public void setActivityNumber(Integer activityNumber) {
        this.activityNumber = activityNumber;
    }
}