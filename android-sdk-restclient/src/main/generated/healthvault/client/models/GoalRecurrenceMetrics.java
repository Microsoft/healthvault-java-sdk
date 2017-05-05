/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The recurrence metrics for a goal.
 */
public class GoalRecurrenceMetrics {
    /**
     * Specifies the recurrence window of the goal. Possible values include:
     * 'Unknown', 'Daily', 'Weekly', 'Monthly'.
     */
    @JsonProperty(value = "windowType")
    private String windowType;

    /**
     * Specifies the number of times the goal's target is intended to be
     * achieved in given window
     * For example, the goal "walk 5000 steps, 4 times per week" would be
     * represented as: a window of a "week", an occurrence count of 4, and a
     * goal target of 5000.
     */
    @JsonProperty(value = "occurrenceCount")
    private Integer occurrenceCount;

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
     * @return the GoalRecurrenceMetrics object itself.
     */
    public GoalRecurrenceMetrics withWindowType(String windowType) {
        this.windowType = windowType;
        return this;
    }

    /**
     * Get the occurrenceCount value.
     *
     * @return the occurrenceCount value
     */
    public Integer occurrenceCount() {
        return this.occurrenceCount;
    }

    /**
     * Set the occurrenceCount value.
     *
     * @param occurrenceCount the occurrenceCount value to set
     * @return the GoalRecurrenceMetrics object itself.
     */
    public GoalRecurrenceMetrics withOccurrenceCount(Integer occurrenceCount) {
        this.occurrenceCount = occurrenceCount;
        return this;
    }

}
