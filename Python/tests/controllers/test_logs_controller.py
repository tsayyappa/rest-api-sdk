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


class LogsControllerTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(LogsControllerTests, cls).setUpClass()
        cls.controller = cls.client.logs
        cls.response_catcher = cls.controller.http_call_back

    # Note: This endpoint is applicable only for SAAS deployments. 
    #
    # The ThoughtSpot log streaming service API allows you to programmatically get a security audit event log from the ThoughtSpot system.  
    #
    # ThoughtSpot cloud deployments allow you to collect security audit events and send them to your Security information and event management (SIEM) application in real-time. 
    #
    # These events can help your security operations personnel to detect potential security threats or compromised user accounts in your organization. 
    #
    # Permission: Requires administration privilege.
    def test_get_log_events(self):
        # Parameters for the API call
        topic = 'security_logs'
        from_epoch = None
        to_epoch = None

        # Perform the API call through the SDK function
        result = self.controller.get_log_events(topic, from_epoch, to_epoch)

        # Test response code
        self.assertEquals(self.response_catcher.response.status_code, 200)

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        self.assertTrue(TestHelper.match_headers(expected_headers, self.response_catcher.response.headers))


