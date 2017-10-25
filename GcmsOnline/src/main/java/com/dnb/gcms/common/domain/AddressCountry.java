
package com.dnb.gcms.common.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isoAlpha2Code"
})
public class AddressCountry {

    @JsonProperty("isoAlpha2Code")
    private String isoAlpha2Code;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isoAlpha2Code")
    public String getIsoAlpha2Code() {
        return isoAlpha2Code;
    }

    @JsonProperty("isoAlpha2Code")
    public void setIsoAlpha2Code(String isoAlpha2Code) {
        this.isoAlpha2Code = isoAlpha2Code;
    }

    public AddressCountry withIsoAlpha2Code(String isoAlpha2Code) {
        this.isoAlpha2Code = isoAlpha2Code;
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

    public AddressCountry withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isoAlpha2Code).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddressCountry) == false) {
            return false;
        }
        AddressCountry rhs = ((AddressCountry) other);
        return new EqualsBuilder().append(isoAlpha2Code, rhs.isoAlpha2Code).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
