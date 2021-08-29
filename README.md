# FHIR - JSON Parser

### Libraries:
1. Spring Framework
2. H2database
3. Hapi-Fhir


This is an API service to transform a regular json payload to a valid fhir structure, right now it icnludes the creation for patients and organizations.

Example (Patient Json payload)

```json
{
    "active": true,
    "identifier_system": "urn:oid:2.16.840.1.113883.2.4.6.3",
    "identifier_value": "738472983",
    "identifier_use": "usual",
    "family": "hernandez",
    "given": "roberto",
    "suffix": "Mr",
    "telecom_value": "456456465",
    "gender": "Male",
    "birthdate": "1992-10-24",
    "language": "Spanish",
    "email": "jose@gmail.com",
    "middle_name":"Perez",
    "deceased": false,
    "address_line": "street1",
    "address_line_2": "street1",
    "address_city": "LA",
    "address_country": "US",
    "address_postal": "4564654",
    "address_state":"california"
}
```

Example response (Patient)

```json
{
    "resourceType": "Patient",
    "language": "Spanish",
    "identifier": [
        {
            "system": "urn:oid:2.16.840.1.113883.2.4.6.3",
            "value": "738472983"
        },
        {
            "system": "Birth Certificate Number"
        },
        {
            "system": "Social Security Number"
        },
        {
            "system": "Driver License Number"
        }
    ],
    "active": true,
    "name": [
        {
            "family": "hernandez",
            "given": [
                "roberto",
                "Perez"
            ],
            "suffix": [
                "Mr"
            ]
        }
    ],
    "telecom": [
        {
            "system": "phone",
            "value": "456456465"
        },
        {
            "system": "email",
            "value": "jose@gmail.com"
        }
    ],
    "gender": "male",
    "birthDate": "1992-10-24",
    "address": [
        {
            "use": "home",
            "line": [
                "street1",
                "street1"
            ]
        },
        {
            "city": "LA"
        },
        {
            "state": "california"
        },
        {
            "postalCode": "4564654"
        },
        {
            "city": "LA"
        }
    ]
}
```