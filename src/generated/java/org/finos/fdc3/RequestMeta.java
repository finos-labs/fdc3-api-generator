
package org.finos.fdc3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requestGuid",
    "timestamp",
    "source",
    "destination"
})
public class RequestMeta {

    /**
     * Unique GUID for the request
     * (Required)
     * 
     */
    @JsonProperty("requestGuid")
    @JsonPropertyDescription("Unique GUID for the request")
    private String requestGuid;
    /**
     * Timestamp at which request or response was generated
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp at which request or response was generated")
    private Date timestamp;
    /**
     * Field that represents the source application that the request was received from.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Field that represents the source application that the request was received from.")
    private Object source;
    /**
     * Optional field that represents the destination that the request should be routed to. Must be set by the Desktop Agent for API calls that include a target app parameter and must include the name of the Desktop Agent hosting the target application.
     * 
     */
    @JsonProperty("destination")
    @JsonPropertyDescription("Optional field that represents the destination that the request should be routed to. Must be set by the Desktop Agent for API calls that include a target app parameter and must include the name of the Desktop Agent hosting the target application.")
    private Object destination;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Unique GUID for the request
     * (Required)
     * 
     */
    @JsonProperty("requestGuid")
    public String getRequestGuid() {
        return requestGuid;
    }

    /**
     * Unique GUID for the request
     * (Required)
     * 
     */
    @JsonProperty("requestGuid")
    public void setRequestGuid(String requestGuid) {
        this.requestGuid = requestGuid;
    }

    /**
     * Timestamp at which request or response was generated
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp at which request or response was generated
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Field that represents the source application that the request was received from.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Field that represents the source application that the request was received from.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    /**
     * Optional field that represents the destination that the request should be routed to. Must be set by the Desktop Agent for API calls that include a target app parameter and must include the name of the Desktop Agent hosting the target application.
     * 
     */
    @JsonProperty("destination")
    public Object getDestination() {
        return destination;
    }

    /**
     * Optional field that represents the destination that the request should be routed to. Must be set by the Desktop Agent for API calls that include a target app parameter and must include the name of the Desktop Agent hosting the target application.
     * 
     */
    @JsonProperty("destination")
    public void setDestination(Object destination) {
        this.destination = destination;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequestMeta.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requestGuid");
        sb.append('=');
        sb.append(((this.requestGuid == null)?"<null>":this.requestGuid));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.requestGuid == null)? 0 :this.requestGuid.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestMeta) == false) {
            return false;
        }
        RequestMeta rhs = ((RequestMeta) other);
        return ((((((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination)))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.requestGuid == rhs.requestGuid)||((this.requestGuid!= null)&&this.requestGuid.equals(rhs.requestGuid))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
