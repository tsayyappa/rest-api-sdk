/**
 * RESTAPI SDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

import { array, object, optional, Schema, string } from '../schema';
import {
  ShareObjectIncludeCustomEmbedUrlEnum,
  shareObjectIncludeCustomEmbedUrlEnumSchema,
} from './shareObjectIncludeCustomEmbedUrlEnum';
import {
  ShareObjectNotifyEnum,
  shareObjectNotifyEnumSchema,
} from './shareObjectNotifyEnum';
import {
  ShareObjectTypeEnum,
  shareObjectTypeEnumSchema,
} from './shareObjectTypeEnum';

export interface TspublicRestV2SecurityShareTsobjectRequest {
  /** Type of metadata object */
  type: ShareObjectTypeEnum;
  /** A JSON array of the GUIDs of the objects to be shared */
  id: string[];
  /**
   * A JSON object with GUIDs of user and user group, and the type of access privilge.
   *  You can provide READ_ONLY or MODIFY access to the objects. With READ_ONLY access, the user or user group can view the shared object, whereas MODIFY access enables users to modify the object.
   *  To remove access to a shared object, you can set the shareMode in the permission string to NO_ACCESS. Example:
   *  {"permissions": {"e7040a64-7ff1-4ab9-a1b0-f1acac596866": {"shareMode": "READ_ONLY"}, "f7b8f511-317c-485d-8131-26cf084ef47b": {"shareMode": "MODIFY"}, "7a9a6715-e154-431b-baaf-7b58246c13dd":{"shareMode":"NO_ACCESS"}}}
   */
  permission: string;
  /** The email addresses that should ne notified when the objects are shared. */
  emailId?: string[];
  /** When set to true, a notification is sent to the users after an object is shared. */
  notify?: ShareObjectNotifyEnum;
  /** The message text to send in the notification email */
  message?: string;
  /** When set to true, ThoughtSpot sends a link with the host application context to allow users to access the shared object from their ThoughtSpot embedded instance. */
  includeCustomEmbedUrl?: ShareObjectIncludeCustomEmbedUrlEnum;
}

export const tspublicRestV2SecurityShareTsobjectRequestSchema: Schema<TspublicRestV2SecurityShareTsobjectRequest> = object(
  {
    type: ['type', shareObjectTypeEnumSchema],
    id: ['id', array(string())],
    permission: ['permission', string()],
    emailId: ['emailId', optional(array(string()))],
    notify: ['notify', optional(shareObjectNotifyEnumSchema)],
    message: ['message', optional(string())],
    includeCustomEmbedUrl: [
      'includeCustomEmbedUrl',
      optional(shareObjectIncludeCustomEmbedUrlEnumSchema),
    ],
  }
);