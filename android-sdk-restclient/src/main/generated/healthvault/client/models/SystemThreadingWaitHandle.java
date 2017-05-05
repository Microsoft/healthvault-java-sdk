/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SystemThreadingWaitHandle model.
 */
public class SystemThreadingWaitHandle {
    /**
     * The handle property.
     */
    @JsonProperty(value = "handle")
    private Object handle;

    /**
     * The safeWaitHandle property.
     */
    @JsonProperty(value = "safeWaitHandle")
    private MicrosoftWin32SafeHandlesSafeWaitHandle safeWaitHandle;

    /**
     * Get the handle value.
     *
     * @return the handle value
     */
    public Object handle() {
        return this.handle;
    }

    /**
     * Set the handle value.
     *
     * @param handle the handle value to set
     * @return the SystemThreadingWaitHandle object itself.
     */
    public SystemThreadingWaitHandle withHandle(Object handle) {
        this.handle = handle;
        return this;
    }

    /**
     * Get the safeWaitHandle value.
     *
     * @return the safeWaitHandle value
     */
    public MicrosoftWin32SafeHandlesSafeWaitHandle safeWaitHandle() {
        return this.safeWaitHandle;
    }

    /**
     * Set the safeWaitHandle value.
     *
     * @param safeWaitHandle the safeWaitHandle value to set
     * @return the SystemThreadingWaitHandle object itself.
     */
    public SystemThreadingWaitHandle withSafeWaitHandle(MicrosoftWin32SafeHandlesSafeWaitHandle safeWaitHandle) {
        this.safeWaitHandle = safeWaitHandle;
        return this;
    }

}
