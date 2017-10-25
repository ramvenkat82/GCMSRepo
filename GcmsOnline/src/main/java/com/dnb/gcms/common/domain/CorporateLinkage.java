
package com.dnb.gcms.common.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "isBranch",
    "globalUltimateFamilyTreeMembersCount",
    "familytreeRolesPlayed"
})
public class CorporateLinkage {

    @JsonProperty("isBranch")
    private Boolean isBranch;
    @JsonProperty("globalUltimateFamilyTreeMembersCount")
    private Integer globalUltimateFamilyTreeMembersCount;
    @JsonProperty("familytreeRolesPlayed")
    private List<FamilytreeRolesPlayed> familytreeRolesPlayed = new ArrayList<FamilytreeRolesPlayed>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isBranch")
    public Boolean getIsBranch() {
        return isBranch;
    }

    @JsonProperty("isBranch")
    public void setIsBranch(Boolean isBranch) {
        this.isBranch = isBranch;
    }

    public CorporateLinkage withIsBranch(Boolean isBranch) {
        this.isBranch = isBranch;
        return this;
    }

    @JsonProperty("globalUltimateFamilyTreeMembersCount")
    public Integer getGlobalUltimateFamilyTreeMembersCount() {
        return globalUltimateFamilyTreeMembersCount;
    }

    @JsonProperty("globalUltimateFamilyTreeMembersCount")
    public void setGlobalUltimateFamilyTreeMembersCount(Integer globalUltimateFamilyTreeMembersCount) {
        this.globalUltimateFamilyTreeMembersCount = globalUltimateFamilyTreeMembersCount;
    }

    public CorporateLinkage withGlobalUltimateFamilyTreeMembersCount(Integer globalUltimateFamilyTreeMembersCount) {
        this.globalUltimateFamilyTreeMembersCount = globalUltimateFamilyTreeMembersCount;
        return this;
    }

    @JsonProperty("familytreeRolesPlayed")
    public List<FamilytreeRolesPlayed> getFamilytreeRolesPlayed() {
        return familytreeRolesPlayed;
    }

    @JsonProperty("familytreeRolesPlayed")
    public void setFamilytreeRolesPlayed(List<FamilytreeRolesPlayed> familytreeRolesPlayed) {
        this.familytreeRolesPlayed = familytreeRolesPlayed;
    }

    public CorporateLinkage withFamilytreeRolesPlayed(List<FamilytreeRolesPlayed> familytreeRolesPlayed) {
        this.familytreeRolesPlayed = familytreeRolesPlayed;
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

    public CorporateLinkage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isBranch).append(globalUltimateFamilyTreeMembersCount).append(familytreeRolesPlayed).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CorporateLinkage) == false) {
            return false;
        }
        CorporateLinkage rhs = ((CorporateLinkage) other);
        return new EqualsBuilder().append(isBranch, rhs.isBranch).append(globalUltimateFamilyTreeMembersCount, rhs.globalUltimateFamilyTreeMembersCount).append(familytreeRolesPlayed, rhs.familytreeRolesPlayed).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
