/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, lazy, object, optional, Schema, string } from '../schema';
import {
  ConnectionTableSchema,
  connectionTableSchemaSchema,
} from './connectionTableSchema';

export interface ConnectionDatabaseType {
  /** Name of the database */
  name?: string;
  /** List of schemas */
  schema?: ConnectionTableSchema[];
}

export const connectionDatabaseTypeSchema: Schema<ConnectionDatabaseType> = object(
  {
    name: ['name', optional(string())],
    schema: [
      'schema',
      optional(array(lazy(() => connectionTableSchemaSchema))),
    ],
  }
);