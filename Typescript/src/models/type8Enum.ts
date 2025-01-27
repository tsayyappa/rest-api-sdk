/**
 * ThoughtSpot Public REST APILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { Schema, stringEnum } from '../schema';

/**
 * Enum for Type8Enum
 */
export enum Type8Enum {
  UNKNOWN = 'UNKNOWN',
  LDAPUSER = 'LDAP_USER',
  SAMLUSER = 'SAML_USER',
  OIDCUSER = 'OIDC_USER',
  LOCALUSER = 'LOCAL_USER',
}

/**
 * Schema for Type8Enum
 */
export const type8EnumSchema: Schema<Type8Enum> = stringEnum(Type8Enum);
