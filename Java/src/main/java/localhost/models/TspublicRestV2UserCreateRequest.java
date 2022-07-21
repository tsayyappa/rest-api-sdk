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
 * This is a model class for TspublicRestV2UserCreateRequest type.
 */
public class TspublicRestV2UserCreateRequest {
    private String name;
    private String displayName;
    private CreateUserVisibilityEnum visibility;
    private String mail;
    private String password;
    private OrgInput org;
    private List<GroupNameAndIDInput> groups;
    private CreateUserStateEnum state;
    private CreateUserNotifyOnShareEnum notifyOnShare;
    private CreateUserShowWalkMeEnum showWalkMe;
    private CreateUserAnalystOnboardingCompleteEnum analystOnboardingComplete;
    private CreateUserTypeEnum type;

    /**
     * Default constructor.
     */
    public TspublicRestV2UserCreateRequest() {
        visibility = CreateUserVisibilityEnum.DEFAULT;
        state = CreateUserStateEnum.ACTIVE;
        notifyOnShare = CreateUserNotifyOnShareEnum.ENUM_TRUE;
        showWalkMe = CreateUserShowWalkMeEnum.ENUM_TRUE;
        analystOnboardingComplete = CreateUserAnalystOnboardingCompleteEnum.ENUM_FALSE;
        type = CreateUserTypeEnum.LOCAL_USER;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  displayName  String value for displayName.
     * @param  password  String value for password.
     * @param  visibility  CreateUserVisibilityEnum value for visibility.
     * @param  mail  String value for mail.
     * @param  org  OrgInput value for org.
     * @param  groups  List of GroupNameAndIDInput value for groups.
     * @param  state  CreateUserStateEnum value for state.
     * @param  notifyOnShare  CreateUserNotifyOnShareEnum value for notifyOnShare.
     * @param  showWalkMe  CreateUserShowWalkMeEnum value for showWalkMe.
     * @param  analystOnboardingComplete  CreateUserAnalystOnboardingCompleteEnum value for
     *         analystOnboardingComplete.
     * @param  type  CreateUserTypeEnum value for type.
     */
    public TspublicRestV2UserCreateRequest(
            String name,
            String displayName,
            String password,
            CreateUserVisibilityEnum visibility,
            String mail,
            OrgInput org,
            List<GroupNameAndIDInput> groups,
            CreateUserStateEnum state,
            CreateUserNotifyOnShareEnum notifyOnShare,
            CreateUserShowWalkMeEnum showWalkMe,
            CreateUserAnalystOnboardingCompleteEnum analystOnboardingComplete,
            CreateUserTypeEnum type) {
        this.name = name;
        this.displayName = displayName;
        this.visibility = visibility;
        this.mail = mail;
        this.password = password;
        this.org = org;
        this.groups = groups;
        this.state = state;
        this.notifyOnShare = notifyOnShare;
        this.showWalkMe = showWalkMe;
        this.analystOnboardingComplete = analystOnboardingComplete;
        this.type = type;
    }

    /**
     * Getter for Name.
     * Name of the user account. The username string must be unique.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the user account. The username string must be unique.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for DisplayName.
     * A display name string for the user, usually their first and last name.
     * @return Returns the String
     */
    @JsonGetter("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for DisplayName.
     * A display name string for the user, usually their first and last name.
     * @param displayName Value for String
     */
    @JsonSetter("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for Visibility.
     * Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The
     * DEFAULT attribute makes a user visible to other users and user groups, and thus allows them
     * to share objects.
     * @return Returns the CreateUserVisibilityEnum
     */
    @JsonGetter("visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateUserVisibilityEnum getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * Visibility of the user. The visibility attribute is set to DEFAULT when creating a user. The
     * DEFAULT attribute makes a user visible to other users and user groups, and thus allows them
     * to share objects.
     * @param visibility Value for CreateUserVisibilityEnum
     */
    @JsonSetter("visibility")
    public void setVisibility(CreateUserVisibilityEnum visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for Mail.
     * Email id associated with the user account
     * @return Returns the String
     */
    @JsonGetter("mail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMail() {
        return mail;
    }

    /**
     * Setter for Mail.
     * Email id associated with the user account
     * @param mail Value for String
     */
    @JsonSetter("mail")
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Getter for Password.
     * Password for the user account.
     * @return Returns the String
     */
    @JsonGetter("password")
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * Password for the user account.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for Org.
     * This is applicable only if organization feature is enabled in the cluster. A JSON object of
     * organization name, id or both, in which the object should be created. When both are given
     * then id is considered. If no value is provided then object will be created in the
     * organization associated with the login session.
     * @return Returns the OrgInput
     */
    @JsonGetter("org")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrgInput getOrg() {
        return org;
    }

    /**
     * Setter for Org.
     * This is applicable only if organization feature is enabled in the cluster. A JSON object of
     * organization name, id or both, in which the object should be created. When both are given
     * then id is considered. If no value is provided then object will be created in the
     * organization associated with the login session.
     * @param org Value for OrgInput
     */
    @JsonSetter("org")
    public void setOrg(OrgInput org) {
        this.org = org;
    }

    /**
     * Getter for Groups.
     * A JSON array of group names or GUIDs or both. When both are given then id is considered
     * @return Returns the List of GroupNameAndIDInput
     */
    @JsonGetter("groups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GroupNameAndIDInput> getGroups() {
        return groups;
    }

    /**
     * Setter for Groups.
     * A JSON array of group names or GUIDs or both. When both are given then id is considered
     * @param groups Value for List of GroupNameAndIDInput
     */
    @JsonSetter("groups")
    public void setGroups(List<GroupNameAndIDInput> groups) {
        this.groups = groups;
    }

    /**
     * Getter for State.
     * Status of user account. acitve or inactive.
     * @return Returns the CreateUserStateEnum
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateUserStateEnum getState() {
        return state;
    }

    /**
     * Setter for State.
     * Status of user account. acitve or inactive.
     * @param state Value for CreateUserStateEnum
     */
    @JsonSetter("state")
    public void setState(CreateUserStateEnum state) {
        this.state = state;
    }

    /**
     * Getter for NotifyOnShare.
     * User preference for receiving email notifications when another ThoughtSpot user shares
     * answers or pinboards.
     * @return Returns the CreateUserNotifyOnShareEnum
     */
    @JsonGetter("notifyOnShare")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateUserNotifyOnShareEnum getNotifyOnShare() {
        return notifyOnShare;
    }

    /**
     * Setter for NotifyOnShare.
     * User preference for receiving email notifications when another ThoughtSpot user shares
     * answers or pinboards.
     * @param notifyOnShare Value for CreateUserNotifyOnShareEnum
     */
    @JsonSetter("notifyOnShare")
    public void setNotifyOnShare(CreateUserNotifyOnShareEnum notifyOnShare) {
        this.notifyOnShare = notifyOnShare;
    }

    /**
     * Getter for ShowWalkMe.
     * The user preference for revisiting the onboarding experience.
     * @return Returns the CreateUserShowWalkMeEnum
     */
    @JsonGetter("showWalkMe")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateUserShowWalkMeEnum getShowWalkMe() {
        return showWalkMe;
    }

    /**
     * Setter for ShowWalkMe.
     * The user preference for revisiting the onboarding experience.
     * @param showWalkMe Value for CreateUserShowWalkMeEnum
     */
    @JsonSetter("showWalkMe")
    public void setShowWalkMe(CreateUserShowWalkMeEnum showWalkMe) {
        this.showWalkMe = showWalkMe;
    }

    /**
     * Getter for AnalystOnboardingComplete.
     * ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding
     * experience leads users through a set of actions to help users get started and accomplish
     * their tasks quickly. The users can turn off the Onboarding experience and access it again
     * when they need assistance with the ThoughtSpot UI.
     * @return Returns the CreateUserAnalystOnboardingCompleteEnum
     */
    @JsonGetter("analystOnboardingComplete")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateUserAnalystOnboardingCompleteEnum getAnalystOnboardingComplete() {
        return analystOnboardingComplete;
    }

    /**
     * Setter for AnalystOnboardingComplete.
     * ThoughtSpot provides an interactive guided walkthrough to onboard new users. The onboarding
     * experience leads users through a set of actions to help users get started and accomplish
     * their tasks quickly. The users can turn off the Onboarding experience and access it again
     * when they need assistance with the ThoughtSpot UI.
     * @param analystOnboardingComplete Value for CreateUserAnalystOnboardingCompleteEnum
     */
    @JsonSetter("analystOnboardingComplete")
    public void setAnalystOnboardingComplete(CreateUserAnalystOnboardingCompleteEnum analystOnboardingComplete) {
        this.analystOnboardingComplete = analystOnboardingComplete;
    }

    /**
     * Getter for Type.
     * Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot
     * system.
     * @return Returns the CreateUserTypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateUserTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of user. LOCAL_USER indicates that the user is created locally in the ThoughtSpot
     * system.
     * @param type Value for CreateUserTypeEnum
     */
    @JsonSetter("type")
    public void setType(CreateUserTypeEnum type) {
        this.type = type;
    }

    /**
     * Converts this TspublicRestV2UserCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2UserCreateRequest [" + "name=" + name + ", displayName=" + displayName
                + ", password=" + password + ", visibility=" + visibility + ", mail=" + mail
                + ", org=" + org + ", groups=" + groups + ", state=" + state + ", notifyOnShare="
                + notifyOnShare + ", showWalkMe=" + showWalkMe + ", analystOnboardingComplete="
                + analystOnboardingComplete + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2UserCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2UserCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, displayName, password)
                .visibility(getVisibility())
                .mail(getMail())
                .org(getOrg())
                .groups(getGroups())
                .state(getState())
                .notifyOnShare(getNotifyOnShare())
                .showWalkMe(getShowWalkMe())
                .analystOnboardingComplete(getAnalystOnboardingComplete())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2UserCreateRequest}.
     */
    public static class Builder {
        private String name;
        private String displayName;
        private String password;
        private CreateUserVisibilityEnum visibility = CreateUserVisibilityEnum.DEFAULT;
        private String mail;
        private OrgInput org;
        private List<GroupNameAndIDInput> groups;
        private CreateUserStateEnum state = CreateUserStateEnum.ACTIVE;
        private CreateUserNotifyOnShareEnum notifyOnShare = CreateUserNotifyOnShareEnum.ENUM_TRUE;
        private CreateUserShowWalkMeEnum showWalkMe = CreateUserShowWalkMeEnum.ENUM_TRUE;
        private CreateUserAnalystOnboardingCompleteEnum analystOnboardingComplete =
                CreateUserAnalystOnboardingCompleteEnum.ENUM_FALSE;
        private CreateUserTypeEnum type = CreateUserTypeEnum.LOCAL_USER;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  displayName  String value for displayName.
         * @param  password  String value for password.
         */
        public Builder(String name, String displayName, String password) {
            this.name = name;
            this.displayName = displayName;
            this.password = password;
        }

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
         * Setter for displayName.
         * @param  displayName  String value for displayName.
         * @return Builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Setter for visibility.
         * @param  visibility  CreateUserVisibilityEnum value for visibility.
         * @return Builder
         */
        public Builder visibility(CreateUserVisibilityEnum visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Setter for mail.
         * @param  mail  String value for mail.
         * @return Builder
         */
        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        /**
         * Setter for org.
         * @param  org  OrgInput value for org.
         * @return Builder
         */
        public Builder org(OrgInput org) {
            this.org = org;
            return this;
        }

        /**
         * Setter for groups.
         * @param  groups  List of GroupNameAndIDInput value for groups.
         * @return Builder
         */
        public Builder groups(List<GroupNameAndIDInput> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  CreateUserStateEnum value for state.
         * @return Builder
         */
        public Builder state(CreateUserStateEnum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for notifyOnShare.
         * @param  notifyOnShare  CreateUserNotifyOnShareEnum value for notifyOnShare.
         * @return Builder
         */
        public Builder notifyOnShare(CreateUserNotifyOnShareEnum notifyOnShare) {
            this.notifyOnShare = notifyOnShare;
            return this;
        }

        /**
         * Setter for showWalkMe.
         * @param  showWalkMe  CreateUserShowWalkMeEnum value for showWalkMe.
         * @return Builder
         */
        public Builder showWalkMe(CreateUserShowWalkMeEnum showWalkMe) {
            this.showWalkMe = showWalkMe;
            return this;
        }

        /**
         * Setter for analystOnboardingComplete.
         * @param  analystOnboardingComplete  CreateUserAnalystOnboardingCompleteEnum value for
         *         analystOnboardingComplete.
         * @return Builder
         */
        public Builder analystOnboardingComplete(
                CreateUserAnalystOnboardingCompleteEnum analystOnboardingComplete) {
            this.analystOnboardingComplete = analystOnboardingComplete;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  CreateUserTypeEnum value for type.
         * @return Builder
         */
        public Builder type(CreateUserTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2UserCreateRequest} object using the set fields.
         * @return {@link TspublicRestV2UserCreateRequest}
         */
        public TspublicRestV2UserCreateRequest build() {
            return new TspublicRestV2UserCreateRequest(name, displayName, password, visibility,
                    mail, org, groups, state, notifyOnShare, showWalkMe, analystOnboardingComplete,
                    type);
        }
    }
}
