/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TspublicRestV2SecurityShareTsobjectRequest type.
 */
public class TspublicRestV2SecurityShareTsobjectRequest {
    private ShareObjectTypeEnum type;
    private List<String> id;
    private String permission;
    private List<String> emailId;
    private ShareObjectNotifyEnum notify;
    private String message;
    private ShareObjectIncludeCustomEmbedUrlEnum includeCustomEmbedUrl;

    /**
     * Default constructor.
     */
    public TspublicRestV2SecurityShareTsobjectRequest() {
        notify = ShareObjectNotifyEnum.ENUM_TRUE;
        includeCustomEmbedUrl = ShareObjectIncludeCustomEmbedUrlEnum.ENUM_FALSE;
    }

    /**
     * Initialization constructor.
     * @param  type  ShareObjectTypeEnum value for type.
     * @param  id  List of String value for id.
     * @param  permission  String value for permission.
     * @param  emailId  List of String value for emailId.
     * @param  notify  ShareObjectNotifyEnum value for notify.
     * @param  message  String value for message.
     * @param  includeCustomEmbedUrl  ShareObjectIncludeCustomEmbedUrlEnum value for
     *         includeCustomEmbedUrl.
     */
    public TspublicRestV2SecurityShareTsobjectRequest(
            ShareObjectTypeEnum type,
            List<String> id,
            String permission,
            List<String> emailId,
            ShareObjectNotifyEnum notify,
            String message,
            ShareObjectIncludeCustomEmbedUrlEnum includeCustomEmbedUrl) {
        this.type = type;
        this.id = id;
        this.permission = permission;
        this.emailId = emailId;
        this.notify = notify;
        this.message = message;
        this.includeCustomEmbedUrl = includeCustomEmbedUrl;
    }

