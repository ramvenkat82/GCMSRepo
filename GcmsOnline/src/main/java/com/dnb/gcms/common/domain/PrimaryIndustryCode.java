
package com.dnb.gcms.common.domain;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "usSicV4",
    "usSicV4Description"
})
public class PrimaryIndustryCode {

    @JsonProperty("usSicV4")
    private String usSicV4;
    @JsonProperty("usSicV4Description")
    private String usSicV4Description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("usSicV4")
    public String getUsSicV4() {
        return usSicV4;
    }

    @JsonProperty("usSicV4")
    public void setUsSicV4(String usSicV4) {
        this.usSicV4 = usSicV4;
    }

    public PrimaryIndustryCode withUsSicV4(String usSicV4) {
        this.usSicV4 = usSicV4;
        return this;
    }

    @JsonProperty("usSicV4Description")
    public String getUsSicV4Description() {
        return usSicV4Description;
    }

    @JsonProperty("usSicV4Description")
    public void setUsSicV4Description(String usSicV4Description) {
        this.usSicV4Description = usSicV4Description;
    }

    public PrimaryIndustryCode withUsSicV4Description(String usSicV4Description) {
        this.usSicV4Description = usSicV4Description;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PrimaryIndustryCode withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(usSicV4).append(usSicV4Description).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrimaryIndustryCode) == false) {
            return false;
        }
        PrimaryIndustryCode rhs = ((PrimaryIndustryCode) other);
        return new EqualsBuilder().append(usSicV4, rhs.usSicV4).append(usSicV4Description, rhs.usSicV4Description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
