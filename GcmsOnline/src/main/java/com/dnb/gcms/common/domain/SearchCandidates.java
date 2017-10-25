
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
    "displaySequence",
    "organization"
})
public class SearchCandidates {

    @JsonProperty("displaySequence")
    private Integer displaySequence;
    @JsonProperty("organization")
    private Organization organization;
    
    
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displaySequence")
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    @JsonProperty("displaySequence")
    public void setDisplaySequence(Integer displaySequence) {
        this.displaySequence = displaySequence;
    }

    public SearchCandidates withDisplaySequence(Integer displaySequence) {
        this.displaySequence = displaySequence;
        return this;
    }

    @JsonProperty("organization")
    public Organization getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public SearchCandidates withOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

   

}
