
# Api Rest V2 Connection Addtable Request

## Structure

`ApiRestV2ConnectionAddtableRequest`

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `string` | Required | GUID of the connection |
| `tables` | [`AddTableInput[]`](/doc/models/add-table-input.md) | Required | A JSON array of table details |

## Example (as JSON)

```json
{
  "id": "id0",
  "tables": [
    {
      "name": "name4",
      "dbName": "dbName2",
      "schemaName": "schemaName8",
      "columns": [
        {
          "name": "name4",
          "dataType": "dataType6"
        },
        {
          "name": "name3",
          "dataType": "dataType5"
        }
      ]
    },
    {
      "name": "name5",
      "dbName": "dbName3",
      "schemaName": "schemaName9",
      "columns": [
        {
          "name": "name5",
          "dataType": "dataType7"
        }
      ]
    }
  ]
}
```
