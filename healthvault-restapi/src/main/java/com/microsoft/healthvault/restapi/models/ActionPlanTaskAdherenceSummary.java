/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.util.List;

/**
 * An adherence summary for a task in an action plan.
 */
public class ActionPlanTaskAdherenceSummary {
    /**
     * The Id of the task.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the task.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The recurrence type of the schedule window. Possible values include:
     * 'Unknown', 'None', 'Daily', 'Weekly'.
     */
    @JsonProperty(value = "windowType")
    private String windowType;

    /**
     * The starting date of the task or the start date requested, whichever is
     * later.
     */
    @JsonProperty(value = "startDate")
    private DateTime startDate;

    /**
     * The ending date of the task or the end date requested, whichever is
     * earlier.
     */
    @JsonProperty(value = "endDate")
    private DateTime endDate;

    /**
     * A list of weekly adherence summaries.
     */
    @JsonProperty(value = "weeklyAdherence")
    private List<WeeklyAdherenceSummary> weeklyAdherence;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ActionPlanTaskAdherenceSummary object itself.
     */
    public ActionPlanTaskAdherenceSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ActionPlanTaskAdherenceSummary object itself.
     */
    public ActionPlanTaskAdherenceSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the windowType value.
     *
     * @return the windowType value
     */
    public String windowType() {
        return this.windowType;
    }

    /**
     * Set the windowType value.
     *
     * @param windowType the windowType value to set
     * @return the ActionPlanTaskAdherenceSummary object itself.
     */
    public ActionPlanTaskAdherenceSummary withWindowType(String windowType) {
        this.windowType = windowType;
        return this;
    }

    /**
     * Get the startDate value.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate value.
     *
     * @param startDate the startDate value to set
     * @return the ActionPlanTaskAdherenceSummary object itself.
     */
    public ActionPlanTaskAdherenceSummary withStartDate(DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate value.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate value.
     *
     * @param endDate the endDate value to set
     * @return the ActionPlanTaskAdherenceSummary object itself.
     */
    public ActionPlanTaskAdherenceSummary withEndDate(DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the weeklyAdherence value.
     *
     * @return the weeklyAdherence value
     */
    public List<WeeklyAdherenceSummary> weeklyAdherence() {
        return this.weeklyAdherence;
    }

    /**
     * Set the weeklyAdherence value.
     *
     * @param weeklyAdherence the weeklyAdherence value to set
     * @return the ActionPlanTaskAdherenceSummary object itself.
     */
    public ActionPlanTaskAdherenceSummary withWeeklyAdherence(List<WeeklyAdherenceSummary> weeklyAdherence) {
        this.weeklyAdherence = weeklyAdherence;
        return this;
    }

}
