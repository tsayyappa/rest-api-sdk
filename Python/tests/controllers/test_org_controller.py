# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

import json
import dateutil.parser

from tests.controllers.controller_test_base import ControllerTestBase
from tests.test_helper import TestHelper
from restapisdk.api_helper import APIHelper


class OrgControllerTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(OrgControllerTests, cls).setUpClass()
        cls.controller = cls.client.org
        cls.response_catcher = cls.controller.http_call_back

    # This is endpoint is applicable only if organization feature is enabled in the cluster. 
    #
    # To get the details of a specific organization by name or id, use this endpoint. 
    #
    # At least one value needed. When both are given,then id will be considered to fetch organization information. 
    #
    # Requires Administration privilege for tenant.
    def test_get_org(self):
        # Parameters for the API call
        name = None
        id = None

        # Perform the API call through the SDK function
        result = self.controller.get_org(name, id)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


    # This is endpoint is applicable only if organization feature is enabled in the cluster. 
    #
    # To remove an organization from the ThoughtSpot system, send a DELETE request to this endpoint. 
    #
    # At least one value is needed. When both id and name are given, then id will be considered. 
    #
    # Requires Administration privilege for tenant.
    def test_delete_org(self):
        # Parameters for the API call
        name = None
        id = None

        # Perform the API call through the SDK function
        result = self.controller.delete_org(name, id)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


