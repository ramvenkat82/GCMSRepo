
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
    "description",
    "dnbCode"
})
public class FamilytreeRolesPlayed {

    @JsonProperty("description")
    private String description;
    @JsonProperty("dnbCode")
    private Integer dnbCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public FamilytreeRolesPlayed withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("dnbCode")
    public Integer getDnbCode() {
        return dnbCode;
    }

    @JsonProperty("dnbCode")
    public void setDnbCode(Integer dnbCode) {
        this.dnbCode = dnbCode;
    }

    public FamilytreeRolesPlayed withDnbCode(Integer dnbCode) {
        this.dnbCode = dnbCode;
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

    public FamilytreeRolesPlayed withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(dnbCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FamilytreeRolesPlayed) == false) {
            return false;
        }
        FamilytreeRolesPlayed rhs = ((FamilytreeRolesPlayed) other);
        return new EqualsBuilder().append(description, rhs.description).append(dnbCode, rhs.dnbCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
