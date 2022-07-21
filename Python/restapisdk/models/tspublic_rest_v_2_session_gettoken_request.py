# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.api_helper import APIHelper


class TspublicRestV2SessionGettokenRequest(object):

    """Implementation of the 'Tspublic Rest V2 Session Gettoken Request' model.

    TODO: type model description here.

    Attributes:
        user_name (string): Username of the user account
        password (string): The password of the user account
        secret_key (string): The secret key string provided by the ThoughtSpot
            application server. ThoughtSpot generates this secret key when you
            enable trusted authentication.
        access_level (GetTokenAccessLevelEnum): User access privilege.    FULL
            - Creates a session with full access.    REPORT_BOOK_VIEW - Allow
            view access to the specified visualizations.
        ts_object_id (string): GUID of the ThoughtSpot object. If you have set
            the accessLevel attribute to REPORT_BOOK_VIEW, specify the GUID of
            the Liveboard or visualization object.
        token_expiry_duration (string): Provide duration in seconds after
            which the token should expire
        org_id (string): This is applicable only if organization feature is
            enabled in the cluster.    Id of the organization to be associated
            with the user login. If no input is provided then last logged in
            organization will be considered.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "user_name": 'userName',
        "password": 'password',
        "secret_key": 'secretKey',
        "access_level": 'accessLevel',
        "ts_object_id": 'tsObjectId',
        "token_expiry_duration": 'tokenExpiryDuration',
        "org_id": 'orgId'
    }

    _optionals = [
        'password',
        'secret_key',
        'access_level',
        'ts_object_id',
        'token_expiry_duration',
        'org_id',
    ]

    def __init__(self,
                 user_name=None,
                 password=APIHelper.SKIP,
                 secret_key=APIHelper.SKIP,
                 access_level='FULL',
                 ts_object_id=APIHelper.SKIP,
                 token_expiry_duration=APIHelper.SKIP,
                 org_id=APIHelper.SKIP):
        """Constructor for the TspublicRestV2SessionGettokenRequest class"""

        # Initialize members of the class
        self.user_name = user_name 
        if password is not APIHelper.SKIP:
            self.password = password 
        if secret_key is not APIHelper.SKIP:
            self.secret_key = secret_key 
        self.access_level = access_level 
        if ts_object_id is not APIHelper.SKIP:
            self.ts_object_id = ts_object_id 
        if token_expiry_duration is not APIHelper.SKIP:
            self.token_expiry_duration = token_expiry_duration 
        if org_id is not APIHelper.SKIP:
            self.org_id = org_id 

    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object
            as obtained from the deserialization of the server's response. The
            keys MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary

        user_name = dictionary.get("userName") if dictionary.get("userName") else None
        password = dictionary.get("password") if dictionary.get("password") else APIHelper.SKIP
        secret_key = dictionary.get("secretKey") if dictionary.get("secretKey") else APIHelper.SKIP
        access_level = dictionary.get("accessLevel") if dictionary.get("accessLevel") else 'FULL'
        ts_object_id = dictionary.get("tsObjectId") if dictionary.get("tsObjectId") else APIHelper.SKIP
        token_expiry_duration = dictionary.get("tokenExpiryDuration") if dictionary.get("tokenExpiryDuration") else APIHelper.SKIP
        org_id = dictionary.get("orgId") if dictionary.get("orgId") else APIHelper.SKIP
        # Return an object of this model
        return cls(user_name,
                   password,
                   secret_key,
                   access_level,
                   ts_object_id,
                   token_expiry_duration,
                   org_id)