    /**
     * Getter for Type.
     * Type of metadata object
     * @return Returns the ShareObjectTypeEnum
     */
    @JsonGetter("type")
    public ShareObjectTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of metadata object
     * @param type Value for ShareObjectTypeEnum
     */
    @JsonSetter("type")
    public void setType(ShareObjectTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * A JSON array of the GUIDs of the objects to be shared
     * @return Returns the List of String
     */
    @JsonGetter("id")
    public List<String> getId() {
        return id;
    }

    /**
     * Setter for Id.
     * A JSON array of the GUIDs of the objects to be shared
     * @param id Value for List of String
     */
    @JsonSetter("id")
    public void setId(List<String> id) {
        this.id = id;
    }

    /**
     * Getter for Permission.
     * A JSON object with GUIDs of user and user group, and the type of access privilge. You can
     * provide READ_ONLY or MODIFY access to the objects. With READ_ONLY access, the user or user
     * group can view the shared object, whereas MODIFY access enables users to modify the object.
     * To remove access to a shared object, you can set the shareMode in the permission string to
     * NO_ACCESS. Example: {"permissions": {"e7040a64-7ff1-4ab9-a1b0-f1acac596866": {"shareMode":
     * "READ_ONLY"}, "f7b8f511-317c-485d-8131-26cf084ef47b": {"shareMode": "MODIFY"},
     * "7a9a6715-e154-431b-baaf-7b58246c13dd":{"shareMode":"NO_ACCESS"}}}
     * @return Returns the String
     */
    @JsonGetter("permission")
    public String getPermission() {
        return permission;
    }

    /**
     * Setter for Permission.
     * A JSON object with GUIDs of user and user group, and the type of access privilge. You can
     * provide READ_ONLY or MODIFY access to the objects. With READ_ONLY access, the user or user
     * group can view the shared object, whereas MODIFY access enables users to modify the object.
     * To remove access to a shared object, you can set the shareMode in the permission string to
     * NO_ACCESS. Example: {"permissions": {"e7040a64-7ff1-4ab9-a1b0-f1acac596866": {"shareMode":
     * "READ_ONLY"}, "f7b8f511-317c-485d-8131-26cf084ef47b": {"shareMode": "MODIFY"},
     * "7a9a6715-e154-431b-baaf-7b58246c13dd":{"shareMode":"NO_ACCESS"}}}
     * @param permission Value for String
     */
    @JsonSetter("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Getter for EmailId.
     * The email addresses that should ne notified when the objects are shared.
     * @return Returns the List of String
     */
    @JsonGetter("emailId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getEmailId() {
        return emailId;
    }

    /**
     * Setter for EmailId.
     * The email addresses that should ne notified when the objects are shared.
     * @param emailId Value for List of String
     */
    @JsonSetter("emailId")
    public void setEmailId(List<String> emailId) {
        this.emailId = emailId;
    }

    /**
     * Getter for Notify.
     * When set to true, a notification is sent to the users after an object is shared.
     * @return Returns the ShareObjectNotifyEnum
     */
    @JsonGetter("notify")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShareObjectNotifyEnum getNotify() {
        return notify;
    }

    /**
     * Setter for Notify.
     * When set to true, a notification is sent to the users after an object is shared.
     * @param notify Value for ShareObjectNotifyEnum
     */
    @JsonSetter("notify")
    public void setNotify(ShareObjectNotifyEnum notify) {
        this.notify = notify;
    }

    /**
     * Getter for Message.
     * The message text to send in the notification email
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * The message text to send in the notification email
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for IncludeCustomEmbedUrl.
     * When set to true, ThoughtSpot sends a link with the host application context to allow users
     * to access the shared object from their ThoughtSpot embedded instance.
     * @return Returns the ShareObjectIncludeCustomEmbedUrlEnum
     */
    @JsonGetter("includeCustomEmbedUrl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShareObjectIncludeCustomEmbedUrlEnum getIncludeCustomEmbedUrl() {
        return includeCustomEmbedUrl;
    }

    /**
     * Setter for IncludeCustomEmbedUrl.
     * When set to true, ThoughtSpot sends a link with the host application context to allow users
     * to access the shared object from their ThoughtSpot embedded instance.
     * @param includeCustomEmbedUrl Value for ShareObjectIncludeCustomEmbedUrlEnum
     */
    @JsonSetter("includeCustomEmbedUrl")
    public void setIncludeCustomEmbedUrl(ShareObjectIncludeCustomEmbedUrlEnum includeCustomEmbedUrl) {
        this.includeCustomEmbedUrl = includeCustomEmbedUrl;
    }

    /**
     * Converts this TspublicRestV2SecurityShareTsobjectRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2SecurityShareTsobjectRequest [" + "type=" + type + ", id=" + id
                + ", permission=" + permission + ", emailId=" + emailId + ", notify=" + notify
                + ", message=" + message + ", includeCustomEmbedUrl=" + includeCustomEmbedUrl + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2SecurityShareTsobjectRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2SecurityShareTsobjectRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, id, permission)
                .emailId(getEmailId())
                .notify(getNotify())
                .message(getMessage())
                .includeCustomEmbedUrl(getIncludeCustomEmbedUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2SecurityShareTsobjectRequest}.
     */
    public static class Builder {
        private ShareObjectTypeEnum type;
        private List<String> id;
        private String permission;
        private List<String> emailId;
        private ShareObjectNotifyEnum notify = ShareObjectNotifyEnum.ENUM_TRUE;
        private String message;
        private ShareObjectIncludeCustomEmbedUrlEnum includeCustomEmbedUrl =
                ShareObjectIncludeCustomEmbedUrlEnum.ENUM_FALSE;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  ShareObjectTypeEnum value for type.
         * @param  id  List of String value for id.
         * @param  permission  String value for permission.
         */
        public Builder(ShareObjectTypeEnum type, List<String> id, String permission) {
            this.type = type;
            this.id = id;
            this.permission = permission;
        }

        /**
         * Setter for type.
         * @param  type  ShareObjectTypeEnum value for type.
         * @return Builder
         */
        public Builder type(ShareObjectTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  List of String value for id.
         * @return Builder
         */
        public Builder id(List<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for permission.
         * @param  permission  String value for permission.
         * @return Builder
         */
        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        /**
         * Setter for emailId.
         * @param  emailId  List of String value for emailId.
         * @return Builder
         */
        public Builder emailId(List<String> emailId) {
            this.emailId = emailId;
            return this;
        }

        /**
         * Setter for notify.
         * @param  notify  ShareObjectNotifyEnum value for notify.
         * @return Builder
         */
        public Builder notify(ShareObjectNotifyEnum notify) {
            this.notify = notify;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for includeCustomEmbedUrl.
         * @param  includeCustomEmbedUrl  ShareObjectIncludeCustomEmbedUrlEnum value for
         *         includeCustomEmbedUrl.
         * @return Builder
         */
        public Builder includeCustomEmbedUrl(
                ShareObjectIncludeCustomEmbedUrlEnum includeCustomEmbedUrl) {
            this.includeCustomEmbedUrl = includeCustomEmbedUrl;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2SecurityShareTsobjectRequest} object using the set
         * fields.
         * @return {@link TspublicRestV2SecurityShareTsobjectRequest}
         */
        public TspublicRestV2SecurityShareTsobjectRequest build() {
            return new TspublicRestV2SecurityShareTsobjectRequest(type, id, permission, emailId,
                    notify, message, includeCustomEmbedUrl);
        }
    }
}