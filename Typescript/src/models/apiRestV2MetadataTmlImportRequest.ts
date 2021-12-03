/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, boolean, object, optional, Schema, string } from '../schema';
import { ImportPolicyEnum, importPolicyEnumSchema } from './importPolicyEnum';

export interface ApiRestV2MetadataTmlImportRequest {
  /** A JSON array of TML objects to upload, in YAML or JSON format. If in YAML format within the JSON array, use escape characters for YAML quotes, and new line characters when there is a new line */
  objectTML: string[];
  /** Policy to follow during import */
  importPolicy?: ImportPolicyEnum;
  /** Specifies if you are updating or creating objects. To create new objects, specify true. By default, ThoughtSpot updates existing objects that have the same GUID as the objects you are importing. When set to true, the GUID property in the imported TML is replaced on the server, and the response headers will include the id_guid property with the GUID of the new object. The new object will be assigned a new GUID, even if the imported TML file included a guid value. Thus, there is no need to include the guid in the TML file if you are using forceCreate=true. */
  forceCreate?: boolean;
}

export const apiRestV2MetadataTmlImportRequestSchema: Schema<ApiRestV2MetadataTmlImportRequest> = object(
  {
    objectTML: ['objectTML', array(string())],
    importPolicy: ['importPolicy', optional(importPolicyEnumSchema)],
    forceCreate: ['forceCreate', optional(boolean())],
  }
);