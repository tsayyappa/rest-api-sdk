/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { ApiResponse, RequestOptions } from '../core';
import { ErrorResponseError } from '../errors/errorResponseError';
import {
  AdminsyncPrincipalResponse,
  adminsyncPrincipalResponseSchema,
} from '../models/adminsyncPrincipalResponse';
import {
  TspublicRestV2AdminAssignauthorRequest,
  tspublicRestV2AdminAssignauthorRequestSchema,
} from '../models/tspublicRestV2AdminAssignauthorRequest';
import {
  TspublicRestV2AdminChangeauthorRequest,
  tspublicRestV2AdminChangeauthorRequestSchema,
} from '../models/tspublicRestV2AdminChangeauthorRequest';
import {
  TspublicRestV2AdminConfigurationUpdateRequest,
  tspublicRestV2AdminConfigurationUpdateRequestSchema,
} from '../models/tspublicRestV2AdminConfigurationUpdateRequest';
import {
  TspublicRestV2AdminForcelogoutRequest,
  tspublicRestV2AdminForcelogoutRequestSchema,
} from '../models/tspublicRestV2AdminForcelogoutRequest';
import {
  TspublicRestV2AdminResetpasswordRequest,
  tspublicRestV2AdminResetpasswordRequestSchema,
} from '../models/tspublicRestV2AdminResetpasswordRequest';
import {
  TspublicRestV2AdminSyncprincipalRequest,
  tspublicRestV2AdminSyncprincipalRequestSchema,
} from '../models/tspublicRestV2AdminSyncprincipalRequest';
import { boolean, unknown } from '../schema';
import { BaseController } from './baseController';

export class AdminController extends BaseController {
  /**
   * To get details of the current configuration of a Thoughtspot cluster, use this endpoint.
   *
   * Permission: Requires administration privilege
   *
   * @return Response from the API call
   */
  async getClusterConfig(
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest(
      'GET',
      '/tspublic/rest/v2/admin/configuration'
    );
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * To get the details of overrides to the Thoughtspot cluster configuration, use this endpoint.
   *
   * Permission: Requires administration privilege
   *
   * @return Response from the API call
   */
  async getClusterConfigOverrides(
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<unknown>> {
    const req = this.createRequest(
      'GET',
      '/tspublic/rest/v2/admin/configuration/overrides'
    );
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(unknown(), requestOptions);
  }

  /**
   * To update the Thoughtspot cluster configuration, use this endpoint.
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async updateClusterConfig(
    body: TspublicRestV2AdminConfigurationUpdateRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'PUT',
      '/tspublic/rest/v2/admin/configuration/update'
    );
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2AdminConfigurationUpdateRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To reset the password of a ThoughtSpot user account, use this endpoint.
   *
   * It is mandatory to use Authorization header with token of a user with admin access to successfully
   * run this endpoint.
   *
   * At least one of User Id or username is mandatory. When both are given, then user id will be
   * considered.
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async resetUserPassword(
    body: TspublicRestV2AdminResetpasswordRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'PUT',
      '/tspublic/rest/v2/admin/resetpassword'
    );
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2AdminResetpasswordRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To programmatically synchronize user accounts and user groups from external system with ThoughtSpot,
   * use this endpoint.
   *
   * The payload takes principals containing all users and groups present in the external system.
   *
   * The users and user groups in Thoughtspot get updated for any matching inputs.
   *
   * Any user and user group present in the input, but not present in the cluster, gets created in
   * cluster.
   * n You can optionally choose to delete the user and groups from the cluster, that are not present in
   * the input.
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async syncPrincipal(
    body: TspublicRestV2AdminSyncprincipalRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<AdminsyncPrincipalResponse>> {
    const req = this.createRequest(
      'PUT',
      '/tspublic/rest/v2/admin/syncprincipal'
    );
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2AdminSyncprincipalRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(adminsyncPrincipalResponseSchema, requestOptions);
  }

  /**
   * To programmatically change the author of one or several objects from one user account to another,
   * use this endpoint.
   *
   * You might want to change the author of objects from one user to another active user, when the
   * account is removed from the ThoughtSpot application.
   *
   * Permission: Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async changeAuthorOfObjects(
    body: TspublicRestV2AdminChangeauthorRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'PUT',
      '/tspublic/rest/v2/admin/changeauthor'
    );
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2AdminChangeauthorRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To programmatically assign an author to one or several objects, use this endpoint.
   *
   * Provide either user name or id as input. When both are given user id will be considered.
   *
   * Requires administration privilege.
   *
   * @param body
   * @return Response from the API call
   */
  async assignAuthorToObjects(
    body: TspublicRestV2AdminAssignauthorRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'PUT',
      '/tspublic/rest/v2/admin/assignauthor'
    );
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2AdminAssignauthorRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }

  /**
   * To logout one or more users from logged in session, use this endpoint. If no input is provided then
   * all logged in users are force logged out.
   *
   * Requires administration privilege
   *
   * @param body
   * @return Response from the API call
   */
  async forceLogoutUsers(
    body: TspublicRestV2AdminForcelogoutRequest,
    requestOptions?: RequestOptions
  ): Promise<ApiResponse<boolean>> {
    const req = this.createRequest(
      'POST',
      '/tspublic/rest/v2/admin/forcelogout'
    );
    const mapped = req.prepareArgs({
      body: [body, tspublicRestV2AdminForcelogoutRequestSchema],
    });
    req.header('Content-Type', 'application/json');
    req.json(mapped.body);
    req.throwOn(500, ErrorResponseError, 'Operation failed or unauthorized request');
    return req.callAsJson(boolean(), requestOptions);
  }
}
