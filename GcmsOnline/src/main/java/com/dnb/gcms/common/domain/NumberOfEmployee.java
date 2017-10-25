
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
    "informationScopeDnBCode",
    "informationScopeDescription",
    "reliabilityDnBCode",
    "value",
    "reliabilityDescription"
})
public class NumberOfEmployee {

    @JsonProperty("informationScopeDnBCode")
    private Integer informationScopeDnBCode;
    @JsonProperty("informationScopeDescription")
    private String informationScopeDescription;
    @JsonProperty("reliabilityDnBCode")
    private Integer reliabilityDnBCode;
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("reliabilityDescription")
    private String reliabilityDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("informationScopeDnBCode")
    public Integer getInformationScopeDnBCode() {
        return informationScopeDnBCode;
    }

    @JsonProperty("informationScopeDnBCode")
    public void setInformationScopeDnBCode(Integer informationScopeDnBCode) {
        this.informationScopeDnBCode = informationScopeDnBCode;
    }

    public NumberOfEmployee withInformationScopeDnBCode(Integer informationScopeDnBCode) {
        this.informationScopeDnBCode = informationScopeDnBCode;
        return this;
    }

    @JsonProperty("informationScopeDescription")
    public String getInformationScopeDescription() {
        return informationScopeDescription;
    }

    @JsonProperty("informationScopeDescription")
    public void setInformationScopeDescription(String informationScopeDescription) {
        this.informationScopeDescription = informationScopeDescription;
    }

    public NumberOfEmployee withInformationScopeDescription(String informationScopeDescription) {
        this.informationScopeDescription = informationScopeDescription;
        return this;
    }

    @JsonProperty("reliabilityDnBCode")
    public Integer getReliabilityDnBCode() {
        return reliabilityDnBCode;
    }

    @JsonProperty("reliabilityDnBCode")
    public void setReliabilityDnBCode(Integer reliabilityDnBCode) {
        this.reliabilityDnBCode = reliabilityDnBCode;
    }

    public NumberOfEmployee withReliabilityDnBCode(Integer reliabilityDnBCode) {
        this.reliabilityDnBCode = reliabilityDnBCode;
        return this;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    public NumberOfEmployee withValue(Integer value) {
        this.value = value;
        return this;
    }

    @JsonProperty("reliabilityDescription")
    public String getReliabilityDescription() {
        return reliabilityDescription;
    }

    @JsonProperty("reliabilityDescription")
    public void setReliabilityDescription(String reliabilityDescription) {
        this.reliabilityDescription = reliabilityDescription;
    }

    public NumberOfEmployee withReliabilityDescription(String reliabilityDescription) {
        this.reliabilityDescription = reliabilityDescription;
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

    public NumberOfEmployee withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(informationScopeDnBCode).append(informationScopeDescription).append(reliabilityDnBCode).append(value).append(reliabilityDescription).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NumberOfEmployee) == false) {
            return false;
        }
        NumberOfEmployee rhs = ((NumberOfEmployee) other);
        return new EqualsBuilder().append(informationScopeDnBCode, rhs.informationScopeDnBCode).append(informationScopeDescription, rhs.informationScopeDescription).append(reliabilityDnBCode, rhs.reliabilityDnBCode).append(value, rhs.value).append(reliabilityDescription, rhs.reliabilityDescription).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
