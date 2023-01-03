/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for OrgsResponse type.
 */
public class OrgsResponse {
    private Integer orgId;
    private String orgName;
    private String description;
    private String allGroupUserId;
    private String defaultAdminUserGroupId;
    private Boolean active;

    /**
     * Default constructor.
     */
    public OrgsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  orgId  Integer value for orgId.
     * @param  orgName  String value for orgName.
     * @param  description  String value for description.
     * @param  allGroupUserId  String value for allGroupUserId.
     * @param  defaultAdminUserGroupId  String value for defaultAdminUserGroupId.
     * @param  active  Boolean value for active.
     */
    public OrgsResponse(
            Integer orgId,
            String orgName,
            String description,
            String allGroupUserId,
            String defaultAdminUserGroupId,
            Boolean active) {
        this.orgId = orgId;
        this.orgName = orgName;
        this.description = description;
        this.allGroupUserId = allGroupUserId;
        this.defaultAdminUserGroupId = defaultAdminUserGroupId;
        this.active = active;
    }

    /**
     * Getter for OrgId.
     * ID of the organization searched for
     * @return Returns the Integer
     */
    @JsonGetter("orgId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * Setter for OrgId.
     * ID of the organization searched for
     * @param orgId Value for Integer
     */
    @JsonSetter("orgId")
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * Getter for OrgName.
     * Name of the organization searched for
     * @return Returns the String
     */
    @JsonGetter("orgName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrgName() {
        return orgName;
    }

    /**
     * Setter for OrgName.
     * Name of the organization searched for
     * @param orgName Value for String
     */
    @JsonSetter("orgName")
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * Getter for Description.
     * Description associated with the organization
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description associated with the organization
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for AllGroupUserId.
     * GUID of the ALL group in the organization
     * @return Returns the String
     */
    @JsonGetter("allGroupUserId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAllGroupUserId() {
        return allGroupUserId;
    }

    /**
     * Setter for AllGroupUserId.
     * GUID of the ALL group in the organization
     * @param allGroupUserId Value for String
     */
    @JsonSetter("allGroupUserId")
    public void setAllGroupUserId(String allGroupUserId) {
        this.allGroupUserId = allGroupUserId;
    }

    /**
     * Getter for DefaultAdminUserGroupId.
     * GUID of the admin group in the organization
     * @return Returns the String
     */
    @JsonGetter("defaultAdminUserGroupId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefaultAdminUserGroupId() {
        return defaultAdminUserGroupId;
    }

    /**
     * Setter for DefaultAdminUserGroupId.
     * GUID of the admin group in the organization
     * @param defaultAdminUserGroupId Value for String
     */
    @JsonSetter("defaultAdminUserGroupId")
    public void setDefaultAdminUserGroupId(String defaultAdminUserGroupId) {
        this.defaultAdminUserGroupId = defaultAdminUserGroupId;
    }

    /**
     * Getter for Active.
     * Indicates if the organization is active or not
     * @return Returns the Boolean
     */
    @JsonGetter("active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * Indicates if the organization is active or not
     * @param active Value for Boolean
     */
    @JsonSetter("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Converts this OrgsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsResponse [" + "orgId=" + orgId + ", orgName=" + orgName + ", description="
                + description + ", allGroupUserId=" + allGroupUserId + ", defaultAdminUserGroupId="
                + defaultAdminUserGroupId + ", active=" + active + "]";
    }

    /**
     * Builds a new {@link OrgsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .orgId(getOrgId())
                .orgName(getOrgName())
                .description(getDescription())
                .allGroupUserId(getAllGroupUserId())
                .defaultAdminUserGroupId(getDefaultAdminUserGroupId())
                .active(getActive());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsResponse}.
     */
    public static class Builder {
        private Integer orgId;
        private String orgName;
        private String description;
        private String allGroupUserId;
        private String defaultAdminUserGroupId;
        private Boolean active;



        /**
         * Setter for orgId.
         * @param  orgId  Integer value for orgId.
         * @return Builder
         */
        public Builder orgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
         * Setter for orgName.
         * @param  orgName  String value for orgName.
         * @return Builder
         */
        public Builder orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for allGroupUserId.
         * @param  allGroupUserId  String value for allGroupUserId.
         * @return Builder
         */
        public Builder allGroupUserId(String allGroupUserId) {
            this.allGroupUserId = allGroupUserId;
            return this;
        }

        /**
         * Setter for defaultAdminUserGroupId.
         * @param  defaultAdminUserGroupId  String value for defaultAdminUserGroupId.
         * @return Builder
         */
        public Builder defaultAdminUserGroupId(String defaultAdminUserGroupId) {
            this.defaultAdminUserGroupId = defaultAdminUserGroupId;
            return this;
        }

        /**
         * Setter for active.
         * @param  active  Boolean value for active.
         * @return Builder
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * Builds a new {@link OrgsResponse} object using the set fields.
         * @return {@link OrgsResponse}
         */
        public OrgsResponse build() {
            return new OrgsResponse(orgId, orgName, description, allGroupUserId,
                    defaultAdminUserGroupId, active);
        }
    }
}