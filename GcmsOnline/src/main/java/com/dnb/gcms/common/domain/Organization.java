
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
    "financials",
    "dunsControlStatus",
    "corporateLinkage",
    "businessEntityType",
    "duns",
    "primaryName",
    "telephone",
    "primaryAddress",
    "primaryIndustryCodes",
    "numberOfEmployees"
})
public class Organization {

    @JsonProperty("financials")
    private List<Financial> financials = new ArrayList<Financial>();
    @JsonProperty("dunsControlStatus")
    private DunsControlStatus dunsControlStatus;
    @JsonProperty("corporateLinkage")
    private CorporateLinkage corporateLinkage;
    @JsonProperty("businessEntityType")
    private BusinessEntityType businessEntityType;
    @JsonProperty("duns")
    private String duns;
    @JsonProperty("primaryName")
    private String primaryName;
    @JsonProperty("telephone")
    private List<Telephone> telephone = new ArrayList<Telephone>();
    @JsonProperty("primaryAddress")
    private PrimaryAddress primaryAddress;
    @JsonProperty("primaryIndustryCodes")
    private List<PrimaryIndustryCode> primaryIndustryCodes = new ArrayList<PrimaryIndustryCode>();
    @JsonProperty("numberOfEmployees")
    private List<NumberOfEmployee> numberOfEmployees = new ArrayList<NumberOfEmployee>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("financials")
    public List<Financial> getFinancials() {
        return financials;
    }

    @JsonProperty("financials")
    public void setFinancials(List<Financial> financials) {
        this.financials = financials;
    }

    public Organization withFinancials(List<Financial> financials) {
        this.financials = financials;
        return this;
    }

    @JsonProperty("dunsControlStatus")
    public DunsControlStatus getDunsControlStatus() {
        return dunsControlStatus;
    }

    @JsonProperty("dunsControlStatus")
    public void setDunsControlStatus(DunsControlStatus dunsControlStatus) {
        this.dunsControlStatus = dunsControlStatus;
    }

    public Organization withDunsControlStatus(DunsControlStatus dunsControlStatus) {
        this.dunsControlStatus = dunsControlStatus;
        return this;
    }

    @JsonProperty("corporateLinkage")
    public CorporateLinkage getCorporateLinkage() {
        return corporateLinkage;
    }

    @JsonProperty("corporateLinkage")
    public void setCorporateLinkage(CorporateLinkage corporateLinkage) {
        this.corporateLinkage = corporateLinkage;
    }

    public Organization withCorporateLinkage(CorporateLinkage corporateLinkage) {
        this.corporateLinkage = corporateLinkage;
        return this;
    }

    @JsonProperty("businessEntityType")
    public BusinessEntityType getBusinessEntityType() {
        return businessEntityType;
    }

    @JsonProperty("businessEntityType")
    public void setBusinessEntityType(BusinessEntityType businessEntityType) {
        this.businessEntityType = businessEntityType;
    }

    public Organization withBusinessEntityType(BusinessEntityType businessEntityType) {
        this.businessEntityType = businessEntityType;
        return this;
    }

    @JsonProperty("duns")
    public String getDuns() {
        return duns;
    }

    @JsonProperty("duns")
    public void setDuns(String duns) {
        this.duns = duns;
    }

    public Organization withDuns(String duns) {
        this.duns = duns;
        return this;
    }

    @JsonProperty("primaryName")
    public String getPrimaryName() {
        return primaryName;
    }

    @JsonProperty("primaryName")
    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }

    public Organization withPrimaryName(String primaryName) {
        this.primaryName = primaryName;
        return this;
    }

    @JsonProperty("telephone")
    public List<Telephone> getTelephone() {
        return telephone;
    }

    @JsonProperty("telephone")
    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    public Organization withTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
        return this;
    }

    @JsonProperty("primaryAddress")
    public PrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }

    @JsonProperty("primaryAddress")
    public void setPrimaryAddress(PrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public Organization withPrimaryAddress(PrimaryAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
        return this;
    }

    @JsonProperty("primaryIndustryCodes")
    public List<PrimaryIndustryCode> getPrimaryIndustryCodes() {
        return primaryIndustryCodes;
    }

    @JsonProperty("primaryIndustryCodes")
    public void setPrimaryIndustryCodes(List<PrimaryIndustryCode> primaryIndustryCodes) {
        this.primaryIndustryCodes = primaryIndustryCodes;
    }

    public Organization withPrimaryIndustryCodes(List<PrimaryIndustryCode> primaryIndustryCodes) {
        this.primaryIndustryCodes = primaryIndustryCodes;
        return this;
    }

    @JsonProperty("numberOfEmployees")
    public List<NumberOfEmployee> getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @JsonProperty("numberOfEmployees")
    public void setNumberOfEmployees(List<NumberOfEmployee> numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Organization withNumberOfEmployees(List<NumberOfEmployee> numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
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

    public Organization withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(financials).append(dunsControlStatus).append(corporateLinkage).append(businessEntityType).append(duns).append(primaryName).append(telephone).append(primaryAddress).append(primaryIndustryCodes).append(numberOfEmployees).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Organization) == false) {
            return false;
        }
        Organization rhs = ((Organization) other);
        return new EqualsBuilder().append(financials, rhs.financials).append(dunsControlStatus, rhs.dunsControlStatus).append(corporateLinkage, rhs.corporateLinkage).append(businessEntityType, rhs.businessEntityType).append(duns, rhs.duns).append(primaryName, rhs.primaryName).append(telephone, rhs.telephone).append(primaryAddress, rhs.primaryAddress).append(primaryIndustryCodes, rhs.primaryIndustryCodes).append(numberOfEmployees, rhs.numberOfEmployees).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
