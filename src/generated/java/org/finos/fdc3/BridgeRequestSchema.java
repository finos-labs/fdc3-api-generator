
package org.finos.fdc3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * bridgeRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "payload",
    "meta"
})
public class BridgeRequestSchema {

    /**
     * Identifies the type of the message and it is typically set to the FDC3 function name that the message relates to, e.g. 'findIntent', with 'Request' appended.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Identifies the type of the message and it is typically set to the FDC3 function name that the message relates to, e.g. 'findIntent', with 'Request' appended.")
    private String type;
    /**
     * The message payload typically contains the arguments to FDC3 API functions.
     * (Required)
     * 
     */
    @JsonProperty("payload")
    @JsonPropertyDescription("The message payload typically contains the arguments to FDC3 API functions.")
    private Payload payload;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meta")
    private RequestMeta meta;

    /**
     * Identifies the type of the message and it is typically set to the FDC3 function name that the message relates to, e.g. 'findIntent', with 'Request' appended.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Identifies the type of the message and it is typically set to the FDC3 function name that the message relates to, e.g. 'findIntent', with 'Request' appended.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The message payload typically contains the arguments to FDC3 API functions.
     * (Required)
     * 
     */
    @JsonProperty("payload")
    public Payload getPayload() {
        return payload;
    }

    /**
     * The message payload typically contains the arguments to FDC3 API functions.
     * (Required)
     * 
     */
    @JsonProperty("payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meta")
    public RequestMeta getMeta() {
        return meta;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("meta")
    public void setMeta(RequestMeta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BridgeRequestSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BridgeRequestSchema) == false) {
            return false;
        }
        BridgeRequestSchema rhs = ((BridgeRequestSchema) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))));
    }

}
