/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TspublicRestV2OrgSearchRequest type.
 */
public class TspublicRestV2OrgSearchRequest {
    private String name;
    private String id;
    private SearchOrgsShowDeletedEnum showDeleted;

    /**
     * Default constructor.
     */
    public TspublicRestV2OrgSearchRequest() {
        showDeleted = SearchOrgsShowDeletedEnum.ENUM_FALSE;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  showDeleted  SearchOrgsShowDeletedEnum value for showDeleted.
     */
    public TspublicRestV2OrgSearchRequest(
            String name,
            String id,
            SearchOrgsShowDeletedEnum showDeleted) {
        this.name = name;
        this.id = id;
        this.showDeleted = showDeleted;
    }

    /**
     * Getter for Name.
     * Name of the organization.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the organization.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * The ID of the organization.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the organization.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for ShowDeleted.
     * When set to true, the response will include the details of deleted organization also.
     * @return Returns the SearchOrgsShowDeletedEnum
     */
    @JsonGetter("showDeleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchOrgsShowDeletedEnum getShowDeleted() {
        return showDeleted;
    }

    /**
     * Setter for ShowDeleted.
     * When set to true, the response will include the details of deleted organization also.
     * @param showDeleted Value for SearchOrgsShowDeletedEnum
     */
    @JsonSetter("showDeleted")
    public void setShowDeleted(SearchOrgsShowDeletedEnum showDeleted) {
        this.showDeleted = showDeleted;
    }

    /**
     * Converts this TspublicRestV2OrgSearchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2OrgSearchRequest [" + "name=" + name + ", id=" + id + ", showDeleted="
                + showDeleted + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2OrgSearchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2OrgSearchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId())
                .showDeleted(getShowDeleted());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2OrgSearchRequest}.
     */
    public static class Builder {
        private String name;
        private String id;
        private SearchOrgsShowDeletedEnum showDeleted = SearchOrgsShowDeletedEnum.ENUM_FALSE;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for showDeleted.
         * @param  showDeleted  SearchOrgsShowDeletedEnum value for showDeleted.
         * @return Builder
         */
        public Builder showDeleted(SearchOrgsShowDeletedEnum showDeleted) {
            this.showDeleted = showDeleted;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2OrgSearchRequest} object using the set fields.
         * @return {@link TspublicRestV2OrgSearchRequest}
         */
        public TspublicRestV2OrgSearchRequest build() {
            return new TspublicRestV2OrgSearchRequest(name, id, showDeleted);
        }
    }
}
