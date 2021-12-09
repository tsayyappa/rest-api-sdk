
# Api Rest V2 Metadata Details Request

## Structure

`ApiRestV2MetadataDetailsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type9Enum`](/doc/models/type-9-enum.md) | Required | Type of the metadata object being searched. Valid values | Type9Enum getType() | setType(Type9Enum type) |
| `Id` | `List<String>` | Required | A JSON array of GUIDs of the objects. | List<String> getId() | setId(List<String> id) |
| `ShowHidden` | `Boolean` | Optional | When set to true, returns details of the hidden objects, such as a column in a worksheet or a table.<br>**Default**: `false` | Boolean getShowHidden() | setShowHidden(Boolean showHidden) |
| `DropQuestionDetails` | `Boolean` | Optional | When set to true, the search assist data associated with a worksheet is not included in the API response. This attribute is applicable only for LOGICAL_TABLE data type.<br>**Default**: `false` | Boolean getDropQuestionDetails() | setDropQuestionDetails(Boolean dropQuestionDetails) |
| `Version` | `String` | Optional | Specify the version to retrieve the objects from. By default, the API returns metadata for all versions of the object. | String getVersion() | setVersion(String version) |

## Example (as JSON)

```json
{
  "type": "DATAOBJECT",
  "id": [
    "id0"
  ],
  "showHidden": null,
  "dropQuestionDetails": null,
  "version": null
}
```
